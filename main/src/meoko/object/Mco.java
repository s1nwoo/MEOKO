package meoko.object;

public abstract class Mco {
	
	private String id;
	
	public void set(String id) {
		this.id = id;
	}
	
	public void get(String id) {
		id = this.id;
	}
	
	public String getId() {
		return this.id;		
	}

}
