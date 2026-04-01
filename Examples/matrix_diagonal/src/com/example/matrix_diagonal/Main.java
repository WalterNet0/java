package com.example.matrix_diagonal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //Creating the matrix
        System.out.print("Enter the matrix size: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        scanner.nextLine();

        //Filling the matrix
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        List<Integer> diagonal = new ArrayList<>();
        int negative = 0;

        //Printing out the matrix, just to the user see what he did
        System.out.println("\nMatrix output:");

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(matrix[i][j] + "\t");

                //Simple verifications
                if(i == j){
                    diagonal.add(matrix[i][j]);
                }

                if(matrix[i][j] < 0){
                    negative++;
                }
            }

            System.out.println();
        }

        //Printing out the main diagonal, and how many negative numbers where filled
        System.out.print("\ncom.example.matrix_diagonal.Main diagonal: ");

        for(Integer number : diagonal){
            System.out.print(number + " ");
        }

        System.out.println("\nNegative numbers = " + negative);

        scanner.close();
    }
}