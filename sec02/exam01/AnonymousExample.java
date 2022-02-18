package sec02.exam01;

public class AnonymousExample {
  public static void main(String[] args) {
    Anoymous anony = new Anoymous();

    anony.field.wake();
    anony.method1();
    anony.method2(
      new Person() {
        void study() {
          System.out.println("공부");
        }

        @Override
        void wake() {
          System.out.println("8시 기상");
          study();
        }
      }
    );
  }
}
