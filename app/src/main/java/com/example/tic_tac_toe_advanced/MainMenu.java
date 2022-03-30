package com.example.tic_tac_toe_advanced;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }

    public void onButtonClick_MainMenu (View view) {
        Intent intent = new Intent(this, ModeScreen.class);
        startActivity(intent);
    }
}