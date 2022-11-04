package com.example.exampleui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View v){
        Intent i = new Intent(this, RecPage.class);
        startActivity(i);
    }

    public void instruction(View v){
        Intent i = new Intent(this, Instructions.class);
        startActivity(i);
    }

}