/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hit_java_buoi2;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        // Tinh S
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += (double) 1 / i;
        }
        System.out.println("Tong S = " + s);

        //Tinh P
        int p = 0;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
            p += sum;
        }
        System.out.println("Tong P = " + p);
    }
}
