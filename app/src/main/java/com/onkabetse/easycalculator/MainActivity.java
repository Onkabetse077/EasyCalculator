package com.onkabetse.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView resultsTV,solutionTV;
MaterialButton buttonC,buttonAC,buttonOpenBracket,buttonCloseBracket,buttonDot;
MaterialButton buttonPlus,buttonMinus,buttonDivide,buttonMultiply,buttonEqual;
MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        resultsTV = findViewById(R.id.results_tv);
        solutionTV = findViewById(R.id.solution_tv);

        assignId(buttonC,R.id.button_c);
    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }
}