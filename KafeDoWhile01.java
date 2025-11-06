import java.util.Scanner;
public class KafeDoWhile01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int CoffeePrice = 15000;
        int TeaPrice = 10000;
        int BreadPrice = 5000;

        do {
            System.out.println("Enter Customer Name (Type Cancel To Exit):");
            String CustomerName = input.nextLine();
            if (CustomerName.equalsIgnoreCase("Cancel")) {
                System.out.println("Transaction Cancelled.");
                break;
            }

            System.out.println("Number Of Coffees");
            int NumberOfCoffees = input.nextInt();
            System.out.println("Number Of Teas");
            int NumberOfTeas = input.nextInt();
            System.out.println("Number Of Breads");
            int NumberOfBreads = input.nextInt();

            int totalPrice = (NumberOfCoffees * CoffeePrice) + (NumberOfTeas * TeaPrice) + (NumberOfBreads * BreadPrice);
            System.out.println("Total To Be Paid: Rp " + totalPrice);
            input.nextLine();
        } while (true);  
        
        System.out.println("All Transactions Completed.");
        input.close();
    }
}
