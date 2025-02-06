package days30ofcode.day1;

import java.util.Scanner;

public class Solution {
    int i =  4;
    double d = 4.0;
    String s = "HackerRank";

Scanner scanner = new Scanner(System.in);

int inputInt = scanner.nextInt();
double inputDouble = scanner.nextDouble();

scanner.nextLine();

String inputString = scanner.nextLine();

int sumInt = i + inputInt;
System.out.println(sumInt);

double sumDouble = d + inputDouble;
System.out.printf("%.1f%n", sumDouble);

String concatenatedString = s + inputString;
System.out.println(concatenatedString);

scanner.close();

}