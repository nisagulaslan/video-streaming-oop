
package project2;

/**
 *
 * @author Dell
 */
public abstract class User {
    private String name;
    
    
    public User(String name) {
        this.name = name;
        
    }
    
    public abstract void searchContent(Content content);
    
    
}
//default user koyulabilir