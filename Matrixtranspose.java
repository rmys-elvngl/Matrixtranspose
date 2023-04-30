package main;

import java.util.Scanner;

public class Matrixtranspose {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int satir = input.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int sutun = input.nextInt();

        int[][] matris = new int[satir][sutun];

        System.out.println(satir + "x" + sutun + " boyutunda bir matris girin:");

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j] = input.nextInt();
            }
        }

        int[][] transpoz = new int[sutun][satir];

        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                transpoz[i][j] = matris[j][i];
            }
        }

        System.out.println("Matrisin transpozu:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

