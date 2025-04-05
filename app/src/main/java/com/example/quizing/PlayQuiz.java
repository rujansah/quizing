package com.example.quizing;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Locale;

public class PlayQuiz extends AppCompatActivity {
    private TextView question_text, countdownText, questionCount;
    private RadioButton option1, option2, option3, option4;
    private Button next, previous;
    private int maxQuestionsUserWants, count;
    private String typeUserWants;
    private ArrayList<String> questionAnswers = new ArrayList<>();
    private ArrayList<String> userAnswers = new ArrayList<>();
    private RadioGroup optionsGroup;
    private ArrayList<question_model> questions = new ArrayList<question_model>();
    private CountDownTimer countDownTimer;
    private int totalTimeToPlay = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_play_quiz);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        question_text = findViewById(R.id.question);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);
        optionsGroup = findViewById(R.id.optionsgroup);
        countdownText = findViewById(R.id.countdown);
        questionCount = findViewById(R.id.questionCount);


        count = 0;


        //onstart
        Intent intent = getIntent();
        typeUserWants = intent.getStringExtra("whichCategory");
        maxQuestionsUserWants = intent.getIntExtra("numberOfQuestions",1);
//        questionMaker questionMaker = new questionMaker(typeUserWants);
//        questions = questionMaker.makeQuestion();
        for (int i=0;i<questions.size();i++){
            questionAnswers.add(questions.get(i).getCorrectAnswer());
        }
        if (maxQuestionsUserWants<5){
            totalTimeToPlay =1 * 60 * 1000;
        } else if (maxQuestionsUserWants>5 && maxQuestionsUserWants<10) {
            totalTimeToPlay = 2 * 60 * 1000;
        }else{
            totalTimeToPlay = 3 * 60 * 1000;
        }
        String[] userAns = new String[maxQuestionsUserWants];

        questionCount.setText("1"+"/"+ String.valueOf(maxQuestionsUserWants));


        //for timer
        startCountingTime();




        loadQuestion(0,typeUserWants);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (optionsGroup.getCheckedRadioButtonId()==-1){
                    Toast.makeText(PlayQuiz.this, "Select any option to continue", Toast.LENGTH_LONG).show();
                }else{
                    userAns[count] = whichSelectedAnswer();
//                    userAnswers.add(count,whichSelectedAnswer());
                    count++;
                    if (count>=maxQuestionsUserWants-1){
                        questionCount.setText(maxQuestionsUserWants+"/"+maxQuestionsUserWants);
                    }else{
                        questionCount.setText(count+1+"/"+maxQuestionsUserWants);
                    }

                    Log.d("userAnswers",userAnswers.size()+" "+questionAnswers.size());
                    if (count == maxQuestionsUserWants-1){
                        next.setText("Finish");
                        nextQuestion(count,typeUserWants);
                    } else if (count == maxQuestionsUserWants) {
                        for (int i=0;i<userAns.length;i++){
                            userAnswers.add(userAns[i]);
                        }
                        Intent intent = new Intent(PlayQuiz.this,results.class);
                        intent.putExtra("score",calculateScore());
                        intent.putExtra("maxquestions",maxQuestionsUserWants);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                    else{
                        nextQuestion(count,typeUserWants);
                    }
//                    questionCount.setText(String.valueOf(count+1+"/"+String.valueOf(maxQuestionsUserWants)));
                }


            }
        });

//        previous.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (count==0){
//                    Toast.makeText(PlayQuiz.this, "First Question", Toast.LENGTH_SHORT).show();
//                }else{
////                    userAnswers.set(count,whichSelectedAnswer());
//                    userAns[count] = whichSelectedAnswer();
//                    count = count-1;
//                    Log.d("userAnswers","pre "+userAnswers.size()+" "+questionAnswers.size());
//                    loadQuestion(count,typeUserWants);
//                }
//            }
//        });








    }


    //CountDown Timer
    private void startCountingTime() {
        countDownTimer = new CountDownTimer(totalTimeToPlay,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long hours = (millisUntilFinished / 1000) / 3600;
                long minutes = ((millisUntilFinished / 1000) % 3600) / 60;
                long seconds = (millisUntilFinished / 1000) % 60;
                String timeToSetText = String.format(Locale.getDefault(),"%02d:%02d:%02d",hours,minutes,seconds);
                countdownText.setText(timeToSetText);

            }

            @Override
            public void onFinish() {
                countdownText.setText("00:00:00");
                MediaPlayer mediaPlayer = MediaPlayer.create(PlayQuiz.this,R.raw.timer_sound);
                mediaPlayer.start();
                Intent intentforTimeUp = new Intent(PlayQuiz.this,results.class);
                intentforTimeUp.putExtra("score",calculateScore());
                intentforTimeUp.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intentforTimeUp);
            }
        }.start();
    }

    private String whichSelectedAnswer(){
        String selectedAnswer = "";
        if(option1.isChecked()){
            selectedAnswer = option1.getText().toString();
        } else if (option2.isChecked()) {
            selectedAnswer = option2.getText().toString();
        } else if (option3.isChecked()) {
            selectedAnswer = option3.getText().toString();
        } else if (option4.isChecked()) {
            selectedAnswer = option4.getText().toString();
        }else{
            Toast.makeText(this, "Select any one", Toast.LENGTH_SHORT).show();
        }


        return selectedAnswer;
    }
    private int calculateScore(){
        int calculatedScore = 0;
//        Log.d("answers",questionAnswers.get(0).toString()+" "+userAnswers.get(0));
        for (int i=0; i<=userAnswers.size()-1;i++){
            if (questionAnswers.get(i) == userAnswers.get(i)){
                calculatedScore++;
//                Log.d("answers",questionAnswers.get(0).toString()+" "+userAnswers.get(0));
            }


        }


        return calculatedScore;
    }
    private void nextQuestion(int count, String type){

        loadQuestion(count,type);
    }

    private void loadQuestion(int count,String type){
        question_text.setText(questions.get(count).getQuestion());
        option1.setText(questions.get(count).getOptions()[0]);
        option2.setText(questions.get(count).getOptions()[1]);
        option3.setText(questions.get(count).getOptions()[2]);
        option4.setText(questions.get(count).getOptions()[3]);

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
}