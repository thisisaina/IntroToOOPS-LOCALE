import java.util.*;
import java.text.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        if (payment>=0 && payment<= Math.pow(10,9)){
            Locale american = new Locale("en", "US");
            Locale indian = new Locale("en", "IN");
            Locale chinese = Locale.CHINA;
            Locale french = new Locale("fr", "FR");    
        // Get currency formatter for the specified locale
        NumberFormat dollars = NumberFormat.getCurrencyInstance(american);
        NumberFormat rupees = NumberFormat.getCurrencyInstance(indian);
        NumberFormat yuan = NumberFormat.getCurrencyInstance(chinese);
        NumberFormat euro = NumberFormat.getCurrencyInstance(french);
        // Format the amount as currency
        String us = (dollars.format(payment));
        String india = (rupees.format(payment));
        String china = (yuan.format(payment));
        String france = (euro.format(payment));
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        }
    }
}
