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
public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chanh: ");
        int a = sc.nextInt();
        System.out.print("Tao: ");
        int b = sc.nextInt();
        System.out.print("Le: ");
        int c = sc.nextInt();
        int sl = 0;
        for (int i = a; i >= 0; i--) {
            if (2 * i <= b && 4 * i <= c) {
                sl = i;
                break;
            }
        }
        int sum = sl + 2 * sl + 4 * sl;
        System.out.println("=> Tong so qua toi da: " + sum + " (Chanh: " + sl + ", Tao: " + 2 * sl + ", Le: " + 4 * sl + ")");
    }
}
