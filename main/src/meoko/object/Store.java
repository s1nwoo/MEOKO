package meoko.object;

public class Store extends Mco {
	
	private String name;
	private String phoneNumber;
	private double distance;
	private String type;

	public void set(String id,String name,String phoneNumber,double distance,String type) {
		super.set(id);
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.distance=distance;
		this.type=type;		
	}
	
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public double getDistance() {
		return distance;
	}

	public String getType() {
		return type;
	}
}
