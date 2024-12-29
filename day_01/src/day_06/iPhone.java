package day_06;

public class iPhone implements RemoteControl {

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("IPhone를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("IPad를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
	}

}
