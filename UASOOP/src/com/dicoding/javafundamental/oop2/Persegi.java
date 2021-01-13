package com.dicoding.javafundamental.oop2;

import com.dicoding.javafundamental.Segitiga;

public class Persegi extends Segitiga {
    @Override
    public void HitungLuas(){
        double luas;
        luas = this.sisic * this.sisic;
        System.out.println(" Panjang sisi  :" + this.sisic + " CM ");
        System.out.println(" Luas Persegi  :" +luas+ "CM");
}
    @Override
    public void HitungKeliling(){
        double keliling;
        keliling = this.sisic * 2;
        System.out.println(" Panjang sisi  :" + this.sisic + " CM ");
        System.out.println(" Keliling Persegi  :" +keliling+ "CM");
    }
}
