package com.example.quizing;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainLogin extends AppCompatActivity {
    private FirebaseAuth logauth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initializing firebase variables
        FirebaseApp.initializeApp(this);
        logauth = FirebaseAuth.getInstance();

        //Binding Views with variables
        TextInputEditText emailEdi = findViewById(R.id.email_Edi);
        TextInputEditText passwordEdi = findViewById(R.id.password_edi);
        Button loginButton = findViewById(R.id.loginButton);
        TextView clickToRegisterButton = findViewById(R.id.clickToRegisterButton);
        clickToRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForRegistration = new Intent(MainLogin.this, RegisterAccount.class);
                startActivity(intentForRegistration);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = emailEdi.getText().toString();
                String password = passwordEdi.getText().toString();
//                Log.d("passwordss",username+" "+password);
                if(!username.isEmpty() && !password.isEmpty()){
                    logauth.signInWithEmailAndPassword(username,password).addOnCompleteListener(MainLogin.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                SharedPreferences sharedPreferences = getSharedPreferences("forloginactivity",MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putBoolean("loggedINN",true);
                                editor.apply();
                                intent();
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
                else{
                    if(username.isEmpty()) {
                        emailEdi.setError("Fill username");
                    } else if (password.isEmpty()) {
                        passwordEdi.setError("Fill password");
                    } else{
                        emailEdi.setError("Fill username");
                        passwordEdi.setError("Fill password");
                    }
                }


            }
        });


    }
    private void intent() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        SharedPreferences sharedPreferences = getSharedPreferences("forloginactivity",MODE_PRIVATE);
        boolean loggedIn = sharedPreferences.getBoolean("loggedINN",false);

        boolean loginNeeded = getIntent().getBooleanExtra("loginNeeded",false);

        FirebaseUser user = logauth.getCurrentUser();
        if (!loginNeeded && user!=null && loggedIn){
            Intent intent2 = new Intent(MainLogin.this,MainActivity.class);
            startActivity(intent2);
            finish();
        }

    }
}