package unit6;
import java.util.Scanner;

public class CreatePurchase {

    public static void main(String[] args) {

        boolean isTrue = true;
        int x = 5;

        while(isTrue) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Invoice Number (Between 1000 and 4000): ");
            int userInvoiceNum = sc.nextInt();

            if (userInvoiceNum >= 1000 && userInvoiceNum <= 4000) {

                while(x < 200) {
                    System.out.println("Sale Amount: ");
                    int userSale = sc.nextInt();

                    if (userSale > 0) {
                        Purchase purchase1 = new Purchase(userInvoiceNum, userSale);
                        purchase1.setSale(userSale);
                        purchase1.displayData();
                        isTrue = false;
                        x = 201;
                    } else {
                        System.out.println("You must enter a non-negative amount.");
                        x = 1;
                    }
                }

            } else if(userInvoiceNum < 1000 || userInvoiceNum > 4000) {
                System.out.println("You must choose an invoice number between 1000 and 4000.");
                isTrue = true;
            } else {
                System.out.println("You must enter a non-negative amount.");
                isTrue = true;
            }
        }
    }
}
