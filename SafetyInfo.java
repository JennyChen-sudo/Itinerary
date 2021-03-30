
public class SafetyInfo {
	
	private String title;
	private String description;
	
	/*
	 * SafetyInfo Constructor, requires title and description
	 * @param title
	 * @param description
	 */
	public SafetyInfo(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	/*
	 * Returns a string representation of
	 * SafetyInfo, provides title and description
	 * @return String including title and description.
	 */
	public String toString() {
		return "[" + title + ", " + description + "]";
	}
	
}
