
package project2;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class Content {
    private String title;
    private double duration;
    private int releaseYear;
    private int contentID;
    private static int count;
    private String genre;
    private ArrayList<Content> contentList;
    
    public Content() {
        count++;
        contentID = count;
        contentList = new ArrayList<>();
    }
    
    public Content(String title, double duration, int releaseYear, String genre) {
        this.title = title;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.genre = genre;
        count++;
        contentID = count;
        contentList = new ArrayList<>();
    }
    
    public void findContent(Content takenContent) {
        for (Content c : contentList) {
            if (c.equals(takenContent)) {
                System.out.println(takenContent.getTitle() + "is found. ");
            } else {
                System.out.println("Not exists in the content list. ");
            }
        }
    }
    
    public void listSpecificGenre(String takenGenre) {
        for (Content c : contentList) {
            if (c.getGenre().equals(takenGenre)) {
                System.out.println(c);
            }
        }
    }
    
    public String getTitle() {
        return title;
    }

    public ArrayList<Content> getContentList() {
        return contentList;
    }
    
    public String getInfo() {
        return "title: " + title + "duraiton: " + duration + "release year: " + releaseYear + 
                "genre: " + genre;
    }

    public double getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }
    
    
}
