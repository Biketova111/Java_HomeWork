/*1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
n! (произведение чисел от 1 до n)*/

import java.util.Scanner;

public class task1 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число n: ");
    int n = scanner.nextInt();

    int triangular_number = (n*(n+1))/2;

    System.out.println("Треугольно число "+ n + " равно: " + triangular_number);

  }
  }
