package com.example.starterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    Button unlockbtn;// To represent the unlock button on the page.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// Get the content from the page

        String welcome = "Welcome to the App! The App is LOCKED!";// message to be shown on the page at first

        TextView welcometxt = (TextView) findViewById(R.id.welcometxt);// This gets the welcome message on the first page and stores in this variable

        if(getIntent().getStringExtra("Message")!= null) {
            welcome = getIntent().getStringExtra("Message");
        }

        welcometxt.setText(welcome);// Sets the welcome message to the string stored in he welcome variable.

        unlockbtn = findViewById(R.id.unlockbtn);// Stores the button with the id of "unblockbtn" to the variable.

        unlockbtn.setOnClickListener(new View.OnClickListener(){
            //When the button is clicked the intent takes us to the age we placed in the parameters
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);// Calls that page to be shown to us
            }// End of the onClick method
        });// End of the setOnClickLister for the unlock button

    }// End of the onCreate method

}// End of the class