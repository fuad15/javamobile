package com.example.toshiba.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MenuActivity extends AppCompatActivity {
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_activity, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            startActivity(new Intent(this, MainActivity.class));
        } else if (item.getItemId() == R.id.menu2) {
            startActivity(new Intent(this, AboutActivity.class));
        } else if (item.getItemId() == R.id.menu3) {
            startActivity(new Intent(this, TentangSaya.class));
        }

        return true;
    }
}
