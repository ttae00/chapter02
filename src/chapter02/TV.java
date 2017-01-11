package chapter02;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(){
		this(7,20,false);
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
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
		if( on ){
			power = true;
		}else{
			return;
		}
	}
	
	public void channel(int channel){
		if(power==false){
			return;
		}
		if(channel<1 )
		{
			channel= 255;
		}
		if(channel >255 ){
			channel= 1;
		}
		
		this.channel= channel;
	}
	
	public void channel(boolean up){
		
		int ch=(up==true)? (channel+1): (channel-1);
		
		
	}
	
	public void volume(int volume){
		if(power==false){
			return;
		}
		if(volume<0  )
		{
			volume= 0;
		}
		if(volume>100 ){
			volume = 100;
		}
		this.volume= volume;
	}
	
	public void volume(boolean up){
		
		
		volume(up? volume +1 : volume-1);
		
	
	}
	
	public void status(){
		System.out.println("power="+ power + ", volume="+ volume+ ",channel="+ channel);
	}
}
