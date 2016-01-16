package com.mihail.mrinsky.androidapp;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Main extends AppCompatActivity implements View.OnClickListener {
    Button screenColor;
    RelativeLayout relativeLayout;
    Button btnRed,btnBlue,btnGray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screenColor = (Button)findViewById(R.id.screenColor);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativiveLayout);
        screenColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(Color.CYAN); //Цвет не через getResourse а через константу
            }
        });
        btnBlue = (Button)findViewById(R.id.buttonBlue);
        btnRed = (Button)findViewById(R.id.buttonRed);
        btnGray = (Button)findViewById(R.id.buttonGray);
        btnBlue.setOnClickListener(this);
        btnRed.setOnClickListener(this);
        btnGray.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonRed:
                relativeLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.buttonBlue:
                relativeLayout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.buttonGray: relativeLayout.setBackgroundColor(Color.GRAY);
            break;

        }
    }
}
