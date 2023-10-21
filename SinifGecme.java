package day01;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int fizik,kimya,turkce,muzik,matematik;

        Scanner input = new Scanner(System.in);

        System.out.println("fizik notunuzu giriniz: ");
        fizik= input.nextInt();
        if(fizik<0 || fizik>100){
            System.out.println("geçersiz not girişi. 0 ile 100 arasında bir not giriniz.");
        }

        System.out.println("kimya notunuzu giriniz: ");
        kimya= input.nextInt();
        if(kimya<0 || kimya>100){
            System.out.println("geçersiz not girişi. 0 ile 100 arasında bir not giriniz.");
        }

        System.out.println("türkçe notunuzu giriniz: ");
        turkce= input.nextInt();
        if(turkce<0 || turkce>100){
            System.out.println("geçersiz not girişi. 0 ile 100 arasında bir not giriniz.");
        }

        System.out.println("müzik notunuzu giriniz: ");
        muzik= input.nextInt();
        if(muzik<0 || muzik>100){
            System.out.println("geçersiz not girişi. 0 ile 100 arasında bir not giriniz.");
        }

        System.out.println("matematik notunuzu giriniz: ");
        matematik= input.nextInt();
        if(matematik<0 || matematik>100){
            System.out.println("geçersiz not girişi. 0 ile 100 arasında bir not giriniz.");
        }

        double ortalama=(fizik+matematik+turkce+muzik+kimya)/5;
        System.out.println("ortalamanız: "+ortalama);

        if(ortalama>=55) {
            System.out.println("geçtiniz..");
        }
        else {
            System.out.println("kaldınız..");
        }


    }
}
