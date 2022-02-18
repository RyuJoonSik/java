package sec02.exam02;

public class AnonymousExample {
  public static void main(String[] args) {
    Anonymous anonymous = new Anonymous();

    anonymous.field.turnOn();
    anonymous.method1();
    anonymous.method2(new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("TV ON");
      }

      @Override
      public void turnOff() {
        System.out.println("TV OFF");
      }
    });
  }
}
