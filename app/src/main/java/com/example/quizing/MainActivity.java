package com.example.quizing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.NumberPicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private CheckBox BoxCprogramming, BoxPythonprogramming, BoxJavaprogramming, BoxNodejs, BoxHtml, BoxKotlin, BoxPhp, BoxJavascript;
    private Button next;
    private String whichCategory = "None";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        BoxCprogramming = findViewById(R.id.BoxCprogramming);
        BoxPythonprogramming = findViewById(R.id.BoxPythonprogramming);
        BoxJavaprogramming = findViewById(R.id.BoxJavaprogramming);
        BoxNodejs = findViewById(R.id.BoxNodejs);
        BoxHtml = findViewById(R.id.BoxHtml);
        BoxKotlin = findViewById(R.id.BoxKotlin);
        BoxPhp = findViewById(R.id.BoxPhp);
        BoxJavascript = findViewById(R.id.BoxJavascript);

        next = findViewById(R.id.next);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BoxCprogramming.isChecked()){
                    whichCategory = "C Programming";
                } else if (BoxPythonprogramming.isChecked()) {
                    whichCategory = "Python Programming";
                } else if (BoxJavaprogramming.isChecked()) {
                    whichCategory = "Java Programming";
                }else if (BoxNodejs.isChecked()) {
                    whichCategory = "Node.js";
                }else if (BoxHtml.isChecked()) {
                    whichCategory = "HTML";
                }else if (BoxKotlin.isChecked()) {
                    whichCategory = "Kotlin";
                }else if (BoxPhp.isChecked()) {
                    whichCategory = "PHP";
                }else if (BoxJavascript.isChecked()) {
                    whichCategory = "JavaScript";
                }else{
                    Toast.makeText(MainActivity.this,"Select one category",Toast.LENGTH_SHORT).show();
                }

                if(whichCategory != "None"){
                    Intent intent = new Intent(MainActivity.this, numberofquestions.class);
                    intent.putExtra("category", whichCategory);
                    whichCategory = "None";
                    startActivity(intent);
                }
            }
        });
    }
}