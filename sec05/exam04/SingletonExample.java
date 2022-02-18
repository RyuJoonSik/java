package sec05.exam04;
// SingletonExample.java
public class SingletonExample {
  public static void main(String[] args) {
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
  
    System.out.println(obj1 == obj2); // true
  }
}
