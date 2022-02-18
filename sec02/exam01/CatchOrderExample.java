package sec02.exam01;

public class CatchOrderExample {
  public static void main(String[] args) {
    try {
      String data1 = args[0];
      String data2 = args[1];
      int value1 = Integer.parseInt(data1);
      int value2 = Integer.parseInt(data2);
      int result = value1 + value2;
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    } catch(Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("다시 실행");
    }
  }
}
