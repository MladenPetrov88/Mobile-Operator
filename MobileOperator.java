import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String years = scanner.nextLine();
        String contract = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (years.equals("one")) {
            if (contract.equals("Small")) {
                price = 9.98;
            } else if (contract.equals("Middle")) {
                price = 18.99;
            } else if (contract.equals("Large")) {
                price = 25.98;
            } else if (contract.equals("ExtraLarge")) {
                price = 35.99;
            }
        }

        if (years.equals("two")) {
            if (contract.equals("Small")) {
                price = 8.58;
            } else if (contract.equals("Middle")) {
                price = 17.09;
            } else if (contract.equals("Large")) {
                price = 23.59;
            } else if (contract.equals("ExtraLarge")) {
                price = 31.79;
            }
        }


        if (internet.equals("yes")) {
            if (price <= 10) {
                price = price + 5.50;
            } else if (price <= 30) {
                price = price + 4.35;
            } else {
                price = price + 3.85;
            }
        }

        double pricePerYear = price * months;

        if (years.equals("two")) {
            pricePerYear = pricePerYear - pricePerYear * 0.0375;
        }

        System.out.printf("%.2f lv.", pricePerYear);
    }
}
