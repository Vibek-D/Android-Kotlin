package com.sunusi2sim.mobileattendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        final Button btn100 = (Button) findViewById(R.id.btn100);
        final Button btn200 = (Button) findViewById(R.id.btn200);
        final Button btn300 = (Button) findViewById(R.id.btn300);
        final Button btn400 = (Button) findViewById(R.id.btn400);
        final Button btn500 = (Button) findViewById(R.id.btn500);

        btn100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LevelActivity.this, Courses100Activity.class);
                LevelActivity.this.startActivity(intent);
            }
        });
        btn200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LevelActivity.this, Courses200Activity.class);
                LevelActivity.this.startActivity(intent);
            }
        });
        btn300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LevelActivity.this, Courses300Activity.class);
                LevelActivity.this.startActivity(intent);
            }
        });
        btn400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LevelActivity.this, Courses400Activity.class);
                LevelActivity.this.startActivity(intent);
            }
        });
        btn500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LevelActivity.this, Courses500Activity.class);
                LevelActivity.this.startActivity(intent);
            }
        });
    }
}