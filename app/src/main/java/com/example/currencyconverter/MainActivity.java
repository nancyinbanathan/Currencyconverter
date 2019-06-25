package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToInr(View view){
        EditText currencyEditText = (EditText) findViewById(R.id.currencyEditText);
        Double amountInr = 70 * Double.parseDouble(currencyEditText.getText().toString());
        Log.i("amount ",currencyEditText.getText().toString());
        Log.i("INR",amountInr.toString());
        Toast.makeText(MainActivity.this, amountInr.toString(), Toast.LENGTH_LONG).show();
    }
    public void convertToUsd(View view){
        EditText currencyEditText = (EditText) findViewById(R.id.currencyEditText);
        Double amountUsd = Double.parseDouble(currencyEditText.getText().toString())/70;
        Log.i("amount ",currencyEditText.getText().toString());
        Log.i("USD",String.format("%.2f", amountUsd).toString());
        Toast.makeText(MainActivity.this, "$"+String.format("%.2f", amountUsd).toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
