
package project2;
import java.util.Date;
/**
 *
 * @author Dell
 */
public class Payment {
    private Date lastDayToPay;
    private boolean isPaid;
    private String creditCardNumber;
    private String billingAddress;
    private final double invoice = 30.0;
    
    public Payment() {
        
        this.lastDayToPay = new Date(lastDayToPay.getTime() + 30 * 24 * 60 * 60 * 1000); 
         // 30 days after invoice creation
    }
    
    public String getPaymentStatus() {
        if (isPaid) 
            return "Invoice is paid ";
        else
            return "Invoice is not paid ";
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
    
    public double pay(double amount) {
        if (amount == invoice) {
            lastDayToPay = new Date();
            isPaid = true;
        }
        isPaid = false;
        getPaymentStatus();
        return amount;
    }

    public Date getLastDayToPay() {
        return lastDayToPay;
    }

    public double getInvoice() {
        return invoice;
    }
    
    public boolean getIsPaid() {
        return isPaid;
    }
}
