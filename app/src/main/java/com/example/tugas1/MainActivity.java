package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText merk, ukuran, warna;
    TextView hmerk, hukuran, hwarna;
    Button btnsimpan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        merk        = findViewById(R.id.input_merk);
        ukuran         = findViewById(R.id.input_ukuran);
        warna      = findViewById(R.id.input_warna);
        hmerk       = findViewById(R.id.merk);
        hukuran        = findViewById(R.id.ukuran);
        hwarna     = findViewById(R.id.warna);
        btnsimpan   = findViewById(R.id.simpan_button);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smerk, sukuran, swarna;

                smerk = merk.getText().toString().trim();
                sukuran = ukuran.getText().toString().trim();
                swarna = warna.getText().toString().trim();

                hmerk.setText(smerk);
                hukuran.setText(sukuran);
                hwarna.setText(swarna);
            }
        });
    }
}