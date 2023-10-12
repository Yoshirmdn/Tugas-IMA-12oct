package SWITCHCASE;

import java.util.Scanner;

class Latihan4{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String tujuan = input.nextLine();
        int pnp = input.nextInt();
        int harga =0;
        switch (tujuan){
            case "Jakarta" :
            harga = 145000;
            break;
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
        System.out.println("Harga total tiket: Rp " + totalHarga);
        input.close();
    }
}