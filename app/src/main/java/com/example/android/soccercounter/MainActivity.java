package com.example.android.soccercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int goals = 0;
    int reds = 0;
    int yellows = 0;
    int fouls = 0;

    void addGoals(View v){
        goals += 1;
        displayGoals(goals);
    }

    void addReds(View v){
        reds += 1;
        displayReds(reds);
    }

    void addYellows(View v){
        yellows += 1;
        displayYellows(yellows);
    }

    void addFouls(View v){
        fouls += 1;
        displayFouls(fouls);
    }

    void displayGoals(int value){
        TextView toChange = (TextView) findViewById(R.id.goals_text);
        toChange.setText(value);
    }

    void displayReds(int value){
        TextView toChange = (TextView) findViewById(R.id.reds_text);
        toChange.setText(value);
    }

    void displayYellows(int value){
        TextView toChange = (TextView) findViewById(R.id.yellows_text);
        toChange.setText(value);
    }

    void displayFouls(int value){
        TextView toChange = (TextView) findViewById(R.id.foals_text);
        toChange.setText(value);
    }

    int goalsb = 0;
    int redsb = 0;
    int yellowsb = 0;
    int foulsb = 0;

    void addGoalsb(View v){
        goalsb += 1;
        displayGoals(goalsb);
    }

    void addRedsb(View v){
        redsb += 1;
        displayGoals(redsb);
    }

    void addYellowsb(View v){
        yellowsb += 1;
        displayGoals(yellowsb);
    }

    void addFoulsb(View v){
        foulsb += 1;
        displayGoalsb(foulsb);
    }

    void displayValueb(int value, int id){
        TextView toChange = (TextView) findViewById(id);
        toChange.setText(value);
    }

    void displayGoalsb(int value){
        TextView toChange = (TextView) findViewById(R.id.goals_text);
        toChange.setText(value);
    }

    void displayRedsb(int value){
        TextView toChange = (TextView) findViewById(R.id.reds_text);
        toChange.setText(value);
    }

    void displayYellowsb(int value){
        TextView toChange = (TextView) findViewById(R.id.yellows_text);
        toChange.setText(value);
    }

    void displayFoulsb(int value){
        TextView toChange = (TextView) findViewById(R.id.foals_textb);
        toChange.setText(value);
    }
}
