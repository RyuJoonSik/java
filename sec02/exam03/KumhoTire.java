package sec02.exam03;

public class KumhoTire extends Tire{
  public KumhoTire(String location, int maxRotation) {
    super(location, maxRotation);
  }

  @Override
  public boolean roll() {
    ++accumulatedRotation;

    if(accumulatedRotation < maxRotation) {
      System.out.println("KumhoTire");

      return true;
    } else {
      System.out.println("KumhoTire 펑크");
      
      return false;
    }
  }
}
