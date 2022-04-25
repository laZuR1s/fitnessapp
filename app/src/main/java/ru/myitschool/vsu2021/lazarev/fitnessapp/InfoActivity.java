package ru.myitschool.vsu2021.lazarev.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            Window w= getWindow();
            w.getDecorView().setSystemUiVisibility((View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)|View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_info);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bNav);
        bottomNavigationView.setSelectedItemId(R.id.item_other);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId())
            {
                case R.id.item_other:

                    return true;
                case R.id.item_home:
                    startActivity(new Intent(InfoActivity.this,ChooseActivity.class));
                   overridePendingTransition(0,0);
                   return true;
            }
            return false;
        });
    }
}