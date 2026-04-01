package com.example.hostel.view;

import com.example.hostel.model.Hostel;
import com.example.hostel.model.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Hostel hostel = new Hostel();

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Room: ");
            int room = scanner.nextInt();

            scanner.nextLine();

            Student student = new Student(name, email);

            hostel.RentRoom(student, room);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        hostel.HostelReport();

        scanner.close();
    }
}