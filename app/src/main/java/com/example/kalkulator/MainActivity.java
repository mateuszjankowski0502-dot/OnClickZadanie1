package com.example.kalkulator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.tvTitle);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        btn1.setOnClickListener(v -> appendSymbol("1"));
        btn2.setOnClickListener(v -> appendSymbol("2"));
        btn3.setOnClickListener(v -> appendSymbol("3"));
        btn4.setOnClickListener(v -> appendSymbol("4"));
        btn5.setOnClickListener(v -> appendSymbol("5"));
        btn6.setOnClickListener(v -> appendSymbol("6"));
        btn7.setOnClickListener(v -> appendSymbol("7"));
        btn8.setOnClickListener(v -> appendSymbol("8"));
        btn9.setOnClickListener(v -> appendSymbol("9"));
    }
    private void appendSymbol(String symbol) {
        tvDisplay.setText(tvDisplay.getText().toString() + symbol);
    }
}