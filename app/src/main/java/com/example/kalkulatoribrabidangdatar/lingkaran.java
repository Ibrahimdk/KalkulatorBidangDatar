package com.example.kalkulatoribrabidangdatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        final EditText jarijari = (EditText) findViewById(R.id.jarijari);
        final Button hitungling = (Button) findViewById(R.id.btnhasilling);
        final TextView hasilling = (TextView) findViewById(R.id.hasilhitungling);

        hitungling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jari1 = jarijari.getText().toString();
                double jari2 = Double.parseDouble(jari1);
                if(jari2%7==0){
                    double luas = 22/7 * jari2 * jari2;
                    double keliling = 2 * 22/7 * jari2;
                    hasilling.setText("Luas : " + luas + "  dan  Keliling : " + keliling);

                }
                else{
                    double luas = 3.14 * jari2 * jari2;
                    double keliling = 2 * 3.14 * jari2;
                    hasilling.setText("Luas : " + luas +"  dan  Keliling : " + keliling);
                }
            }
        });
    }
}