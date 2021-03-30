public class TravelInfo implements TravelDocument {
	private String description;
	private String title;
	private String contactName;
	private List<String> destinations;
	public TravelInfo(String title,String description,String contactName){
		if(title==null||description==null||contactName==null){
			throw new RuntimeException();
		}else{
			this.title=title;
			this.destinations=new ArrayList<>();
			this.description=description;
			this.contactName=contactName;
		}
	}
	public String getTitle(){
		return title;
	}

    public void setTitle(String title){
		this.title=title;
	}

    public void setDescription(String destination){
		this.description=description;
	}

    public String getDescription(){
		return description;
	}

    public void setContactName(String contact){
		this.contactName=contact;
	}

    public String getContactName(){
		return contactName;
	}

    public void addDestination(String destination){
		this.destinations.add(destination);
	}

    public List<String> getDestinations(){
		return destinations;
	}
}
