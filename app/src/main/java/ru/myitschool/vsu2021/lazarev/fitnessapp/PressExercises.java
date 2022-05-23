package ru.myitschool.vsu2021.lazarev.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class PressExercises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility((View.SYSTEM_UI_FLAG_HIDE_NAVIGATION) | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.activity_press_exercises);

        Button btnStart = (Button) findViewById(R.id.btn_info_pressEx);

        View.OnClickListener oclBtnGoToSecAct = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext()
                        , PressExInfo.class));
            }
        };
        btnStart.setOnClickListener(oclBtnGoToSecAct);

        Button btnGoBack = (Button) findViewById(R.id.btn_goBack_from_pressEx);
        View.OnClickListener oclGoBack = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext()
                        , ChooseActivity.class));
            }
        };
        btnGoBack.setOnClickListener(oclGoBack);

        Button btnStartEx = (Button) findViewById(R.id.btn_start_pressEx);
        View.OnClickListener oclStartEx = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext()
                        , TimerActivity.class));
            }
        };
        btnStartEx.setOnClickListener(oclStartEx);
    }
}