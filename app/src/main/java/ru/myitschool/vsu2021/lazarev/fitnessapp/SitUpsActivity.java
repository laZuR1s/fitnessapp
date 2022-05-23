package ru.myitschool.vsu2021.lazarev.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class SitUpsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility((View.SYSTEM_UI_FLAG_HIDE_NAVIGATION) | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_sit_ups);


        Button btnStart = (Button) findViewById(R.id.btn_info_situps);

        View.OnClickListener oclBtnGoToSecAct = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext()
                        , SitUpsInfo.class));
            }
        };
        btnStart.setOnClickListener(oclBtnGoToSecAct);

        Button btnGoBack = (Button) findViewById(R.id.btn_goBack_from_sithups);
        View.OnClickListener oclGoBack = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext()
                        , ChooseActivity.class));
            }
        };
        btnGoBack.setOnClickListener(oclGoBack);
        Button btnStartEx = (Button) findViewById(R.id.btn_start_SitUps);
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