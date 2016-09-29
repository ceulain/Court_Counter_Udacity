package com.example.barth.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int THREE_POINTS = 3;
    final int TWO_POINTS = 2;
    final int ONE_POINT = 1;

    int scoreTeamA  = 0;
    int scoreTeamB  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void addThreeForTeamA(View view){
        displayForTeamA(THREE_POINTS);
    }

    public void addTwoForTeamA(View view){
        displayForTeamA(TWO_POINTS);
    }

    public void addOneForTeamA(View view){
        displayForTeamA(ONE_POINT);
    }

    public void addThreeForTeamB(View view){
        displayForTeamB(THREE_POINTS);
    }

    public void addTwoForTeamB(View view){
        displayForTeamB(TWO_POINTS);
    }

    public void addOneForTeamB(View view){
        displayForTeamB(ONE_POINT);
    }


    public void resetGame(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        scoreTeamA += score;

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void displayForTeamB(int score) {
        scoreTeamB += score;

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
}
