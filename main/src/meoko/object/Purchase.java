package meoko.object;

public class Purchase extends Mco {
	
	private String userid;
	private String storeid;
	private String menuid;
	private int grade;
		
	public void set(String id,String userid,String storeid,String menuid,int grade) {
		super.set(id);
		this.userid=userid;
		this.storeid=storeid;
		this.menuid=menuid;
		this.grade=grade;
				
	}

	public String getUserid() {
		return userid;
	}

	public String getStoreid() {
		return storeid;
	}

	public String getMenuid() {
		return menuid;
	}

	public int getGrade() {
		return grade;
	}
}
