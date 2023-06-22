package com.example.biomastery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void evaluasi(View view) {
        Intent evaluasi = new Intent(DashboardActivity.this, EvaluasiActivity.class);
        startActivity(evaluasi);
    }

    public void achievement(View view) {
        Intent achievement = new Intent(DashboardActivity.this, AchievementActivity.class);
        startActivity(achievement);
    }

    public void materi(View view) {
        Intent materi = new Intent(DashboardActivity.this, MateriActivity.class);
        startActivity(materi);
    }

    public void tutorial(View view) {
        Intent tutorial = new Intent(DashboardActivity.this, TutorialActivity.class);
        startActivity(tutorial);
    }

    public void scan(View view) {
        Intent scan = new Intent(DashboardActivity.this, ScanActivity.class);
        startActivity(scan);
    }
}