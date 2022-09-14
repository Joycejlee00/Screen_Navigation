package com.example.screennavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView folder, android, videoIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        folder = findViewById(R.id.folderImage);
        android = findViewById(R.id.androidImage);
        videoIcon = findViewById(R.id.videoImage);

    }

    public void startSecond(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void startThird(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void startFourth(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}