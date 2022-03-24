package com.example.calcudomemeu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nmr1,nmr2;
    Button btsoma;
    TextView rsltd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nmr1 = findViewById(R.id.nmr1);
        nmr2 = findViewById(R.id.nmr2);
        btsoma = findViewById(R.id.btsoma);
        rsltd = findViewById(R.id.rsltd);
    }

    public void somar (View v) {
    int soma = Integer.parseInt(nmr1.getText().toString()) + Integer.parseInt(nmr2.getText().toString()) ;
    rsltd.setText(String.valueOf(soma));
    }


}
