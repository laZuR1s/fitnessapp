package ru.myitschool.vsu2021.lazarev.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class AboutTheAuthorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w= getWindow();
        w.getDecorView().setSystemUiVisibility((View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)|View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_about_the_author);


        Button btnGoBack= (Button) findViewById(R.id.btn_goBack_from_about_author);
        View.OnClickListener oclGoBack= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext()
                        ,InfoActivity.class));
            }
        };
        btnGoBack.setOnClickListener(oclGoBack);


    }
}