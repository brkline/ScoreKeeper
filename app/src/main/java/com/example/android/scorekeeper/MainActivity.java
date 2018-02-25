package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsPlayerA = 0;
    int pointsPlayerB = 0;
    int acesPlayerA = 0;
    int acesPlayerB = 0;
    int faultsPlayerA = 0;
    int faultsPlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add a point for Player A.
     */
    public void addPointForPlayerA(View v) {

        pointsPlayerA = pointsPlayerA + 1;
        displayPointsForPlayerA(pointsPlayerA);
    }

    /**
     * Add to the number of Aces for Player A.
     */
    public void addAceForPlayerA(View v) {

        acesPlayerA = acesPlayerA + 1;
        displayAcesForPlayerA(acesPlayerA);
    }

    /**
     * Add to the number of Faults for Player A.
     */
    public void addFaultForPlayerA(View v) {

        faultsPlayerA = faultsPlayerA + 1;
        displayFaultsForPlayerA(faultsPlayerA);
    }

    /**
     * Add a point for Player B.
     */
    public void addPointForPlayerB(View v) {

        pointsPlayerB = pointsPlayerB + 1;
        displayPointsForPlayerB(pointsPlayerB);
    }

    /**
     * Add to the number of Aces for Player B.
     */
    public void addAceForPlayerB(View v) {

        acesPlayerB = acesPlayerB + 1;
        displayAcesForPlayerB(acesPlayerB);
    }

    /**
     * Add to the number of Faults for Player B.
     */
    public void addFaultForPlayerB(View v) {

        faultsPlayerB = faultsPlayerB + 1;
        displayFaultsForPlayerB(faultsPlayerB);
    }

    /**
     * Resets the points, aces, and faults for both players
     */
    public void resetAll(View v) {

        pointsPlayerA = 0;
        acesPlayerA = 0;
        faultsPlayerA = 0;
        pointsPlayerB = 0;
        acesPlayerB = 0;
        faultsPlayerB = 0;
        displayPointsForPlayerA(pointsPlayerA);
        displayAcesForPlayerA(acesPlayerA);
        displayFaultsForPlayerA(faultsPlayerA);
        displayPointsForPlayerB(pointsPlayerB);
        displayAcesForPlayerB(acesPlayerB);
        displayFaultsForPlayerB(faultsPlayerB);
    }

    /**
     * Displays the number of set points for Player A.
     */
    public void displayPointsForPlayerA(int points) {
        TextView pointsView = (TextView) findViewById(R.id.player_a_points);
        pointsView.setText(String.valueOf(points));
    }

    /**
     * Displays the number of aces for Player A.
     */
    public void displayAcesForPlayerA(int aces) {
        TextView acesView = (TextView) findViewById(R.id.player_a_aces);
        acesView.setText(String.valueOf(aces));
    }

    /**
     * Displays the number of faults for Player A.
     */
    public void displayFaultsForPlayerA(int faults) {
        TextView faultView = (TextView) findViewById(R.id.player_a_faults);
        faultView.setText(String.valueOf(faults));
    }

    /**
     * Displays the number of set points for Player A.
     */
    public void displayPointsForPlayerB(int points) {
        TextView pointsView = (TextView) findViewById(R.id.player_b_points);
        pointsView.setText(String.valueOf(points));
    }

    /**
     * Displays the number of aces for Player A.
     */
    public void displayAcesForPlayerB(int aces) {
        TextView acesView = (TextView) findViewById(R.id.player_b_aces);
        acesView.setText(String.valueOf(aces));
    }

    /**
     * Displays the number of faults for Player A.
     */
    public void displayFaultsForPlayerB(int faults) {
        TextView faultView = (TextView) findViewById(R.id.player_b_faults);
        faultView.setText(String.valueOf(faults));
    }
}
