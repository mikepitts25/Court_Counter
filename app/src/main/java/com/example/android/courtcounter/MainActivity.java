package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases the given scoreTeamA for Team A.
     */
    public void increaseTeamAScore(View view){

        switch (view.getId()) {
            case R.id.three_point_button:
                scoreTeamA += 3;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.two_point_button:
                scoreTeamA += 2;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.free_throw_button:
                scoreTeamA++;
                displayForTeamA(scoreTeamA);
                break;
            default:
                displayForTeamA(scoreTeamA);
        }
    }

    public void increaseTeamBScore(View view){

        switch (view.getId()) {
            case R.id.three_point_buttonB:
                scoreTeamB += 3;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.two_point_buttonB:
                scoreTeamB += 2;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.free_throw_buttonB:
                scoreTeamB++;
                displayForTeamB(scoreTeamB);
                break;
            default:
                displayForTeamB(scoreTeamB);
        }
    }

    public void resetScores(View view){

        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);

    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
