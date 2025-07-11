
package project2;

/**
 *
 * @author Dell
 */
public class Account {
    private int accountID;
    private static int count;
    private String userName;
    private String email;
    private String password;
    private Payment payment;
    
    public Account() {
        count++;
        accountID = count; 
    }
    
    public Account(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        count++;
        accountID = count;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String deleteAccount() {
        if (payment.getIsPaid()) {
            return "Account deleted...";
        } else {
            return "Please pay your bill first...";
        }
    }
    
    
}
