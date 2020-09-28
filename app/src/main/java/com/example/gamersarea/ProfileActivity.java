package com.example.gamersarea;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    Button myContestsButton,genTVButton,ggTrendsButton,genStoreButton,profileButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        linkAllBottomButtons();
        addListenersToAllButtons();
    }
    void linkAllBottomButtons(){
        myContestsButton=findViewById(R.id.myContestButton);
        genTVButton=findViewById(R.id.genTVButton);
        ggTrendsButton=findViewById(R.id.ggTrendsButton);
        genStoreButton=findViewById(R.id.genStoreButton);
        profileButton=findViewById(R.id.profileButton);
    }
    void addListenersToAllButtons(){
        /**********************MAKING MY CONTESTS BUTTON INTERACTIVE********************************/
        myContestsButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        view.setBackgroundColor(Color.RED);

                        break;
                    case MotionEvent.ACTION_UP:
                        view.setBackgroundColor(Color.WHITE);
                        Intent intent=new Intent(ProfileActivity.this,MyContestsActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);

                        break;
                }
                return false;
            }
        });
        /**********************MAKING MY GEN TV BUTTON INTERACTIVE********************************/
        genTVButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        view.setBackgroundColor(Color.RED);

                        break;
                    case MotionEvent.ACTION_UP:
                        view.setBackgroundColor(Color.WHITE);

                        break;
                }
                return false;
            }
        });
        /**********************MAKING GG trends BUTTON INTERACTIVE********************************/
        ggTrendsButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        view.setBackgroundColor(Color.RED);

                        break;
                    case MotionEvent.ACTION_UP:
                        view.setBackgroundColor(Color.WHITE);

                        break;
                }
                return false;
            }
        });
        /**********************MAKING GEN STORE BUTTON INTERACTIVE********************************/
        genStoreButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        view.setBackgroundColor(Color.RED);

                        break;
                    case MotionEvent.ACTION_UP:
                        view.setBackgroundColor(Color.WHITE);

                        break;
                }
                return false;
            }
        });
        /**********************MAKING PROFILE BUTTON INTERACTIVE********************************/
        /*NOT APPLICABLE HERE*/

    }
}