package Projects;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /*
         * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
         * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
         * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
         * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("hava sıcaklığını giriniz(0-25):");
        int sicaklik = sc.nextInt();
        if (sicaklik <= 5) {
            System.out.println("kayak yapabilirsiniz.");
        } else if (sicaklik > 5 && sicaklik <= 15) {
            System.out.println("today is very nice for the cinema,you can go to the cinema.");
        } else if (sicaklik >= 15 && sicaklik <= 25) {
            System.out.println("maybe you should a picnic.");
        } else if (sicaklik > 25) {
            System.out.println("that is great because you can go to swimiming");
        }

        sc.close();
    }
}
