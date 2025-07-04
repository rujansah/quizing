package com.example.quizing;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Locale;

public class playarea extends AppCompatActivity {
    //Views
    private TextView questionText, howmuchdone, countDownText;
    private RadioButton option1, option2, option3, option4;
    private Button previous, next;
    private RadioGroup radioGroup;
    private int totalTimeToPlay;
    private ImageButton back;

    //Data types
    String category;
    int numberofquestions, count;
    ArrayList<question_model> listofquestions = new ArrayList<>();
    ArrayList<inputs> userinputs = new ArrayList<>();
    private CountDownTimer countDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_playarea);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });




        inputs input = new inputs();
        //Getting Views IDs
        questionText = findViewById(R.id.question);
        howmuchdone = findViewById(R.id.howmuchdone);
        countDownText = findViewById(R.id.countDownTimer);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        previous = findViewById(R.id.previous);
        next = findViewById(R.id.next);
        radioGroup = findViewById(R.id.optionsgroup);
        back = findViewById(R.id.back);

        // getting intents values
        Intent intent = getIntent();
        category = intent.getStringExtra("whichCategory");
        numberofquestions = intent.getIntExtra("numberOfQuestions",0);





        //making questions from questionMaker class
        questionMaker questionMaker = new questionMaker(category,numberofquestions);
        listofquestions = questionMaker.makeQuestion();

        // making user inputs array full to edit.
        for (int i=0;i<numberofquestions;i++){
            inputs  ii= new inputs();
            userinputs.add(ii);
            userinputs.get(i).setWhichoption("");
            userinputs.get(i).setOptionindex(-1);
        }

        //loading first question and its options
        count = 0;
        loadquestionandoptions(count);
        if (numberofquestions==1){
            next.setText("Finish");
        }


        //preparing for coundown

        if (numberofquestions<2){
            totalTimeToPlay =1 * 60 * 300;
        } else if (numberofquestions<=5) {
            totalTimeToPlay = 1 * 60 * 1000;
        } else if (numberofquestions>5 && numberofquestions<=10) {
            totalTimeToPlay = 2 * 60 * 1000;
        } else if (numberofquestions>10 && numberofquestions<=15) {
            totalTimeToPlay = 3 * 60 * 1000;
        } else{
            totalTimeToPlay = 4 * 60 * 1000;
        }
        startCountingTime();


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If no any option is selected
                if (radioGroup.getCheckedRadioButtonId()==-1){
                    Toast.makeText(playarea.this,"Select any option to continue",Toast.LENGTH_SHORT).show();
                }else{
                    // if the question index comes to last
                    if (count==numberofquestions-1){
                        storeuserinput();
                        Intent intent3 = new Intent(playarea.this,results.class);
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("userinputsarray",userinputs);
                        bundle.putSerializable("loadedquestions",listofquestions);
                        intent3.putExtras(bundle);
                        startActivity(intent3);
                        Toast.makeText(playarea.this, userinputs.size()+" qwe:"+listofquestions.size(), Toast.LENGTH_SHORT).show();
                    }else{

                        if (count==numberofquestions-2){
                            next.setText("Finish");
                        }else{
                            next.setText("Next");
                        }
                        storeuserinput();
                        count++;
                        loadquestionandoptions(count);
                        //set the user selected option if the question is already answered.
                        setUserSelectedOptionForLoadedQuestion();
                    }
                }


            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count==0){
                    Toast.makeText(playarea.this,"First Question",Toast.LENGTH_SHORT).show();
                }else{
                    next.setText("Next");

                    storeuserinput();
                    count--;
                    loadquestionandoptions(count);
                    setUserSelectedOptionForLoadedQuestion();
                }

            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogbox();
            }
        });





    }
    private void loadquestionandoptions(int counts){
        //first setting how much question done
        howmuchdone.setText(counts+1+" of "+numberofquestions);

        //now setting the questions and its options
        question_model model = listofquestions.get(counts);
        questionText.setText(model.getQuestion());
        option1.setText(model.getOptions()[0]);
        option2.setText(model.getOptions()[1]);
        option3.setText(model.getOptions()[2]);
        option4.setText(model.getOptions()[3]);
    }


    private String whichoptionselected(){
        if (option1.isChecked()){
            return option1.getText().toString();
        } else if (option2.isChecked()) {
            return option2.getText().toString();
        } else if (option3.isChecked()) {
            return option3.getText().toString();
        } else if (option4.isChecked()) {
            return option4.getText().toString();
        }else{
            return null;
        }
    }
    private int whichoptionIndex(){
        if (option1.isChecked()){
            return 0;
        } else if (option2.isChecked()) {
            return 1;
        } else if (option3.isChecked()) {
            return 2;
        } else if (option4.isChecked()) {
            return 3;
        }else{
            return -1;
        }
    }

    private void storeuserinput(){
        //storing user inputs in userinputs arraylist
        String optionselected = whichoptionselected();

        userinputs.get(count).setWhichoption(optionselected);
        userinputs.get(count).setQuestionindex(count);
        userinputs.get(count).setOptionindex(whichoptionIndex());
//        Log.d("hello4","question: "+userinputs.get(count).getQuestionindex());
//        Log.d("hello4","option: "+userinputs.get(count).getWhichoption());
    }
    private void setUserSelectedOptionForLoadedQuestion(){
        // setting the user previously selected opitons.
        if (userinputs.get(count).getOptionindex()==0){
            radioGroup.check(R.id.option1);
        }else if (userinputs.get(count).getOptionindex()==1){
            radioGroup.check(R.id.option2);
        }else if (userinputs.get(count).getOptionindex()==2){
            radioGroup.check(R.id.option3);
        }else if (userinputs.get(count).getOptionindex()==3){
            radioGroup.check(R.id.option4);
        }else{
            radioGroup.clearCheck();
        }
    }


    @Override
    public void onBackPressed() {
        showDialogbox();
    }




    // for countdown timer
    private void startCountingTime() {
        countDownTimer = new CountDownTimer(totalTimeToPlay,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long hours = (millisUntilFinished / 1000) / 3600;
                long minutes = ((millisUntilFinished / 1000) % 3600) / 60;
                long seconds = (millisUntilFinished / 1000) % 60;
                String timeToSetText = String.format(Locale.getDefault(),"%02d:%02d:%02d",hours,minutes,seconds);
                countDownText.setText(timeToSetText);

            }

            @Override
            public void onFinish() {
                countDownText.setText("00:00:00");

                Intent intent3 = new Intent(playarea.this,results.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("userinputsarray",userinputs);
                bundle.putSerializable("loadedquestions",listofquestions);
                intent3.putExtras(bundle);
                startActivity(intent3);
                MediaPlayer mediaPlayer = MediaPlayer.create(playarea.this,R.raw.timer_sound);
                mediaPlayer.start();
            }
        }.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        if (countDownTimer!=null){
            countDownTimer.cancel();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer!=null){
            countDownTimer.cancel();
        }
    }



    //for dialog box for back button and back pressed
    private void showDialogbox(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirmation");
        builder.setMessage("Are you sure want to exit from quiz");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(playarea.this,MainActivity.class);
                startActivity(intent);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}