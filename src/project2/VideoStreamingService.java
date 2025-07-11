
package project2;

/**
 *
 * @author Dell
 */
public class VideoStreamingService {
    private String name;
    private String serviceLogo;
    private int serviceID;
    private static int count;
    
    public VideoStreamingService(String name, String serviceLogo) {
        this.name = name;
        this.serviceLogo = serviceLogo;
        count++;
        serviceID = count;
    }
    
    
    
}
// addNewContent deleteContent metotları barındırıyor ama ilişkili değil content classla