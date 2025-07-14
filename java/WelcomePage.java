package com.example.buddy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomePage extends AppCompatActivity {

    Button btnLoginNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        btnLoginNow = findViewById(R.id.btnLoginNow);

        btnLoginNow.setOnClickListener(v -> {
            startActivity(new Intent(WelcomePage.this, LoginPage.class));
            finish();
        });
    }
}