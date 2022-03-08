package com.example.starterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DateIntervalFormat;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    String password = "1234";// The password for the phone
    String input = "";// the string that will take input from the user

    //Creating button objects to represent the buttons on the page
    Button button1;//1
    Button button2;//2
    Button button3;//3
    Button button4;//4
    Button submitbtn;//The submit button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1 = findViewById(R.id.button1);// set button1 to the button on the xml file with the id of button1
        button2 = findViewById(R.id.button2);// set button2 to the button on the xml file with the id of button2
        button3 = findViewById(R.id.button3);// set button3 to the button on the xml file with the id of button3
        button4 = findViewById(R.id.button4);// set button4 to the button on the xml file with the id of button4
        submitbtn = findViewById(R.id.submitbtn);// set submitbtn to the button on the xml file with the if of submitbtn

        // Adds number 1 to input when clicked
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input.concat("1");
            }
        });

        // Adds 2 to input when clicked
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input.concat("2");
            }// End of the onClick
        });

        // Adds 3 to input when clicked
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input.concat("3");
            }// End of the onClick
        });

        // Adds 4 to input when clicked
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = input.concat("4");
            }// End of the onClick
        });


        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                if(password.equals(input)){
                    intent.putExtra("Message","The App is now Unlocked!");
                }else{
                    intent.putExtra("Message","Welcome to the App! The App is LOCKED!");
                }
                startActivity(intent);
            }
        });
    }
}