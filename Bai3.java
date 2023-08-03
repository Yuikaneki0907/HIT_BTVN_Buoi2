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
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        int dem = 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                dem++;
                break;
            }
        }

        if (dem == 0 && n != 1) {
            System.out.println("n la so nguyen to");
        } else {
            System.out.println("n khong la so nguyen to");
        }
    }
}
