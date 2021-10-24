package grade;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        double nilai;
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan nilai : ");
        nilai = input.nextDouble();
        if (nilai > 90) {
            System.out.println("Nilai A");
        } else if (nilai >= 90) {
            System.out.println("Nilai B");
        } else if (nilai >= 80) {
            System.out.println("Nilai C");
        } else if (nilai >= 70) {
            System.out.println("Nilai D");
        } else if (nilai >= 60) {
            System.out.println("Anda Tidak Lulus");
        }else {
            System.out.println("Anda Tidak Lulus");
        }
    }

}
