package com.example.aashish.basicstartingapp;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     textView=(TextView)findViewById(R.id.text);
        navigationView=(NavigationView)findViewById(R.id.navigation);
        drawerLayout=(DrawerLayout)findViewById(R.id.activity_main);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.nav_home:
                       drawerLayout.closeDrawer(GravityCompat.START);
                        return true;

                    case R.id.nav_photos:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.nav_movies:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.nav_notifications:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.nav_settings:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.nav_about_us:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    case R.id.nav_privacy_policy:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                }


                return false;
            }
        });


    }


}
