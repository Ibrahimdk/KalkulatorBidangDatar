package com.example.kalkulatoribrabidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        final EditText sisi = (EditText) findViewById(R.id.alas);
        final Button hitung = (Button) findViewById(R.id.btnhasilpsg);
        final TextView hasil = (TextView) findViewById(R.id.hasilhitungpsg);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisi1 = sisi.getText().toString();
                double sisi2 = Double.parseDouble(sisi1);

                double luas = sisi2 * sisi2;
                double keliling = 4 * sisi2;
                hasil.setText("Luas : " + luas +"  dan  Keliling : " + keliling);
            }
        });
    }
}