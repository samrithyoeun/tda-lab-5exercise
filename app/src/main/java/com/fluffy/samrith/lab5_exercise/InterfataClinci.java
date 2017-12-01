package com.fluffy.samrith.lab5_exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InterfataClinci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfata_clinci);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InterfataClinci.this, "You have clicked on Button1", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 = (Button)findViewById(R.id.button1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InterfataClinci.this, "You have clicked on Button2", Toast.LENGTH_SHORT).show();
            }
        });

        Button button3 = (Button)findViewById(R.id.button1);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InterfataClinci.this, "You have clicked on Button3", Toast.LENGTH_SHORT).show();
            }
        });

        Button button4 = (Button)findViewById(R.id.button1);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InterfataClinci.this, "You have clicked on Button4", Toast.LENGTH_SHORT).show();
            }
        });

        Button button5 = (Button)findViewById(R.id.button1);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InterfataClinci.this, "You have clicked on Button5", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
