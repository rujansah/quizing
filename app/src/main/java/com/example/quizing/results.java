package com.example.quizing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class results extends AppCompatActivity {
    private TextView scoreText;
    int result = 0;
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_results);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        scoreText = findViewById(R.id.scoreText);
        back = findViewById(R.id.back);
        Bundle bundlefromprevious = getIntent().getExtras();

        ArrayList<inputs> userinputfromintent = (ArrayList<inputs>) bundlefromprevious.getSerializable("userinputsarray");
        ArrayList<question_model> loadedquestionfromintent = (ArrayList<question_model>) bundlefromprevious.getSerializable("loadedquestions");



        try {
            for (int i=0;i<loadedquestionfromintent.size();i++){
                if (userinputfromintent.get(i).getWhichoption().equals(loadedquestionfromintent.get(i).getCorrectAnswer())){
                    result++;
                }
            }
            scoreText.setText(String.valueOf(result+" out of "+loadedquestionfromintent.size()+" questions"));
        }catch (Exception e){
            Log.d("eeff",e.toString());
        }


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(results.this, MainActivity.class);
                startActivity(intent);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(results.this, MainActivity.class);
        startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        finish();
    }
}