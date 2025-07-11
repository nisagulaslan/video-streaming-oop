
package project2;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class WatchList {
    private ArrayList<Content> watchList;
    
    
    public WatchList() {
        watchList = new ArrayList<>();
    }
    
    public void addContent(Content takenContent) {
        if (!watchList.contains(takenContent)) {
            watchList.add(takenContent);
            System.out.println(takenContent.getTitle() + " is added to your watch list. ");
        } else {
            System.out.println("It is already on your watch list. ");
        }
    }
    
    public void removeContent(Content takenContent) {
        if (watchList.contains(takenContent)) {
            watchList.remove(takenContent);
            System.out.println(takenContent.getTitle() + " is removed from your watch list. ");
        } else {
            System.out.println("It already does not exit in your watch list.");
        }
    }

    public ArrayList<Content> getWatchList() {
        return watchList;
    }
    
    
}
