
package project2;

/**
 *
 * @author Dell
 */
public class RegisteredUser extends User{
    private String email;
    private String password;
    private int userID;
    private static int count;
    private WatchList watchList;
    private Content content;
    private Account account;
    private Payment payment;
    
    public RegisteredUser(String name, String email, String password) {
        super(name);
        this.email = email;
        this.password = password;
        count++;
        userID = count;
        this.content = new Content();  //for using their methods
        this.account = new Account();
        this.payment = new Payment();
    }
    
    public void addToWatchList(Content takenContent) {
        watchList.addContent(takenContent);
    }
    
    public void rateContent(Content takenContent, int rate) {
        for (int i = 0; i < content.getContentList().size(); i++) {
            if (content.getContentList().get(i).equals(takenContent)) {
                System.out.println(takenContent.getTitle() + " rated successfully. ");
            }
        }
    }
    
    public void writeReview(Content takenContent, String review) {
        for (Content c : content.getContentList()) {
            if (c.equals(takenContent)) {
                System.out.println("Your review added successfully. ");
            }
        }
    }
    
    @Override
    public void searchContent(Content content) {
        content.findContent(content);
    } 
    
    public String watch(String contentName) {
        return "You are watching " + contentName;
    }
    
    public String pause(String contentName) {
        return contentName + " paused. ";
    }
    
    public String stop(String contentName) {
        return contentName + " stopped. ";
    }
    
    public void makePayment(double amount) {
        payment.pay(amount);
    }
    
    public String login() {
        return "logged in... ";
    }
    
    public String logout() {
        return "logged out... ";
    }
    
    public void cancelSubscription() {
        account.deleteAccount();
    }
}
