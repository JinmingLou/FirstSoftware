package physicalElements;

public class Station {
	private int stationNum;
	private int slotnum;
	int[] slot;
	
	//Constructor
	public Station() {
		slot = new int[slotnum];
	}
	
	//The followings are getters and setters
	public int getStationNum() {
		return stationNum;
	}
	public void setStationNum(int stationNum) {
		this.stationNum = stationNum;
	}
	
	public int getSlotnum() {
		return slotnum;
	}
	public void setSlotnum(int slotnum) {
		this.slotnum = slotnum;
	}
	
}
