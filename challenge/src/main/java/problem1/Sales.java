package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        /*
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
         */
        int sum;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPlease enter the number of SalesPeople: ");
        int NbrOfSalesPeople = scan.nextInt();

        int[] sales = new int[NbrOfSalesPeople];
        for (int i=0; i<sales.length; i++)
        {
            int idx = i + 1;
            System.out.print("Enter sales for salesperson " + idx + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxSale = sales[0];
        int minSale = sales[0];
        int maxIdx = 1;
        int minIdx = 1;
        for (int i=0; i<sales.length; i++)
        {
            int idx = i + 1;
            System.out.println(" " + idx + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxIdx = i + 1;
            }
            if (sales[i] < minSale) {
                minSale = sales[i];
                minIdx = i + 1;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + (double) sum/sales.length);
        System.out.println("\nSalesperson " + maxIdx + " had the highest sale with $" + maxSale);
        System.out.println("\nSalesperson " + minIdx + " had the lowest sale with $" + minSale);

        System.out.println("\nPlease enter a value: ");
        int value = scan.nextInt();

        int tot = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > value) {
                int idx = i + 1;
                System.out.println("\nSalesperson " + idx + " exceeded the amount with sales with $" + sales[i]);
                tot++;
            }
        }
        System.out.println("\nThe number of salespeople whose sales exceeded the value entered is: " + tot);


    }
}