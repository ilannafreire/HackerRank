package days30ofcode.day0;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intValue = scanner.nextInt();

        double doubleValue = scanner.nextDouble();

        scanner.nextLine();

        String stringValue = scanner.nextLine();

        scanner.close();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
    }
}