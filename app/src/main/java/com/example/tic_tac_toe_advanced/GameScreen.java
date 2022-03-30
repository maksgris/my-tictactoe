package com.example.tic_tac_toe_advanced;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GameScreen extends AppCompatActivity implements View.OnClickListener {

    public int activePlayer = 1;
    public int[] fArr = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_screen);
        int fieldSize = getIntent().getIntExtra("fieldSize", 9);
        Button button1 = (Button) findViewById(R.id.cell0);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.cell1);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.cell2);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.cell3);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.cell4);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.cell5);
        button6.setOnClickListener(this);
        Button button7 = (Button) findViewById(R.id.cell6);
        button7.setOnClickListener(this);
        Button button8 = (Button) findViewById(R.id.cell7);
        button8.setOnClickListener(this);
        Button button9 = (Button) findViewById(R.id.cell8);
        button9.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cell0: {  }
            case R.id.cell1: {  }
            case R.id.cell2: {  }
            case R.id.cell3: {  }
            case R.id.cell4: {  }
            case R.id.cell5: {  }
            case R.id.cell6: {  }
            case R.id.cell7: {  }
            case R.id.cell8: {  }
        }
    }

    public void switchPlayer() { activePlayer = ((activePlayer == 1) ? 2 : 1); }

    public void judge() {
        int win = 0;

    }
}
