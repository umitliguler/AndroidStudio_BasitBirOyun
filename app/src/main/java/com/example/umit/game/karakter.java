package com.example.umit.game;

public class karakter {
    int kilo;
    int haraketSayisi;
    int saldiriGucu;
    String isim="Lutfen karaktere isim verin..";

    public String yemek(){
        if(haraketSayisi>0){
            haraketSayisi--;
            kilo++;
            return "Yemek yedi ve kilosu artti..";
        }
        else
            return "Yeterli Haraket Yok..!";
    }

    public String uyumak(){
        if(haraketSayisi>0){
            haraketSayisi--;
            return "Karakterimiz uyudu..";
        }
        else
            return "Yeterli Haraket Yok..!";

    }

    public String savas(){
        if(haraketSayisi>0){
            haraketSayisi--;
            saldiriGucu++;
            return "Karakterimiz savasti..";
        }
        else
            return "Yeterli Haraket Yok..!";
    }

    public String ToString(){
        return "Isim: " + isim
                + "\n" + "Kilo: " + kilo
                +"\n" + "Hareket Sayisi: " + haraketSayisi
                +"\n" + "Saldiri Gücü: " + saldiriGucu;

    }
}
