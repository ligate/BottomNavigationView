package com.tityat.crafting.craftguide.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);

       bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
               switch ((item.getItemId())){
                   case R.id.dashboard:
//                       startActivity(new Intent(getApplicationContext(),Home.class));
//                       overridePendingTransition(0,0);
                       return true;
                   case R.id.home:
                       startActivity(new Intent(getApplicationContext(),Home.class));
                       overridePendingTransition(0,0);
                       return true;
                   case R.id.about:
                       startActivity(new Intent(getApplicationContext(),About.class));
                       overridePendingTransition(0,0);
                       return true;

               }
               return false;
           }
       });
    }
}