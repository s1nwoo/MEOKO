package meoko.object;

public class User extends Mco {

	private String name;
	private String pw;
	private int countOfPost;
	
	public User(){
		this.countOfPost = 0;
	}
	
	public void set(String id,String name,String pw) {
		super.set(id);
		this.name=name;
		this.pw=pw;	
	}
	
	public void setCountOfPost(int countOfPost) {
		this.countOfPost = countOfPost;
	}
	
	public int getCountOfPost() {
		return this.countOfPost;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	
}
