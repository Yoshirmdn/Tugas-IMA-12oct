package SWITCHCASE;

import java.util.Scanner;

class Latihan5{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String tujuan = input.nextLine();
        int pnp = input.nextInt();
        int harga =0;
        switch (tujuan){
            case "Jakarta" :
            harga = 145000;
            break;
            case "Bandung" :
            case "Bogor" : 
            harga = 200000;
            break;
            case "Purwakarta" : 
            harga = 75000;
            break;
            case "Garut" : 
            harga = 75000;
            break;
        }
        int totalHarga = (harga * pnp);
        if ((tujuan.equalsIgnoreCase ("Bandung")|| tujuan.equalsIgnoreCase ("Bogor") && totalHarga>250000)){
            double diskon = 0.1 * totalHarga;
            totalHarga -= diskon;
            System.out.println("Selamat! Anda mendapatkan diskon 10% untuk promo Bandung-Bogor.");
        }
        System.out.println("Harga total tiket: Rp " + totalHarga);
        input.close();
    }
}