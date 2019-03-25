package people;

public class Worker {
	private int workNum;
	private String name;
	private String Email;
	private int phoneNum;
	private boolean state;
	
	//The followings are getters and setters
	public int getWorkNum() {
		return workNum;
	}
	public void setWorkNum(int workNum) {
		this.workNum = workNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}	
}
