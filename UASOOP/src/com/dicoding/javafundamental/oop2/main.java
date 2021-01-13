package com.dicoding.javafundamental.oop2;

import com.dicoding.javafundamental.Segitiga;

public class main {
    public static void main(String[] args) {

    bangundatar bd = new bangundatar();
        bd.HitungLuas();
        bd.HitungKeliling();

        System.out.println("NIM SAYA 201969040011");
        System.out.println("=====================");
        System.out.println("-----> LUAS DAN KELILING SEGITIGA <-----");

    Segitiga st = new Segitiga();
        st.HitungLuas();
        System.out.println("=====================");
        st.HitungKeliling();

        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("=====================");

        System.out.println(" LUAS DAN KELILING PEREGI");
        Persegi kotak = new Persegi();
        kotak.HitungLuas();
        System.out.println("=====================");
        kotak.HitungKeliling();

        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("=====================");

        System.out.println(" LUAS DAN KELILING LINGKARAN");
        Lingkaran bulat = new Lingkaran();
        bulat.HitungLuas();
        System.out.println("=====================");
        bulat.HitungKeliling();


    }
}
