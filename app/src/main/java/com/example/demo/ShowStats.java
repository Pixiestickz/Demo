package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowStats extends AppCompatActivity {

    Stats temp = new Stats();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_stats);
        displayStats();
    }

    public void displayStats() {
        //hits
        TextView stat = findViewById(R.id.textView13);
        stat.setText("" + temp.hits());

        //misses
        stat = findViewById(R.id.textView14);
        stat.setText("" + temp.misses());

        //games played
        stat = findViewById(R.id.textView17);
        stat.setText("" + temp.gamesPlayed());

        //wins
        stat = findViewById(R.id.textView18);
        stat.setText("" + temp.wins());

        //losses
        stat = findViewById(R.id.textView19);
        stat.setText("" + temp.losses());

        //win loss
        stat = findViewById(R.id.textView20);
        stat.setText("" + temp.WinLossRatio(temp));

        //hit miss
        stat = findViewById(R.id.textView21);
        stat.setText("" + temp.HitMissRatio(temp));
    }

}