package physicalElements;

public class Scooter {
	private int scooterNum;
	private boolean useState; //being used of free for use
	private boolean repairState; //being damaged or ready for use
	
	//The followings are getters and setters
	public int getScooterNum() {
		return scooterNum;
	}
	public void setScooterNum(int scooterNum) {
		this.scooterNum = scooterNum;
	}
	
	public boolean getUseState() {
		return useState;
	}
	public void setUseState(boolean useState) {
		this.useState = useState;
	}
	
	public boolean getRepairState() {
		return repairState;
	}
	public void setRepairState(boolean repairState) {
		this.repairState = repairState;
	}
	
	
}
