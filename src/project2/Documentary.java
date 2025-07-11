
package project2;

/**
 *
 * @author Dell
 */
public class Documentary extends Content{
    private String narrator;
    
    public Documentary(String title, double duration, int releaseYear, String genre, 
            String narrator) {
        super(title,duration,releaseYear,genre);
        this.narrator = narrator;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + " narrator: " + narrator;
    }

    public String getNarrator() {
        return narrator;
    }
    
    public void download() throws ICantDownload{
        throw new ICantDownload("You cannot download documentaries ");
    }
    
}
