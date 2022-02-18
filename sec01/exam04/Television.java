package sec01.exam04;

public class Television implements RemoteControl {
  private int volume;

  public void turnOn() {
    System.out.println("ON");
  }

  public void turnOff() {
    System.out.println("OFF");
  }

  public void setVolume(int volume) {
    System.out.println("현재 볼륨 : " + this.volume);
  }
}