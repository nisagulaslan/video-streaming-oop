
package project2;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class Movie extends Content implements Downloadable{
    private String director;
    private ArrayList actors;
    
    public Movie(String title, double duration, int releaseYear, String genre, String director) {
        super(title,duration,releaseYear,genre);
        this.director = director;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + " director: " + director;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList getActors() {
        return actors;
    }
    
    @Override
    public void download() {
        System.out.println("Downloaded successfully... ");
    }
}
