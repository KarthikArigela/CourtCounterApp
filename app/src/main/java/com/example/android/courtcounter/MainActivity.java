package com.example.android.courtcounter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**--------------------------------------------------------------------------------*/

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void add1ToTeamA(View v) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void add2ToTeamA(View v) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void add3ToTeamA(View v) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    /**--------------------------------------------------------------------------------*/

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void add1ToTeamB(View v) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void add2ToTeamB(View v) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void add3ToTeamB(View v) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v) {
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
        scoreTeamA=0;
        displayForTeamA(scoreTeamA);
    }


}