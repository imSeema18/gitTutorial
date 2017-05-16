package com.example.seema.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMusic;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMusic = (Button)findViewById(R.id.btn_music);
        btnMusic.setOnClickListener(this);

    }

/* function to call new activity for Music*/
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_music) {
            Intent intent = new Intent(getApplicationContext(),MainMusic.class);
            startActivity(intent);
        }
    }
    }