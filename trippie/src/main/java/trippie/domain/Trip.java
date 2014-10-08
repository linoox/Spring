package trippie.domain;

public class Trip {

	private String name;
	private String description;
	private Double budget;
	
	/*
	public Trip(String name, String description) {
		this.name = name;
		this.description=description;
		
	} 
	*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String toString() {
		StringBuffer sbuf = new StringBuffer();
		sbuf.append("Name: "+name+" | ");
		sbuf.append("Description: " + description);
		return sbuf.toString();
	}
}
