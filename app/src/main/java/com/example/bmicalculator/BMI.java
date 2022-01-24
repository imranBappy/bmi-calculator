package com.example.bmicalculator;
import java.text.DecimalFormat;
import java.util.Scanner;
public class BMI{
    double height; // Meter
    double bmi;
    double weight; // KG
    BMI(double height, double weight){
        this.height = height;
        this.height = (304.8 * height) / 1000 ;
        this.weight = weight;
    }
    public String[] bmiCalculator(){
        DecimalFormat df = new DecimalFormat("0.0");
        this.bmi = weight / (height * height);
        String message[] = new String[2];
        if (bmi <= 18.5) {
            message[0] = "Underweight! You shout have increase your weight.";
        }else if(bmi <= 24.9){
            message[0] = "Normal! You are weight prefect.";
        }else if(bmi >= 25){
            message[0] = "Overweight! You should have deincrease your weight.";
        }
        message[1] = "BMI = " + df.format(bmi);
        return message;
    }
}