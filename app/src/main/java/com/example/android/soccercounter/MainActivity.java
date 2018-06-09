package com.example.android.soccercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goals = 0;
    int reds = 0;
    int yellows = 0;
    int fouls = 0;


    int goalsb = 0;
    int redsb = 0;
    int yellowsb = 0;
    int foulsb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGoals(View v){
        goals += 1;
        displayGoals(goals);
    }

    public void addReds(View v){
        reds += 1;
        displayReds(reds);
    }

    public void addYellows(View v){
        yellows += 1;
        displayYellows(yellows);
    }

    public void addFoals(View v){
        fouls += 1;
        displayFouls(fouls);
    }

    void displayGoals(int value){
        TextView toChange = (TextView) findViewById(R.id.goals_text);
        toChange.setText(String.valueOf(value));
    }

    void displayReds(int value){
        TextView toChange = (TextView) findViewById(R.id.reds_text);
        toChange.setText(String.valueOf(value));
    }

    void displayYellows(int value){
        TextView toChange = (TextView) findViewById(R.id.yellows_text);
        toChange.setText(String.valueOf(value));
    }

    void displayFouls(int value){
        TextView toChange = (TextView) findViewById(R.id.foals_text);
        toChange.setText(String.valueOf(value));
    }

    public void addGoalsb(View v){
        goalsb += 1;
        displayGoalsb(goalsb);
    }

    public void addRedsb(View v){
        redsb += 1;
        displayRedsb(redsb);
    }

    public void addYellowsb(View v){
        yellowsb += 1;
        displayYellowsb(yellowsb);
    }

    public void addFoalsb(View v){
        foulsb += 1;
        displayFoulsb(foulsb);
    }

    void displayGoalsb(int value){
        TextView toChange = (TextView) findViewById(R.id.goals_textb);
        toChange.setText(String.valueOf(value));
    }

    void displayRedsb(int value){
        TextView toChange = (TextView) findViewById(R.id.reds_textb);
        toChange.setText(String.valueOf(value));
    }

    void displayYellowsb(int value){
        TextView toChange = (TextView) findViewById(R.id.yellows_textb);
        toChange.setText(String.valueOf(value));
    }

    void displayFoulsb(int value){
        TextView toChange = (TextView) findViewById(R.id.foals_textb);
        toChange.setText(String.valueOf(value));
    }
}
