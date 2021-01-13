package com.dicoding.javafundamental.oop2;

import com.dicoding.javafundamental.Segitiga;

public class Lingkaran extends Segitiga {
    @Override
    public void HitungLuas(){
        double luas;
        luas = 3.14 * jarijari * jarijari;
        System.out.println("jari jari Lingkaran :" + jarijari);
        System.out.println(" luas Lingkaran :" + luas);
    }

    @Override
    public void HitungKeliling(){
        double keliling;
        keliling = 2 * 3.14 * jarijari;
        System.out.println("jari jari Lingkaran :" + jarijari);
        System.out.println(" Keliling Lingkaran :" + keliling);
    }
}

