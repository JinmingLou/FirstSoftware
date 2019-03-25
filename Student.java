package people;

public class Student {
	private int QMnum;
	private String name;
	private String Email;
	private double surplusTime;
	private boolean state;
	
	//The followings are getters and setters
	public int getQMnum() {
		return QMnum;
	}
	public void setQMnum(int qMnum) {
		QMnum = qMnum;
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
	
	public double getSurplusTime() {
		return surplusTime;
	}
	public void setSurplusTime(double surplusTime) {
		this.surplusTime = surplusTime;
	}
	
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
}
