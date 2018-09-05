package com.doors.styles;

import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.doors.substratum.R;

public class ExampleHamburger extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DoorsTheme.checkNoActionBarTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_hamburger);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        try {
            String label = getResources().getString(
                    getPackageManager().getActivityInfo(getComponentName(), 0).labelRes);
            TextView labelTxt = findViewById(R.id.label);
            labelTxt.setText(label);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void openNavBar(@SuppressWarnings("unused") final View v) {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.openDrawer(Gravity.START);
    }

    public void closeNavBar(@SuppressWarnings("unused") final View v) {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(Gravity.START);
    }

    public void menuClick(final View v){
        switch (v.getId()){
            case R.id.one:
                Toast.makeText(ExampleHamburger.this, "User clicked first item!", Toast.LENGTH_LONG).show();
                break;
            case R.id.two:
                Toast.makeText(ExampleHamburger.this, "User clicked second item!", Toast.LENGTH_LONG).show();
                break;
            case R.id.three:
                Toast.makeText(ExampleHamburger.this, "User clicked third item!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
