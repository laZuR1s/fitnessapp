package ru.myitschool.vsu2021.lazarev.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility((View.SYSTEM_UI_FLAG_HIDE_NAVIGATION) | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_choose);

        Button btnPushUps = (Button) findViewById(R.id.btn_pushups);
        View.OnClickListener oclGoToPushUps = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext()
                        , PushUpsActivity.class));
            }
        };
        btnPushUps.setOnClickListener(oclGoToPushUps);


        Button btnPressEx = (Button) findViewById(R.id.btn_press_exercises);
        View.OnClickListener oclGoToPressEx = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext()
                        , PressExercises.class));
            }
        };
        btnPressEx.setOnClickListener(oclGoToPressEx);

        Button btnPullUps = (Button) findViewById(R.id.btn_pullups);
        View.OnClickListener oclGoToPullUps = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext()
                        , PullUpsActivity.class));
            }
        };
        btnPullUps.setOnClickListener(oclGoToPullUps);

        Button btnSitUps = (Button) findViewById(R.id.btn_situps);
        View.OnClickListener oclGoToSitUps = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext()
                        , SitUpsActivity.class));
            }
        };
        btnSitUps.setOnClickListener(oclGoToSitUps);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bNav);
        bottomNavigationView.setSelectedItemId(R.id.item_home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_other:
                        startActivity(new Intent(getApplicationContext()
                                , InfoActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.item_home:
                        return true;

                }
                return false;
            }
        });


    }


}