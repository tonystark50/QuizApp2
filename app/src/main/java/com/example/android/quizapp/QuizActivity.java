package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class QuizActivity extends AppCompatActivity {


    private EditText writeYourAnswer;


    private int mScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        writeYourAnswer = (EditText) findViewById(R.id.answer1);

        mScore = 0;


    }


    public void grade(View view) {

        int totalGrade = 8;


        question1();
        question2();
        question3();
        question4();
        question5();
        Toast.makeText(this, "SCORE " + mScore, Toast.LENGTH_LONG).show();

        float percentage=(mScore*100)/totalGrade;

        if (percentage>=80 && percentage<=100){
            Toast.makeText(this,"Score is Excellent !" + percentage, Toast.LENGTH_LONG).show();
        }else if(percentage>=70 && percentage<=79){
            Toast.makeText(this,"Score is Best !" + percentage, Toast.LENGTH_LONG).show();
        }else if(percentage>=60 && percentage<=69){
            Toast.makeText(this,"Score is Good!" + percentage, Toast.LENGTH_LONG).show();
        }else if(percentage>=50 && percentage<=59){
            Toast.makeText(this,"Score is Average !" + percentage, Toast.LENGTH_LONG).show();
        }else if(percentage>=33 && percentage<=49){
            Toast.makeText(this,"Score is  Below Average! !" + percentage, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Score is Poor! You need to practice more! !" + percentage, Toast.LENGTH_LONG).show();
        }



    }




    private String question1(){

        EditText writeYourAnswer = (EditText) findViewById(R.id.answer1);

      if(writeYourAnswer.getText().toString().matches("no")){
          mScore += 1;
      }

      else {
          mScore += 0;
      }

      return writeYourAnswer.getText().toString();

    }





    private void question2() {


        CheckBox checkBox1 = (CheckBox) findViewById(R.id.hausa);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.igbo);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.yoruba);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.french);

        if (checkBox1.isChecked()){

            mScore = mScore + 0;
        }

         if (checkBox2.isChecked()) {

            mScore = mScore + 0;
        }

         if (checkBox3.isChecked()) {

            mScore = mScore + 1;
        }

         if (checkBox4.isChecked()){
            mScore = mScore - 0;
        }

        if(mScore == 0) {

            return;
        }

    }



    private int question3(){

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group1);
        int checkedd = radioGroup.getCheckedRadioButtonId();

        switch(checkedd) {

            case R.id.cat: {
                mScore += 0;
            }
            break;

            case R.id.goat: {
                mScore += 0;
            }
            break;

            case R.id.lion: {
                mScore += 0;
            }
            break;

            case R.id.dog: {
                mScore += 1;
            }
            break;

        }


        return checkedd;




    }




    private int question4(){

        RadioGroup radioGroupp = (RadioGroup) findViewById(R.id.radio_group2);
        int checkeddd = radioGroupp.getCheckedRadioButtonId();

        switch(checkeddd) {

            case R.id.a: {
                mScore += 0;
            }
            break;

            case R.id.b: {
                mScore += 0;
            }
            break;

            case R.id.c: {
                mScore += 1;
            }
            break;

            case R.id.d: {
                mScore += 0;
            }
            break;


        }
        return checkeddd;


    }



    private void question5(){

        EditText writeYourAnswerr = (EditText) findViewById(R.id.answer2);
        EditText writeYourAnswerrr = (EditText) findViewById(R.id.answer3);
        EditText writeYourAnswerrre = (EditText) findViewById(R.id.answer4);
        EditText writeYourAnswerrree = (EditText) findViewById(R.id.answer5);

        if(writeYourAnswerr.getText().toString().matches("bicycle")){
            mScore += 1;
        }

        if(writeYourAnswerrr.getText().toString().matches("car")){
            mScore += 1;
        }



        if(writeYourAnswerrre.getText().toString().matches("football")){
            mScore += 1;
        }

        if(writeYourAnswerrree.getText().toString().matches("basketball")){
            mScore += 1;
        }


        else {
            mScore += 0;
        }







    }













}












