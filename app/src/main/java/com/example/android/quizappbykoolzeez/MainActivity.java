package com.example.android.quizappbykoolzeez;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int scoreTwo = 0;
    int scoreThree = 0;
    int scoreFour = 0;
    int scoreFive = 0;
    int scoreSix = 0;
    int finalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            // Beginning Question One

            case R.id.a1:
                if (checked)
                    score = 1;
                break;
            case R.id.b1:
                if (checked)
                    score = 0;

                break;
            case R.id.c1:
                if (checked)
                    score = 0;
                break;
            // End Question One

            // Beginning Question Two

            case R.id.a2:
                if (checked)
                    scoreTwo = 0;
                break;
            case R.id.b2:
                if (checked)
                    scoreTwo = 0;
                break;
            case R.id.c2:
                if (checked)
                    scoreTwo = 1;
                break;
            // End Question two

            // Beginning Question three

            case R.id.a3:
                if (checked)
                    scoreThree = 0;
                break;
            case R.id.b3:
                if (checked)
                    scoreThree = 1;
                break;
            case R.id.c3:
                if (checked)
                    scoreThree = 0;
                break;
            // End Question three

            // Beginning Question four

            case R.id.a4:
                if (checked)
                    scoreFour = 0;
                break;
            case R.id.b4:
                if (checked)
                    scoreFour = 0;
                break;
            case R.id.c4:
                if (checked)
                    scoreFour = 1;
                break;
            // End Question four

            // Beginning Question five

            case R.id.a5:
                if (checked)
                    break;
            case R.id.b5:
                if (checked)
                    scoreFive = 0;
                break;
            case R.id.c5:
                if (checked)
                    scoreFive = 0;
                break;
            // End Question five

            // Beginning Question six

            case R.id.a6:
                if (checked)
                    scoreSix = 0;
                break;
            case R.id.b6:
                if (checked)
                    scoreSix = 0;
                break;
            case R.id.c6:
                if (checked)
                    scoreSix += 1;
                break;
            // End Question six
        }


    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitQuiz(View view) {
        EditText textName = (EditText) findViewById(R.id.name_field);
        String name = textName.getText().toString();
        displayName("Full Name: " + name);
        finalScore = score + scoreTwo + scoreThree + scoreFour + scoreFive + scoreSix;
        displayScore("Scores: " + finalScore + " of 6");
        Toast res = Toast.makeText(this, "Dear " + name + ", you have scored " + finalScore + " out of 6", Toast.LENGTH_LONG);
        res.show();
        finalScore = 0;
    }


    /**
     * This method displays the given text on the screen.
     */
    public void displayName(String screen) {
        TextView nameTextView = (TextView) findViewById(R.id.resultsName);
        nameTextView.setText(screen);
    }

    public void displayScore(String scores) {
        TextView scoreView = (TextView) findViewById(R.id.resultsScore);
        scoreView.setText(String.valueOf(scores));
    }
}
