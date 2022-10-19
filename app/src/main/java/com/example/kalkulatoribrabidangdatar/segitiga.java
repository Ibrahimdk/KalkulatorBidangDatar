package com.example.kalkulatoribrabidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alassgt = (EditText) findViewById(R.id.alassgt);
        final EditText tinggisgt = (EditText) findViewById(R.id.tinggisgt);
        final Button hitungsgt = (Button) findViewById(R.id.btnhasilsgt);
        final TextView hasilsgt = (TextView) findViewById(R.id.hasilhitungsgt);

        hitungsgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alassgt1 = alassgt.getText().toString();
                String tinggisgt1 = tinggisgt.getText().toString();
                double alassgt2 = Double.parseDouble(alassgt1);
                double tinggisgt2 = Double.parseDouble(tinggisgt1);

                double luassgt = alassgt2 * tinggisgt2 / 2 ;
                double kelilingsgt = 3 * alassgt2 ;
                hasilsgt.setText("Luas : "+ luassgt + "  dan  Keliling : "  + kelilingsgt) ;
            }
        });
    }


}