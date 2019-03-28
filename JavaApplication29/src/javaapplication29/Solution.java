/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;

public class Solution {

    //private static final 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String sonuc;
        if (1 <= N || N <= 100) {
            if (N % 2 == 1) {
                sonuc = "Weird";

            } else if (N < 6) {
                sonuc = "not Weird";

            } else if (N < 21) {
                sonuc = "Weird";

            } else {
                sonuc = "not Weird";
            }
            46466161

            scanner.close();
            System.out.println(sonuc);
        }
    }
}
