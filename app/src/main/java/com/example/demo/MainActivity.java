package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    //Initialize variables
    EditText editText;
    Button button;

    String playerName = "";
    FirebaseDatabase database;
    DatabaseReference playerRef;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }//end on create

    public void mainMenu(View v) {
        Intent i = new Intent(this, MainMenu.class);
        startActivity(i);
    }

    private void addEventListener() {
        //read from database
        playerRef.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                //success - continue to the next screen after saving name
                if(!playerName.equals("")) {
                    SharedPreferences preferences = getSharedPreferences("PREFS", 0);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("playerName",playerName);
                    editor.apply();

                    startActivity(new Intent(getApplicationContext(), SetShips.class));
                    finish();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                button.setText("log in");
                button.setEnabled(true);
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        });
    }
}