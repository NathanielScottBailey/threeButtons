package com.example.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example.android.threeButtons.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstText(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = "The first message is a winner!";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void SecondText(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = "Yea you picked the second one this is the wrong one...";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void ThirdText(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = "Who would ever pick the third one?";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}