package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


    }


    public void Stats(View v) {
        Intent i = new Intent(this, ShowStats.class);
        startActivity(i);
    }

    public void matchMaking(View v) {
        Intent i = new Intent(this, Matchmaking.class);
        startActivity(i);
    }


}