
package project2;

/**
 *
 * @author Dell
 */
public class GuestUser extends User{
    private int guestID;
    private static int count;
    private Content content;
    private Account account;
    
    public GuestUser(String name) {
        super(name);
    }
    
    
    @Override
    public void searchContent(Content content) {
        
    }
    
    public void register() {
       Account account = new Account("nisa", "mail", "112233");
       
    }
}
//nasıl register olucak accountla ilişkisi yok :ilişkisini serviceProvider ile yap orada register metodu olsun