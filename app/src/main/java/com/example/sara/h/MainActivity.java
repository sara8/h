package com.example.sara.h;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //massage confirm user Registration when clicking the button
        Button msg = (Button) findViewById(R.id.nextbut);
        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"You have been registered!",Toast.LENGTH_SHORT).show();
                //open new activity when clicking the button
                startActivity(new Intent(MainActivity.this,choose.class));

            }
        });
    }
