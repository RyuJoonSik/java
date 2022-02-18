package sec01.exam01;

public class DmbCellPhoneExample {
  public static void main(String[] args) {
    DmbCellPhone dbmCellPhone = new DmbCellPhone("자바폰", "검정", 10);

    dbmCellPhone.powerOn();
    dbmCellPhone.turnOnDmb();
  }
}
