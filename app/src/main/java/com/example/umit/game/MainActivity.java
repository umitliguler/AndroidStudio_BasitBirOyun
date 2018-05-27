package com.example.umit.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener ,EditText.OnEditorActionListener{
    // başlangıçta implemen yoktu biz bu class  ın dinleme özelliği olduğunu söylemek için kullandık
    TextView tv;
    TextView tvKarakterOzellikleri;
    int sayac=0;
    Button bSaldir;
    karakter k;
    EditText isim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//orginalde var
        super.onCreate(savedInstanceState);//orginalde var
        setContentView(R.layout.activity_main);//orginalde var


        tv = (TextView ) findViewById(R.id.eylem);//text nin id sini al tv objesine ata
        tvKarakterOzellikleri = (TextView ) findViewById(R.id.message);//text nin id sini al tvKarakterOzellikleri objesine ata

        bSaldir= (Button) findViewById(R.id.saldir);
        bSaldir.setOnClickListener(this);///this yazdık çünkü; bu class dan üretilecek obje dinlicek

        Button bYemek= (Button) findViewById(R.id.yemek);
        bYemek.setOnClickListener(new View.OnClickListener() {// View.OnClickListener() constrator aslında

                                      @Override
                                      public void onClick(View v) {// bu da üretilen objesi
                                          tv.setText(k.yemek());
                                      }
                                  }
        );// yeni bir tane onClick listener getir, bunun  event inde


        Button bUyu= (Button) findViewById(R.id.uyu);
        bUyu.setOnClickListener(new View.OnClickListener() {// View.OnClickListener() constrator aslında

                                    @Override
                                    public void onClick(View v) {// bu da üretilen objesi
                                        tv.setText(k.uyumak());

                                    }
                                }
        );// yeni bir tane onClick listener getir, bunun  event inde

        k= new karakter();
        k.haraketSayisi=10;
        k.kilo=10;
        k.saldiriGucu=100;
        tvKarakterOzellikleri.setText(k.ToString());
        tv.setText("Oyuna Hosgeldiniz..");
        isim = (EditText) findViewById(R.id.editText);
        isim.setOnEditorActionListener(this);

    }


    @Override
    public boolean onEditorAction(TextView tv2, int x, KeyEvent ke){//inline yapmadan bu şekilde de buton dinleme yapılabilir.
//onEditorAction ile dinleme yapılacağı class tanımlanırken belirtildi.
        tv.setText("Karakterimizin isimi "+ isim.getText()+ " olarak atandı.");
        k.isim = (String) isim.getText().toString();
        isim.setVisibility(View.INVISIBLE);
        tvKarakterOzellikleri.setText(k.ToString());
        tvKarakterOzellikleri.setVisibility(View.VISIBLE);
        return true;

    }


    @Override
    public void onClick(View v) {

        if(v.getId()==bSaldir.getId())
            tv.setText(k.savas());

        //else
            //tv.setText("Eylam" + (sayac++));

        tvKarakterOzellikleri.setText(k.ToString());


    }
}