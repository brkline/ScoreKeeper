package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String PLAYERA_POINTS = "POINTS_PLAYERA";
    public static final String PLAYERA_ACES = "ACES_PLAYERA";
    public static final String PLAYERA_FAULTS = "FAULTS_PLAYERA";
    public static final String PLAYERB_POINTS = "POINTS_PLAYERB";
    public static final String PLAYERB_ACES = "ACES_PLAYERB";
    public static final String PLAYERB_FAULTS = "FAULTS_PLAYERB";

    int pointsPlayerA = 0;
    int pointsPlayerB = 0;
    int acesPlayerA = 0;
    int acesPlayerB = 0;
    int faultsPlayerA = 0;
    int faultsPlayerB = 0;
    TextView pointsViewPlayerA;
    TextView acesViewPlayerA;
    TextView faultViewPlayerA;
    TextView pointsViewPlayerB;
    TextView acesViewPlayerB;
    TextView faultViewPlayerB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pointsViewPlayerA = findViewById(R.id.player_a_points);
        acesViewPlayerA = findViewById(R.id.player_a_aces);
        faultViewPlayerA = findViewById(R.id.player_a_faults);
        pointsViewPlayerB = findViewById(R.id.player_b_points);
        acesViewPlayerB = findViewById(R.id.player_b_aces);
        faultViewPlayerB = findViewById(R.id.player_b_faults);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(PLAYERA_POINTS, pointsPlayerA);
        savedInstanceState.putInt(PLAYERA_ACES, acesPlayerA);
        savedInstanceState.putInt(PLAYERA_FAULTS, faultsPlayerA);
        savedInstanceState.putInt(PLAYERB_POINTS, pointsPlayerB);
        savedInstanceState.putInt(PLAYERB_ACES, acesPlayerB);
        savedInstanceState.putInt(PLAYERB_FAULTS, faultsPlayerB);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            pointsPlayerA = savedInstanceState.getInt(PLAYERA_POINTS);
            acesPlayerA = savedInstanceState.getInt(PLAYERA_ACES);
            faultsPlayerA = savedInstanceState.getInt(PLAYERA_FAULTS);
            pointsPlayerB = savedInstanceState.getInt(PLAYERB_POINTS);
            acesPlayerB = savedInstanceState.getInt(PLAYERB_ACES);
            faultsPlayerB = savedInstanceState.getInt(PLAYERB_FAULTS);
            displayPointsForPlayerA(pointsPlayerA);
            displayAcesForPlayerA(acesPlayerA);
            displayFaultsForPlayerA(faultsPlayerA);
            displayPointsForPlayerB(pointsPlayerB);
            displayAcesForPlayerB(acesPlayerB);
            displayFaultsForPlayerB(faultsPlayerB);
        }
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
        pointsViewPlayerA.setText(String.valueOf(points));
    }

    /**
     * Displays the number of aces for Player A.
     */
    public void displayAcesForPlayerA(int aces) {
        acesViewPlayerA.setText(String.valueOf(aces));
    }

    /**
     * Displays the number of faults for Player A.
     */
    public void displayFaultsForPlayerA(int faults) {
        faultViewPlayerA.setText(String.valueOf(faults));
    }

    /**
     * Displays the number of set points for Player A.
     */
    public void displayPointsForPlayerB(int points) {
        pointsViewPlayerB.setText(String.valueOf(points));
    }

    /**
     * Displays the number of aces for Player A.
     */
    public void displayAcesForPlayerB(int aces) {
        acesViewPlayerB.setText(String.valueOf(aces));
    }

    /**
     * Displays the number of faults for Player A.
     */
    public void displayFaultsForPlayerB(int faults) {
        faultViewPlayerB.setText(String.valueOf(faults));
    }
}
