package com.example.gamersarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button shortcutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.linkAllButtons();
        this.setListenersToButtons();
    }

    void linkAllButtons(){
        shortcutButton=findViewById(R.id.shortcutButton);
    }

    void setListenersToButtons(){
        shortcutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AfterSignInActivity.class);
                startActivity(intent);
            }
        });
    }
}