package com.rk.as;

/* Array Multidimensi */
public class Array_Contoh3 {
    public static void main(String[] args) {
        int[][] arrayDuaDimensi = new int[512][128];        /* Elemen 512x125 dari integer array */
        char[][][] arrayTigaDimensi = new char[8][16][24];  /* Karakter Array 8x16x24 */
        String[][] Manusia = {{"Terry", "Brown"}, {"Kristin", "White"}, {"Toby", "Gray"}, {"Fido", "Black"}};

        System.out.print(Manusia[0][0]);
        System.out.println();
    }
}
