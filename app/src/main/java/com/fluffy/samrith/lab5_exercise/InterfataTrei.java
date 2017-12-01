package com.fluffy.samrith.lab5_exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class InterfataTrei extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfata_trei);

        CheckBox chBox = (CheckBox)findViewById(R.id.chkRememberPassword);
        chBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InterfataTrei.this, "you have clicked on Button Remember ", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnSignIn = (Button)findViewById(R.id.buttonSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InterfataTrei.this, "You have clicked on Button Log In ", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
