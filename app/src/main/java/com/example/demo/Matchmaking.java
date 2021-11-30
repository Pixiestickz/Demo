package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Matchmaking extends AppCompatActivity {

    ListView listView;
    Button button;

    List<String> roomsList;

    String playerName = "";
    String roomName = "";

    FirebaseDatabase database;
    DatabaseReference roomRef;
    DatabaseReference roomsRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchmaking);

    }

    public void setShips(View v) {
        Intent i = new Intent(this, SetShips.class);
        startActivity(i);
    }

    private void addRoomEventListener() {
        roomRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //join the room
                button.setText("CREATE ROOM");
                button.setEnabled(true);
                Intent intent = new Intent(getApplicationContext(), SetShips.class);
                intent.putExtra("roomName", roomName);
                startActivity(intent);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //error

                button.setText("CREATE ROOM");
                button.setEnabled(true);
                Toast.makeText(Matchmaking.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addRoomsEventListener() {
        roomsRef = database.getReference("rooms");
        roomsRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //show list of rooms
                roomsList.clear();
                Iterable<DataSnapshot> rooms = dataSnapshot.getChildren();
                for(DataSnapshot snapshots: rooms) {
                    roomsList.add(dataSnapshot.getKey());
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(Matchmaking.this, android.R.layout.simple_list_item_1, roomsList);
                    listView.setAdapter(adapter);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //error; nothing
            }
        });
    }

}