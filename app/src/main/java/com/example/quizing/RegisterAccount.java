package com.example.quizing;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterAccount extends AppCompatActivity {
    private TextInputEditText regName, regEmail, regPassword, regConfirmPassword;
    private Button regButton;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register_account);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Assigning variables views
        regName = findViewById(R.id.regName);
        regEmail = findViewById(R.id.regEmail);
        regPassword = findViewById(R.id.regPassword);
        regButton = findViewById(R.id.regButton);
        regConfirmPassword = findViewById(R.id.regConfirmPassword);
        firebaseAuth = FirebaseAuth.getInstance();

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = regName.getText().toString();
                String email = regEmail.getText().toString();
                String password = regPassword.getText().toString();
                String confirmPassword = regConfirmPassword.getText().toString();

                if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty() && !confirmPassword.isEmpty() && password.equals(confirmPassword)){
                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(RegisterAccount.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(RegisterAccount.this, "Registration success",Toast.LENGTH_SHORT).show();

                                SharedPreferences sharedPreferences = getSharedPreferences("forloginactivity",MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putBoolean("loggedINN",false);
                                editor.apply();

                                Intent intentForReturningToLogin = new Intent(RegisterAccount.this,MainLogin.class);
                                intentForReturningToLogin.putExtra("loginNeeded",true);
                                intentForReturningToLogin.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intentForReturningToLogin);
                                finish();

                            }else{
                                Toast.makeText(RegisterAccount.this,"Registration Failed",Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                }else{
                    if(name.isEmpty()) {
                        regName.setError("Fill username");
                    } else if (email.isEmpty()) {
                        regEmail.setError("Fill email");
                    } else if (password.isEmpty()) {
                        regPassword.setError("Fill password");
                    } else if (password != confirmPassword) {
                        regConfirmPassword.setError("Didn't match to password");
                    } else{
                        regName.setError("Fill name");
                        regEmail.setError("Fill Email");
                        regPassword.setError("Fill password");
                    }
                }

            }
        });


    }
}