import java.util.Scanner;

public class TaxIncluder {

    public static void main(String[] args) {

        float price, taxedPrice, totalTax;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price: ");
        price = input.nextFloat();

        if (price > 1000) {
            totalTax = (8.0f / 100) * price;
            taxedPrice = price + totalTax;
        } 
        
        else {
            totalTax = (18.0f / 100) * price;
            taxedPrice = price + totalTax;
        }

        System.out.println("Here is the initial price: " + String.format("%.1f", price));
        System.out.println("Here is the tax-included price: " + String.format("%.1f", taxedPrice));
        System.out.println("Total amount of tax included: " + String.format("%.1f", totalTax));
    }
}
