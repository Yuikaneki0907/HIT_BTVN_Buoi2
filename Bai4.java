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
public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap so c: ");
        double c = sc.nextDouble();

        System.out.println("=> Phuong trinh " + a + "x^4 + " + b + "x^2 + " + c + " = 0 co cac nghiem la: ");
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Vo so nghiem");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Vo nghiem");
        } else if (a == 0) {
            double x = (double) (-c / b);
            if ((double) x < 0) {
                System.out.println("Vo nghiem");
            } else if ((double) x == 0) {
                System.out.println("x1 = 0");
            } else {
                System.out.println("x1 = " + Math.sqrt(x));
                System.out.println("x2 = -" + Math.sqrt(x));
            }
        } else {
            double detal = b * b - 4 * a * c;
            int dem = 1;
            if (detal < 0) {
                System.out.println("Vo nghiem");
            } else if (detal == 0) {
                double sum = -b / (2 * a);
                if (sum > 0) {
                    System.out.println("x" + dem + " = " + Math.sqrt(sum));
                    dem++;
                    System.out.println("x" + dem + " = -" + Math.sqrt(sum));
                    dem++;
                }
            } else {
                double x1 = (-b - Math.sqrt(detal)) / (2 * a);
                double x2 = (-b + Math.sqrt(detal)) / (2 * a);
                if (x1 > 0) {
                    System.out.println("x" + dem + " = " + Math.sqrt(x1));
                    dem++;
                    System.out.println("x" + dem + " = -" + Math.sqrt(x1));
                    dem++;
                }
                if (x2 > 0) {
                    System.out.println("x" + dem + " = " + Math.sqrt(x2));
                    dem++;
                    System.out.println("x" + dem + " = -" + Math.sqrt(x2));
                    dem++;
                }
            }
        }
    }
}
