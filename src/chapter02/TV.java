package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {
		this.channel = 7;
		this.volume = 20;
		this.power = false;
	}

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on){
		power = on;
	}
	public void channel(int channel){	// 1 ~ 255
		this.channel = channel;
	}
	public void channel(boolean up){	// 1 ~ 255, 1씩 증감
		if(up==true)
			channel++;
		else
			channel--;
		// ???
	}
	public void volume(int volume){		// 0 ~ 100
		this.volume = volume;
	}
	public void volume(boolean up){
		if(up==true)
			volume++;
		else
			volume--;
	}
	public void status(){
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}

	
}
