package com.fluffy.samrith.lab5_exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InterfataDoi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfata_doi);

        Button btn1 = (Button)findViewById(R.id.button1_2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InterfataDoi.this, "You have clicked on Button 1", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn2 = (Button)findViewById(R.id.button2_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InterfataDoi.this, "You have clicked on Button 2", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
