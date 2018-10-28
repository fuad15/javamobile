package com.example.toshiba.menu;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tampilan;
    EditText fieldnama, fieldemail;
    RadioGroup jekel;
    CheckBox berenang, futsal, basket;
    Button tampilkan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampilan = findViewById(R.id.utampilan);
        fieldnama = findViewById(R.id.fieldnama);
        fieldemail = findViewById(R.id.fieldemail);
        jekel = findViewById(R.id.idbatten);
        berenang = findViewById(R.id.checkBox);
        futsal = findViewById(R.id.checkBox2);
        basket = findViewById(R.id.checkBox3);
        tampilkan = findViewById(R.id.button);

        tampilkan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String inputnama = String.valueOf(fieldnama.getText().toString());
                String inputemail = String.valueOf(fieldemail.getText().toString());

                int batten = jekel.getCheckedRadioButtonId();
                RadioButton jekel = findViewById(batten);
                String inputjk = String.valueOf(jekel.getText().toString());

                if (!berenang.isChecked() && !futsal.isChecked() && !basket.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Kegiatan Belum Dipilih", Toast.LENGTH_SHORT).show();
                } else {
                    String a = "";
                    if (berenang.isChecked()) a += "Berenang ";
                    String b = "";
                    if (futsal.isChecked()) b += "Futsal ";
                    String c = "";
                    if (basket.isChecked()) {
                        c += "Basket ";
                    }

                    tampilan.setText("\n" +
                            "Nama\t\t\t\t\t\t\t: " + inputnama + "\n\n" +
                            "E-mail\t\t\t\t\t\t: " + inputemail + "\n\n" +
                            "Jenis Kelamin\t\t\t: " + inputjk + "\n\n" +
                            "Kegiatan\t\t\t\t\t: " + a + "" + b + "" + c);
                }
            }
        });
    }


}
