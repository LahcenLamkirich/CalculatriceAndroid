package com.example.calculatrice;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // la declaration des buttons :
    Button btnAc, btnP1, btnP2, btnSin, btnCos, btnTang, btnLog, btnLn, btnFact, btnCarre, btnRacine, btnDivPar1, btnDiv, btn7, btn8, btn9, btn5, btn4, btn3, btn2, btn1, btn0, btnPi, btnPoint, btnEgale, btnPlus, btnMinus, btnMulti, btn6;
    // la declaration des Text Views :
    TextView txtMain, txtSeconde;

    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); // to remove the default app Bar
        // Association des Button :
        btnAc = findViewById(R.id.btnAc);
        btnP1 = findViewById(R.id.btnP1);
        btnP2 = findViewById(R.id.btnP2);
        btnSin = findViewById(R.id.btnSin);
        btnCos = findViewById(R.id.btnCos);
        btnTang = findViewById(R.id.btnTang);
        btnLog = findViewById(R.id.btnLog);
        btnLn = findViewById(R.id.btnLn);
        btnFact = findViewById(R.id.btnFact);
        btnCarre = findViewById(R.id.btnCarre);
        btnRacine = findViewById(R.id.btnSqrt);
        btnDivPar1 = findViewById(R.id.btnDivpar1);
        btnDiv = findViewById(R.id.btnDiv);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn6 = findViewById(R.id.btn6);
        btn5 = findViewById(R.id.btn5);
        btn4 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        btn0 = findViewById(R.id.btn0);
        btnPi = findViewById(R.id.btnPi);
        btnPoint = findViewById(R.id.btnPoint);
        btnEgale = findViewById(R.id.btnEgale);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMult);
        // la declaration de l'operateur :
        final String[] op = {null};
        // Asscociation des Text View :
        txtMain = findViewById(R.id.TextViewFirst);
        txtSeconde = findViewById(R.id.TextViewSecond);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + "9");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + "6");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + "3");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + "0");
            }
        });
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText("");
                txtSeconde.setText("");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText() + ".");
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText(txtMain.getText().toString() + "0");
                txtSeconde.setText(txtMain.getText());
                txtMain.setText("");
                op[0] = "c" ;
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSeconde.setText(txtMain.getText());
                txtMain.setText("");
                op[0] = "+";
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSeconde.setText(txtMain.getText());
                txtMain.setText("");
                op[0] = "-";
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSeconde.setText(txtMain.getText());
                txtMain.setText("");
                op[0] = "/";
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSeconde.setText(txtMain.getText());
                txtMain.setText("");
                op[0] = "*";
            }
        });


        btnEgale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(txtSeconde.getText().toString());
                double number2 = Double.parseDouble(txtMain.getText().toString());

                double result = 0;

                System.out.println("Operateur est : " + op[0]);
                switch (op[0]){
                    case "+":
                            result = number1 + number2 ;
                            break;
                    case "-":
                            result = number1 - number2 ;
                            break;
                    case "*" :
                            result = number1 * number2 ;
                            break;
                    case "/":
                            result = number1 / number2 ;
                            break;
                    case "c":
                            result = Math.cos(number2);
                            break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + op[0]);
                }

                System.out.println(op[0]);
                txtMain.setText("");
                txtSeconde.setText("");
                txtMain.setText(String.valueOf(result));
            }
        });
    }
}