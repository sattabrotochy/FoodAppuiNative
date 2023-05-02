package com.example.foodappuinative.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodappuinative.R;

public class IntroActivity extends AppCompatActivity {

    private ConstraintLayout startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_activity);

        viewBinding();
        startButton.setOnClickListener(view -> {
            startActivity(new Intent(IntroActivity.this,MainActivity.class));
        });

    }

    private void viewBinding() {
        startButton=findViewById(R.id.startBtn);
    }


}