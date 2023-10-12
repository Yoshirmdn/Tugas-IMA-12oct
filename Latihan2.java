package SWITCHCASE;

import java.util.Scanner;

class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char Test = input.next().charAt(0);
        switch (Test){
            case 'A' : System.out.println("Exelent");
            break;
            case 'B' : System.out.println("Good");
            break;
            case 'C' : System.out.println("Average");
            break;
            case 'D' : System.out.println("Fail");
            break;
            default :
            break;
        }
        input.close();
    }
}