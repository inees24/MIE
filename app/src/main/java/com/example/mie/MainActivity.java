package com.example.mie;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_cnx;
    TextView tv_ins;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mGreetingText;
        mGreetingText = (TextView) findViewById(R.id.activity_main_greeting_txt);
        btn_cnx = (Button) findViewById(R.id.btn_cnx);
        tv_ins = (TextView) findViewById(R.id.tv_ins);
        btn_cnx.setOnClickListener(this);
        tv_ins.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cnx:
                Toast.makeText(getApplicationContext(), "Vous avez cliquez sur le bouton connecter", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_ins:
                Intent i = new Intent(this, menuinscription.class);
                startActivity(i);
        }
    }

     private Menu m = null;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        m = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_CP:
                m.setGroupEnabled(R.id.menu_CP, true);
                Toast.makeText(this, "menu CP sélectionné", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_CE1:
                Toast.makeText(this, "menu CE1 sélectionné", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_CE2:
                Toast.makeText(this, "menu CE2 sélectionné", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_CM1:
                Toast.makeText(this, "menu CM1 sélectionné", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_CM2:
                Toast.makeText(this, "menu CM2 sélectionné", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_CP2:
                Toast.makeText(this, "menu CP sélectionné", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_CE12:
                Toast.makeText(this, "menu exercice CE1 sélectionné", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_CE22:
                Toast.makeText(this, "menu exercice CE2 sélectionné", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_CM12:
                Toast.makeText(this, "menu exercice CM1 sélectionné", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_CM22:
                Toast.makeText(this, "menu exercice CM2 sélectionné", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}