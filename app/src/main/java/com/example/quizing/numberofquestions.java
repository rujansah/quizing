package com.example.quizing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class numberofquestions extends AppCompatActivity {
    private Button start;
    private TextView text2;
    private ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_numberofquestions);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        start = findViewById(R.id.start);
        text2 = findViewById(R.id.text2);
        back = findViewById(R.id.back);

        NumberPicker numberPicker = findViewById(R.id.numberOfQuestions);

        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(20);

        Intent intent = getIntent();
        String category = intent.getStringExtra("category");
        text2.setText(category);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberofquestions = numberPicker.getValue();

                Intent intent1 = new Intent(numberofquestions.this,playarea.class);
                intent1.putExtra("numberOfQuestions",numberofquestions);
                intent1.putExtra("whichCategory",category);
                startActivity(intent1);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}