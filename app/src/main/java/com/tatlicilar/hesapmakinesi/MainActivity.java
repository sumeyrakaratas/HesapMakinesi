package com.tatlicilar.hesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnToplama, btnCikarma, btnCarpma, btnBolme, btnHesapla, btnSifirla;
    TextView txtHesap;

    private int ilkDeger = 0, sonuc = 0;

    private String islem;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnSifirla = (Button) findViewById(R.id.btnSifirla);
        btnToplama = (Button) findViewById(R.id.btnToplama);
        btnCikarma = (Button) findViewById(R.id.btnCikarma);
        btnCarpma = (Button) findViewById(R.id.btnCarpma);
        btnBolme = (Button) findViewById(R.id.btnBolme);
        btnHesapla = (Button) findViewById(R.id.btnHesapla);

        txtHesap = (TextView) findViewById(R.id.textView2);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnToplama.setOnClickListener(this);
        btnCikarma.setOnClickListener(this);
        btnCarpma.setOnClickListener(this);
        btnBolme.setOnClickListener(this);
        btnHesapla.setOnClickListener(this);
        btnSifirla.setOnClickListener(this);

    }

    public void onClick(View src) {
        int hane = txtHesap.getText().length();
        if (hane < 9) {
            switch (src.getId()) {
                case R.id.btn0:
                    txtHesap.setText(txtHesap.getText().toString() + "0");
                    break;
                case R.id.btn1:
                    txtHesap.setText(txtHesap.getText().toString() + "1");
                    break;
                case R.id.btn2:
                    txtHesap.setText(txtHesap.getText().toString() + "2");
                    break;
                case R.id.btn3:
                    txtHesap.setText(txtHesap.getText().toString() + "3");
                    break;
                case R.id.btn4:
                    txtHesap.setText(txtHesap.getText().toString() + "4");
                    break;
                case R.id.btn5:
                    txtHesap.setText(txtHesap.getText().toString() + "5");
                    break;
                case R.id.btn6:
                    txtHesap.setText(txtHesap.getText().toString() + "6");
                    break;
                case R.id.btn7:
                    txtHesap.setText(txtHesap.getText().toString() + "7");
                    break;
                case R.id.btn8:
                    txtHesap.setText(txtHesap.getText().toString() + "8");
                    break;
                case R.id.btn9:
                    txtHesap.setText(txtHesap.getText().toString() + "9");
                    break;

                case R.id.btnToplama:
                    if (!txtHesap.getText().toString().equals("")) {
                        ilkDeger = Integer.parseInt(txtHesap.getText().toString());
                        txtHesap.setText("");
                        islem = "Toplama";
                    } else {
                        Toast.makeText(this, "Deger giriniz", Toast.LENGTH_SHORT).show();
                    }
                    break;


                case R.id.btnCikarma:
                    if (!txtHesap.getText().toString().equals("")) {
                        ilkDeger = Integer.parseInt(txtHesap.getText().toString());
                        txtHesap.setText("");
                        islem = "Cikarma";
                    } else {
                        Toast.makeText(this, "Deger giriniz", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.btnCarpma:
                    if (!txtHesap.getText().toString().equals("")) {
                        ilkDeger = Integer.parseInt(txtHesap.getText().toString());
                        txtHesap.setText("");
                        islem = "Carpma";
                    } else {
                        Toast.makeText(this, "Deger giriniz", Toast.LENGTH_SHORT).show();
                    }

                    break;
                case R.id.btnBolme:
                    if (!txtHesap.getText().toString().equals("")) {
                        ilkDeger = Integer.parseInt(txtHesap.getText().toString());
                        txtHesap.setText("");
                        islem = "Bolme";
                    } else {
                        Toast.makeText(this, "Deger giriniz", Toast.LENGTH_SHORT).show();
                    }

                    break;
                case R.id.btnHesapla:
                    if (!txtHesap.getText().toString().equals("")
                            && !String.valueOf(ilkDeger).equals("0")) {
                        if (islem.equals("Toplama")) {
                            sonuc = ilkDeger
                                    + Integer.parseInt(txtHesap.getText().toString());
                        } else if (islem.equals("Cikarma")) {
                            sonuc = ilkDeger
                                    - Integer.parseInt(txtHesap.getText().toString());

                        } else if (islem.equals("Bolme")) {
                            sonuc = ilkDeger
                                    / Integer.parseInt(txtHesap.getText().toString());
                        } else if (islem.equals("Carpma")) {
                            sonuc = ilkDeger
                                    * Integer.parseInt(txtHesap.getText().toString());
                        }
                        txtHesap.setText(String.valueOf(sonuc));
                        ilkDeger = 0;
                        sonuc = 0;

                    } else {

                        Toast.makeText(this, "Deger Giriniz", Toast.LENGTH_SHORT).show();

                    }
                    break;
            }
        } else {
            Toast.makeText(this, "9 haneden kücük giriniz", Toast.LENGTH_SHORT).show();
        }

        if (R.id.btnSifirla == src.getId()) {
            ilkDeger = 0;
            sonuc = 0;
            txtHesap.setText("");
        }
    }

    }
