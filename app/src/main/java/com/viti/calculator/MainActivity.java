package com.viti.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewField;

    private Button buttonNumber0;
    private Button buttonNumber1;
    private Button buttonNumber2;
    private Button buttonNumber3;
    private Button buttonNumber4;
    private Button buttonNumber5;
    private Button buttonNumber6;
    private Button buttonNumber7;
    private Button buttonNumber8;
    private Button buttonNumber9;
    private Button buttonAC;
    private Button buttonC;
    private Button buttonMod;
    private Button buttonDot;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonDiv;
    private Button buttonMult;
    private Button buttonEq;

    private double num1 = 0;
    private double num2 = 0;
    //private double result = 0;

    private Operation currentOperation = Operation.None;
    private Operation previousOperation = Operation.None;

    boolean resultExist = true;
    boolean exist = false;
    boolean equal = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewField = findViewById(R.id.textViewField);

        buttonNumber0 = findViewById(R.id.buttonNum0);
        buttonNumber1 = findViewById(R.id.buttonNum1);
        buttonNumber2 = findViewById(R.id.buttonNum2);
        buttonNumber3 = findViewById(R.id.buttonNum3);
        buttonNumber4 = findViewById(R.id.buttonNum4);
        buttonNumber5 = findViewById(R.id.buttonNum5);
        buttonNumber6 = findViewById(R.id.buttonNum6);
        buttonNumber7 = findViewById(R.id.buttonNum7);
        buttonNumber8 = findViewById(R.id.buttonNum8);
        buttonNumber9 = findViewById(R.id.buttonNum9);
        buttonAC = findViewById(R.id.buttonAC);
        buttonC = findViewById(R.id.buttonC);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMult = findViewById(R.id.buttonMult);
        buttonMod = findViewById(R.id.buttonMod);
        buttonDot = findViewById(R.id.buttonDot);
        buttonEq = findViewById(R.id.buttonEq);

        buttonNumber0.setOnClickListener(this);
        buttonNumber1.setOnClickListener(this);
        buttonNumber2.setOnClickListener(this);
        buttonNumber3.setOnClickListener(this);
        buttonNumber4.setOnClickListener(this);
        buttonNumber5.setOnClickListener(this);
        buttonNumber6.setOnClickListener(this);
        buttonNumber7.setOnClickListener(this);
        buttonNumber8.setOnClickListener(this);
        buttonNumber9.setOnClickListener(this);
        buttonAC.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonMod.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonEq.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonNum0:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                previousOperation = currentOperation;
                TextManager.Add(textViewField, '0');
                break;
            case R.id.buttonNum1:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                previousOperation = currentOperation;
                TextManager.Add(textViewField, '1');
                break;
            case R.id.buttonNum2:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                TextManager.Add(textViewField, '2');
                previousOperation = currentOperation;
                break;
            case R.id.buttonNum3:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                previousOperation = currentOperation;
                TextManager.Add(textViewField, '3');
                break;
            case R.id.buttonNum4:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                previousOperation = currentOperation;
                TextManager.Add(textViewField, '4');
                break;
            case R.id.buttonNum5:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                previousOperation = currentOperation;
                TextManager.Add(textViewField, '5');
                break;
            case R.id.buttonNum6:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                previousOperation = currentOperation;
                TextManager.Add(textViewField, '6');
                break;
            case R.id.buttonNum7:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                TextManager.Add(textViewField, '7');
                previousOperation = currentOperation;
                break;
            case R.id.buttonNum8:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                TextManager.Add(textViewField, '8');
                previousOperation = currentOperation;
                break;
            case R.id.buttonNum9:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                TextManager.Add(textViewField, '9');
                previousOperation = currentOperation;
                break;
            case R.id.buttonDot:
                if(resultExist)
                {
                    resultExist = false;
                    textViewField.setText("");
                }
                TextManager.Add(textViewField, '.');
                break;
            case R.id.buttonAC:
                TextManager.Delete(textViewField, true);
                exist = false;
                break;
            case R.id.buttonC:
                TextManager.Delete(textViewField, false);
                break;
            case R.id.buttonAdd:

                currentOperation = Operation.Add;
                realize("+");

                break;
            case R.id.buttonSub:

                currentOperation = Operation.Sub;
                realize("-");

                break;

            case R.id.buttonDiv:

                currentOperation = Operation.Div;
                realize("/");

                break;

            case R.id.buttonMult:

                currentOperation = Operation.Mult;
                realize("*");

                break;

            case R.id.buttonMod:

                currentOperation = Operation.Mod;
                realize("%");

                break;

            case R.id.buttonEq:

                resultExist = true;

                if (textViewField.getText().length() > 0) {
                    if (!equal) {
                        num2 = Double.parseDouble(textViewField.getText().toString());
                        exist = false;
                        equal = true;
                    } else {

                    }
                    num1 = MathOperations.Eq(num1, num2, currentOperation);
                    textViewField.setText(String.valueOf(num1));
                }

                break;

        }

    }

    private void realize(String s) {

        equal = false;
        if (!exist && textViewField.getText().length() > 0) {
            exist = true;
            num1 = Double.parseDouble(textViewField.getText().toString());
            textViewField.setText("");

        } else if (textViewField.getText().length() > 0) {
            num2 = Double.parseDouble(textViewField.getText().toString());
            num1 = MathOperations.Eq(num1, num2, previousOperation);
            textViewField.setText(String.valueOf(num1));
            resultExist = true;
        }
    }
}
