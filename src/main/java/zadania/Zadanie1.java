package zadania;

import java.util.Scanner;

public class Zadanie1 {
//    Odwróć liczbę za pomocą pętli
//while .
//    Program
//    poprosi użytkownika o wprowadzenie numeru, a następnie odwróci liczbę za
//    pomocą pętli while
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj liczbe");
    int number = scanner.nextInt();
    System.out.println("podana liczba to " + number);
    int reserve = 0;
    while(number != 0 ){
        reserve = reserve * 10;
        reserve = reserve + number % 10;
        number = number/ 10;
    }

    System.out.println("odwrocona liczba to " + reserve);
}


}
