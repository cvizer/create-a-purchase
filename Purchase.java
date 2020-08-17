package unit6;

// Instantiates a purchase object that has an Invoice Number, Sale Amount, and Tax Amount.

public class Purchase {

    int invoiceNum;
    int sale;
    double salesTax;
    double tax;

    public Purchase(int userInvoiceNum, int userSale) {
        this.invoiceNum = userInvoiceNum;
        this.sale = userSale;
    }

    public void setInvoiceNum(int invoiceNum1) {
        this.invoiceNum = invoiceNum1;
    }

    public void setSale(int sale1) {
        this.sale = sale1;
        tax = sale1 * .05;
        this.salesTax = tax;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public int getSale() {
        return sale;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void displayData() {
        System.out.println("Invoice number: ");
        System.out.println(this.getInvoiceNum());
        System.out.println("Sale amount: ");
        System.out.println("$" + this.getSale());
        System.out.println("Sales Tax: ");
        System.out.println("$" + this.getSalesTax());
    }

}
