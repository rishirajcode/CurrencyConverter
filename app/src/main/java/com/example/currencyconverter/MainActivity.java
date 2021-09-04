package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.google.android.filament.View;

public class MainActivity extends AppCompatActivity {

    //    public void currency(View view){
        public void currencyExchange() {
            currencyExchange();
        }

    //    public void currency(View view){
        public void currencyExchange (View view)   {

        Log.i("info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editvalue);

        String amountInRs = editText.getText().toString();

        double amountInRsDouble = Double.parseDouble(amountInRs);

        double amountInDollarDouble = 75 * amountInRsDouble ;

        String amountInRsString = Double.toString(amountInDollarDouble);

        Log.i("Info", editText.getText().toString());


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}