package sec01.exam04;

public class Audio implements RemoteControl {
  private int volume;

  public void turnOn() {
    System.out.println("Audio ON");
  }

  public void turnOff() {
    System.out.println("Audio OFF");
  }

  public void setVolume(int volume) {
    System.out.println("현재 Audio 볼륨 : " + this.volume);
  }
}