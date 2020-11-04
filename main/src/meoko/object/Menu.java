package meoko.object;

public class Menu extends Mco {
	
	private String name;
	private String storeid;
	private int price;
		
	public void set(String id,String name,String storeid,int price) {
		super.set(id);
		this.name=name;
		this.storeid=storeid;
		this.price=price;		
	}
	
	public String getName() {
		return name;
	}
	public String getStoreid() {
		return storeid;
	}
	public int getPrice() {
		return price;
	}

}
