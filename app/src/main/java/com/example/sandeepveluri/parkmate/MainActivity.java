package com.example.sandeepveluri.parkmate;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.EventListener;
import java.util.HashMap;
import java.util.Map;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                final DatabaseReference myRef = database.getReference("b1");
                final DatabaseReference child = myRef.child("flag");


                // Read from the database
                child.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        int value = dataSnapshot.getValue(int.class);
                        if(value == 1){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",0);
                            myRef.updateChildren(map);
                            b1.setBackgroundColor(Color.GREEN);
                            b1.setText("BOOK");
                            Toast.makeText(MainActivity.this, "Spot Released!", Toast.LENGTH_SHORT).show();
                        }

                        if(value == 0){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",1);
                            myRef.updateChildren(map);
                            b1.setBackgroundColor(Color.RED);
                            b1.setText("BOOKED!");
                            Toast.makeText(MainActivity.this, "Spot Booked!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.w(TAG, "Failed to read value.", error.toException());
                    }
                });

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                final DatabaseReference myRef = database.getReference("b2");
                final DatabaseReference child = myRef.child("flag");


                // Read from the database
                child.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        int value = dataSnapshot.getValue(int.class);
                        if(value == 1){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",0);
                            myRef.updateChildren(map);
                            b2.setBackgroundColor(Color.GREEN);
                            b2.setText("BOOK");
                            Toast.makeText(MainActivity.this, "Spot Released!", Toast.LENGTH_SHORT).show();
                        }

                        if(value == 0){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",1);
                            myRef.updateChildren(map);
                            b2.setBackgroundColor(Color.RED);
                            b2.setText("BOOKED!");
                            Toast.makeText(MainActivity.this, "Spot Booked!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.w(TAG, "Failed to read value.", error.toException());
                    }
                });

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                final DatabaseReference myRef = database.getReference("b3");
                final DatabaseReference child = myRef.child("flag");


                // Read from the database
                child.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        int value = dataSnapshot.getValue(int.class);
                        if(value == 1){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",0);
                            myRef.updateChildren(map);
                            b3.setBackgroundColor(Color.GREEN);
                            b3.setText("BOOK");
                            Toast.makeText(MainActivity.this, "Spot Released!", Toast.LENGTH_SHORT).show();
                        }

                        if(value == 0){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",1);
                            myRef.updateChildren(map);
                            b3.setBackgroundColor(Color.RED);
                            b3.setText("BOOKED!");
                            Toast.makeText(MainActivity.this, "Spot Booked!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.w(TAG, "Failed to read value.", error.toException());
                    }
                });

            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                final DatabaseReference myRef = database.getReference("b4");
                final DatabaseReference child = myRef.child("flag");


                // Read from the database
                child.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        int value = dataSnapshot.getValue(int.class);
                        if(value == 1){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",0);
                            myRef.updateChildren(map);
                            b4.setBackgroundColor(Color.GREEN);
                            b4.setText("BOOK");
                            Toast.makeText(MainActivity.this, "Spot Released!", Toast.LENGTH_SHORT).show();
                        }

                        if(value == 0){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",1);
                            myRef.updateChildren(map);
                            b4.setBackgroundColor(Color.RED);
                            b4.setText("BOOKED!");
                            Toast.makeText(MainActivity.this, "Spot Booked!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.w(TAG, "Failed to read value.", error.toException());
                    }
                });

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                final DatabaseReference myRef = database.getReference("b5");
                final DatabaseReference child = myRef.child("flag");


                // Read from the database
                child.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        int value = dataSnapshot.getValue(int.class);
                        if(value == 1){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",0);
                            myRef.updateChildren(map);
                            b5.setBackgroundColor(Color.GREEN);
                            b5.setText("BOOK");
                            Toast.makeText(MainActivity.this, "Spot Released!", Toast.LENGTH_SHORT).show();
                        }

                        if(value == 0){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",1);
                            myRef.updateChildren(map);
                            b5.setBackgroundColor(Color.RED);
                            b5.setText("BOOKED!");
                            Toast.makeText(MainActivity.this, "Spot Booked!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.w(TAG, "Failed to read value.", error.toException());
                    }
                });

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                final DatabaseReference myRef = database.getReference("b6");
                final DatabaseReference child = myRef.child("flag");


                // Read from the database
                child.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        int value = dataSnapshot.getValue(int.class);
                        if(value == 1){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",0);
                            myRef.updateChildren(map);
                            b6.setBackgroundColor(Color.GREEN);
                            b6.setText("BOOK");
                            Toast.makeText(MainActivity.this, "Spot Released!", Toast.LENGTH_SHORT).show();
                        }

                        if(value == 0){
                            Map <String,Object> map = new HashMap<>();
                            map.put("flag",1);
                            myRef.updateChildren(map);
                            b6.setBackgroundColor(Color.RED);
                            b6.setText("BOOKED!");
                            Toast.makeText(MainActivity.this, "Spot Booked!", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.w(TAG, "Failed to read value.", error.toException());
                    }
                });

            }
        });
    }
}
