package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPoint, btnBracket, btnPercent, btnDivision, btnMultiply, btnMinus, btnPlus, btnEqual, btnClear;
    TextView tvInput, tvOutput;
    String process;
    boolean checkBracket=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPoint = findViewById(R.id.btnPoint);
        btnBracket = findViewById(R.id.btnBracket);
        btnPercent = findViewById(R.id.btnPercent);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
        tvInput=findViewById(R.id.tvInput);
        tvOutput=findViewById(R.id.tvOutput);

       btnClear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               tvInput.setText("");
               tvOutput.setText("");
           }
       });

       btn0.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("SetTextI18n")
           @Override
           public void onClick(View v) {
               process=tvInput.getText().toString();
               tvInput.setText(process+"0");
           }
       });

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"9");
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"÷");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"×");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"+");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"−");
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+".");
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"%");
            }
        });
        /* Code for bracket and Equal */
        btnBracket.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(checkBracket){
                    process=tvInput.getText().toString();
                    tvInput.setText(process+")");
                    checkBracket=false;
                }else {
                    process=tvInput.getText().toString();
                    tvInput.setText(process+"(");
                    checkBracket=true;
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"=");
            }
        });















    }
}