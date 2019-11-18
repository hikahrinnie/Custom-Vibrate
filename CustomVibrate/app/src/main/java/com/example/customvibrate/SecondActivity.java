package com.example.customvibrate;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import static android.view.MotionEvent.ACTION_BUTTON_PRESS;

public class SecondActivity extends AppCompatActivity {
    // Button creation
    Vibrator vibrator;
    Button firstToneBtn;
    Button secToneBtn;
    public int firstToneCount;
    public int secToneCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //First button listener
        Button firstToneBtn = findViewById(R.id.Tone1);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        firstToneBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //sets vibration intensity for 1st button
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(100, 80));
                } else {
                    vibrator.vibrate(200);
                }
            }

        });

        //Second button listener
        Button secToneBtn = findViewById(R.id.Tone2);
        secToneBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //sets vibration intensity for 2nd button
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(200, 255));
                } else {
                    vibrator.vibrate(200);
                }
            }

        });
    }

    public int getFirstToneCount() {

        if (firstToneBtn.isPressed()) {
            int firstToneCount = ACTION_BUTTON_PRESS;
            //records how many times button is pressed
        }
        return firstToneCount;
    }

    public int getSecToneCount() {

        if (secToneBtn.isPressed()) {
            int secToneCount = ACTION_BUTTON_PRESS;
            //records how many times button was pressed
        }
        return secToneCount;
    }

    public void getPattern(int firstToneCount, int secToneCount){

    }
}





