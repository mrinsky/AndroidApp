package com.mihail.mrinsky.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Main extends AppCompatActivity {
    Button screenColor;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screenColor = (Button)findViewById(R.id.screenColor);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativiveLayout);
        screenColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });
    }
}
