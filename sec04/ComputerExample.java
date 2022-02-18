package sec04;
// ComputerExample.java
public class ComputerExample {
  public static void main(String[] aStrings) {
    Computer myCom = new Computer();

    int[] values1 = {1, 2, 3};
    int result1 = myCom.sum1(values1);
    int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
    int result3 = myCom.sum2(1, 2, 3);
    int result4 = myCom.sum2(1, 2, 3, 4, 5);
  }
}
