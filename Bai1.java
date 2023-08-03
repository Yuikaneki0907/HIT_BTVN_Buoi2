/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hit_java_buoi2;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == (n - 1)) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            } else {
                System.out.print("*");
                for (int j = 1; j < (n - 1); j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        // TODO code application logic here
    }
}
