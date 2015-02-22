package com.example.sara.h;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choose extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secpa);

        Button nxt = (Button) findViewById(R.id.evaluatebut);

        nxt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(choose.this, selectapp.class));


            }

        });

    }
}