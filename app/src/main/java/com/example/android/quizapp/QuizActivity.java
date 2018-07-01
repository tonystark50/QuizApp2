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


    public EditText writeYourAnswer;


    private int mScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        writeYourAnswer = (EditText) findViewById(R.id.answer1);

        mScore = 0;


    }


    /**
     * this displays total score, which is also graded in percentage with a toast message.
     * the score is reset back to 0
     * also calls the restart method to restart the quiz
     **/


    public void grade(View view) {

        int totalGrade = 10;


        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        Toast.makeText(this, "SCORE " + mScore + "/10", Toast.LENGTH_LONG).show();

        float percentage=(mScore*100)/totalGrade;

        if (percentage>=80 && percentage<=100){
            Toast.makeText(this,"Score is Excellent!!" + percentage + "%", Toast.LENGTH_LONG).show();
        }else if(percentage>=70 && percentage<=79){
            Toast.makeText(this,"Score is Best!! " + percentage + "%", Toast.LENGTH_LONG).show();
        }else if(percentage>=60 && percentage<=69){
            Toast.makeText(this,"Score is Good!! " + percentage + "%", Toast.LENGTH_LONG).show();
        }else if(percentage>=50 && percentage<=59){
            Toast.makeText(this,"Score is Average!! " + percentage + "%", Toast.LENGTH_LONG).show();
        }else if(percentage>=33 && percentage<=49){
            Toast.makeText(this,"Score is  Below Average!! " + percentage + "%", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Score is Poor! You need to practice more!! " + percentage + "%", Toast.LENGTH_LONG).show();
        }


        mScore = 0;
        restart();
    }


    /**
     * this evaluates the answer to question 1
     * returns String data type
     * if texts entered in the edittext field is equal to the string "no" ignoring upper/lower case,
     * 1 mark is given, else 0 mark is given
     * @return
     */



    private String question1(){

        EditText writeYourAnswer = (EditText) findViewById(R.id.answer1);

      if(writeYourAnswer.getText().toString().equalsIgnoreCase("no")){
          mScore += 1;
      }

      else {
          mScore += 0;
      }

      return writeYourAnswer.getText().toString();

    }


    /**
     * this evaluates question 2
     * if all checkboxes are checked, no mark is given, but
     * if the correct three checkboxes are checked, 1 mark is given
     */



    private void question2() {


        CheckBox checkBox1 = (CheckBox) findViewById(R.id.hausa);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.igbo);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.yoruba);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.french);

        if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked() && checkBox4.isChecked()) {

            mScore += 0;
        }

        else if(checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked())
        {mScore += 1;}

         else
             {mScore += 0;}


    }


    /**
     * evaluates question 3
     * radiobuttons allow only one to be checked at once
     * if the right answer is checked, 1 mark is given, else
     * 0 mark is given
     * @return
     */


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


    /**
     * evaluates question 4
     * radiobuttons allow only one to be checked at once
     * if the right answer is checked, 1 mark is given, else
     * 0 mark is given
     * @return
     */



    private int question4(){

        RadioGroup radioGroupp = (RadioGroup) findViewById(R.id.radio_group2);
        int checkeedd = radioGroupp.getCheckedRadioButtonId();

        switch(checkeedd) {

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
        return checkeedd;


    }



    private void question5(){

        EditText writeYourAnswerr = (EditText) findViewById(R.id.answer2);
        EditText writeYourAnswerrr = (EditText) findViewById(R.id.answer3);
        EditText writeYourAnswerrre = (EditText) findViewById(R.id.answer4);
        EditText writeYourAnswerrree = (EditText) findViewById(R.id.answer5);

        if(writeYourAnswerr.getText().toString().equalsIgnoreCase("bicycle")){
            mScore += 1;
        }

        if(writeYourAnswerrr.getText().toString().equalsIgnoreCase("car")){
            mScore += 1;
        }



        if(writeYourAnswerrre.getText().toString().equalsIgnoreCase("football")){
            mScore += 1;
        }

        if(writeYourAnswerrree.getText().toString().equalsIgnoreCase("basketball")){
            mScore += 1;
        }


        else {
            mScore += 0;
        }


    }



    /**
     * evaluates question 6
     * radiobuttons allow only one to be checked at once
     * if the right answer is checked, 1 mark is given, else
     * 0 mark is given
     * @return
     */




    private int question6(){

        RadioGroup radioGrouup = (RadioGroup) findViewById(R.id.radio_group3);
        int checkeeedd = radioGrouup.getCheckedRadioButtonId();

        switch(checkeeedd) {

            case R.id.mgbemena: {
                mScore += 0;
            }
            break;

            case R.id.osinbajo: {
                mScore += 0;
            }
            break;

            case R.id.goodluck: {
                mScore += 0;
            }
            break;

            case R.id.buhari: {
                mScore += 1;
            }
            break;


        }


        return checkeeedd;

    }


    /**
     * evaluates question 3
     * radiobuttons allow only one to be checked at once
     * if the right answer is checked, 1 mark is given, else
     * 0 mark is given
     * @return
     */




    private int question7() {
        RadioGroup radioGrouupp = (RadioGroup) findViewById(R.id.radio_group4);
        int checkeeeddd = radioGrouupp.getCheckedRadioButtonId();

        switch (checkeeeddd) {

            case R.id.bill: {
                mScore += 1;
            }
            break;

            case R.id.mark: {
                mScore += 0;
            }
            break;

            case R.id.warren: {
                mScore += 0;
            }
            break;

            case R.id.fiftycent: {
                mScore += 0;
            }
            break;


        }

        return checkeeeddd;


    }


    /**
     * this method resets all answers in the quiz
     */


    public void restart(){

        EditText writeYourAnswer = (EditText) findViewById(R.id.answer1);
        writeYourAnswer.setText(" ");
        EditText writeYourAnswerr = (EditText) findViewById(R.id.answer2);
        writeYourAnswerr.setText(" ");

        EditText writeYourAnswerrr = (EditText) findViewById(R.id.answer3);
        writeYourAnswerrr.setText(" ");

        EditText writeYourAnswerrre = (EditText) findViewById(R.id.answer4);
        writeYourAnswerrre.setText(" ");

        EditText writeYourAnswerrree = (EditText) findViewById(R.id.answer5);
        writeYourAnswerrree.setText(" ");


        CheckBox checkBox1 = (CheckBox) findViewById(R.id.hausa);
        checkBox1.setChecked(false);

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.igbo);
        checkBox2.setChecked(false);

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.yoruba);
        checkBox3.setChecked(false);

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.french);
        checkBox4.setChecked(false);



        RadioGroup radioGroup = findViewById(R.id.radio_group1);
        radioGroup.clearCheck();

        RadioGroup radioGroupp = findViewById(R.id.radio_group2);
        radioGroupp.clearCheck();

        RadioGroup radioGrouup = findViewById(R.id.radio_group3);
        radioGrouup.clearCheck();

        RadioGroup radioGrouupp = findViewById(R.id.radio_group4);
        radioGrouupp.clearCheck();



    }


}












