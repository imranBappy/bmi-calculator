package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private Button calculateBtn ;
    private Button resetBtn ;

    private EditText inputHeight ;
    private EditText inputWeight ;

    private TextView showBTM ;
    private TextView showMessage  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateBtn = (Button)findViewById(R.id.calculate_btn);
        resetBtn = (Button)findViewById(R.id.reset_btn);

        inputHeight = (EditText) findViewById(R.id.input_height);
        inputWeight = (EditText) findViewById(R.id.input_weight);

        showBTM = (TextView) findViewById(R.id.show_bmi);
        showMessage = (TextView) findViewById(R.id.show_mes);

        calculateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double height = Double.parseDouble( inputHeight.getText().toString());
                double weight = Double.parseDouble( inputWeight.getText().toString());

                BMI bmi = new BMI(height, weight);

                String[] result = bmi.bmiCalculator();

                showBTM.setText(result[1]);
                showMessage.setText(result[0]);
            }
        });
        resetBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                inputHeight.setText("");
                inputWeight.setText("");
                showBTM.setText("");
                showMessage.setText("");
            }
        });

    }

}