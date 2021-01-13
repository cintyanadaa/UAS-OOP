package com.dicoding.javafundamental;

import com.dicoding.javafundamental.oop2.bangundatar;

public class Segitiga extends bangundatar {

    private double sisia=1;
    protected double sisib=1;
    protected double sisic=1;
    protected double jarijari=11;

    @Override
    public void HitungLuas(){
        double luas;
        luas=this.sisib * this.sisic/2;
        System.out.println("Alas :" + this.sisib + "CM");
        System.out.println("Tinggi :" + this.sisic + "CM");
        System.out.println("Luas Segitiga :" + luas+ "CM");
    }

    @Override
    public void HitungKeliling(){
        double keliling;
        keliling = this.sisia+this.sisib+this.sisic;
        System.out.println(" SISI A:" + this.sisib + "CM");
        System.out.println(" SISI B :" + this.sisic + "CM");
        System.out.println(" SISI C :" + this.sisia + "CM");
        System.out.println("Keliling Segitiga :" +keliling+ "CM");
    }

}
