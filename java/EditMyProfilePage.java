package com.example.buddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EditMyProfilePage extends AppCompatActivity {

    BottomNavigationView bottomNavView;
    FloatingActionButton btnDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_my_profile_page);

        bottomNavView = findViewById(R.id.bottomNavView);
        bottomNavView.setSelectedItemId(R.id.nav_myProfile);
        btnDashboard = findViewById(R.id.btnDashboard);

        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditMyProfilePage.this, DashboardPage.class);
                startActivity(intent);
                finish();
            }
        });

        bottomNavView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.nav_listFriend) {
                    startActivity(new Intent(getApplicationContext(), ListFriendsPage.class));
                    overridePendingTransition(0, 0);
                    return true;
                } else if (id == R.id.nav_myProfile) {
                    startActivity(new Intent(getApplicationContext(), MyProfilePage.class));
                    overridePendingTransition(0, 0);
                    return true;
                }

                return false;
            }
        });
    }
}
