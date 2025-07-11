
package project2;

/**
 *
 * @author Dell
 */
public class Serie extends Content implements Downloadable{
    private int seasonNum;
    private int episodeNum;
    
    public Serie(String title, double duration, int releaseYear, String genre, 
            int seasonNum, int episodeNum) {
        super(title,duration,releaseYear,genre);
        this.seasonNum = seasonNum;
        this.episodeNum = episodeNum;
        
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + " seasonNum: " + seasonNum + " episodeNum: " + episodeNum;
    }

    public int getSeasonNum() {
        return seasonNum;
    }

    public int getEpisodeNum() {
        return episodeNum;
    }
    
   @Override
   public void download() {
       System.out.println("Downloaded successfully... ");
   }
}
