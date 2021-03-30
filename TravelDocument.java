import java.util.List;

public interface TravelDocument {
    public String getTitle();

    public void setTitle(String title);

    public void setDescription(String destination);

    public String getDescription();

    public void setContactName(String contact);

    public String getContactName();

    public void addDestination(String destination) ;

    public List<String> getDestinations();
}
