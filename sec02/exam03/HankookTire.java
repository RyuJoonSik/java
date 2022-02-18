package sec02.exam03;

public class HankookTire extends Tire{
  public HankookTire(String location, int maxRotation) {
    super(location, maxRotation);
  }

  @Override
  public boolean roll() {
    ++accumulatedRotation;

    if(accumulatedRotation < maxRotation) {
      System.out.println("HankookTire");

      return true;
    } else {
      System.out.println("HankookTire 펑크");
      
      return false;
    }
  }
}
