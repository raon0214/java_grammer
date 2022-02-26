package algorithm;

public class TV {
	public String color;
	public boolean power;
	public int channel;
	
	public void setpower() {
		power = !power;
	}
	
	public void setchannelUP() {
		++channel;
	}
	public void setchannelDown(){
		--channel;
	}
}
