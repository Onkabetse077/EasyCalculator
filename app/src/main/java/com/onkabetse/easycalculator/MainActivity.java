package com.onkabetse.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import org.mozilla.javascript.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView resultsTV,solutionTV;
MaterialButton buttonC,buttonAC,buttonOpenBracket,buttonCloseBracket,buttonDot;
MaterialButton buttonPlus,buttonMinus,buttonDivide,buttonMultiply,buttonEqual;
MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultsTV = findViewById(R.id.results_tv);
        solutionTV = findViewById(R.id.solution_tv);

        assignId(buttonC,R.id.button_c);
        assignId(buttonAC,R.id.button_ac);
        assignId(buttonDot,R.id.button_dot);
        assignId(buttonOpenBracket,R.id.button_open_bracket);
        assignId(buttonCloseBracket,R.id.button_close_bracket);
        assignId(buttonPlus,R.id.button_plus);
        assignId(buttonMinus,R.id.button_minus);
        assignId(buttonMultiply,R.id.button_multiply);
        assignId(buttonDivide,R.id.button_divide);
        assignId(buttonEqual,R.id.button_equal);
        assignId(button1,R.id.button_1);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);
        assignId(button0,R.id.button_0);
    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        MaterialButton button = (MaterialButton) v;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTV.getText().toString();

        if (buttonText.equals("AC")){
            solutionTV.setText("");
            resultsTV.setText("0");
            return;
        }
        if (buttonText.equals("=")){
            solutionTV.setText(resultsTV.getText());
            return;
        }
        if (buttonText.equals("C")){
            dataToCalculate=dataToCalculate.substring(0,dataToCalculate.length()-1);
        }
        else {
            dataToCalculate = dataToCalculate + buttonText;
        }
        solutionTV.setText(dataToCalculate);
    }

    String getResults(String data){
        return "Calculated";
    }

}