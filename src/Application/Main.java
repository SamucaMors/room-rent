package Application;

import Entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];


        System.out.print("How many rooms will be rented? ");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            sc.nextLine();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            vect[roomNumber] = new Rent(name, email);
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + " " + "- " +  vect[i]);
            }

        }
    }
}