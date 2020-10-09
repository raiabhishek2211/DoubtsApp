package com.example.shopgram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity {

    Button student,teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome_screen);

        student= findViewById(R.id.student);

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(WelcomeScreen.this, StudentLogin.class);
                startActivity(intent);
            }
        });
        teacher= findViewById(R.id.teacher);

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(WelcomeScreen.this, teacherLogin.class);
                startActivity(intent);
            }
        });

    }
}
