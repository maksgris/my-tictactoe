package com.example.tic_tac_toe_advanced;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ModeScreen extends AppCompatActivity {

    private EditText edit;
    public int fieldSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mode_screen);
    }
    public void onButtonClick_ModeScreen (View view) {
        edit = findViewById(R.id.editTextFieldSize);

        if (edit.getText() != null) {
            try {
                fieldSize = Integer.parseInt(edit.getText().toString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        Intent intent = new Intent(this, GameScreen.class);
        intent.putExtra("fieldSize", fieldSize);
        startActivity(intent);
    }
}
