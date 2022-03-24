package com.example.myapplicationmemeu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.voice.VisibleActivityInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText nmr1, nmr2;
    Button btsoma, btsubtrair, btmultp, btdvsao;
    TextView rsltd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nmr1 = findViewById(R.id.nmr1);
        nmr2 = findViewById(R.id.nmr2);
        btsoma = findViewById(R.id.btsoma);
        btsubtrair = findViewById(R.id.btsubtrair);
        btmultp = findViewById(R.id.btmultp);
        btdvsao = findViewById(R.id.btdvsao);
        rsltd = findViewById(R.id.rsltd);

        btsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soma = Integer.parseInt(nmr1.getText().toString()) + Integer.parseInt(nmr2.getText().toString());
                rsltd.setText(String.valueOf(soma));
            }
        });
        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int subtrair = Integer.parseInt(nmr1.getText().toString()) - Integer.parseInt(nmr2.getText().toString());
                rsltd.setText(String.valueOf(subtrair));
            }
        });
        btmultp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int multp = Integer.parseInt(nmr1.getText().toString()) * Integer.parseInt(nmr2.getText().toString());
                rsltd.setText(String.valueOf(multp));
            }
        });
        btdvsao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dvsao = Integer.parseInt(nmr1.getText().toString()) / Integer.parseInt(nmr2.getText().toString());
                rsltd.setText(String.valueOf(dvsao));
            }
        });
    }
}
