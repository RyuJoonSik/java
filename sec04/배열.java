package sec04;
public class 배열 {
  public static void main(String[] args) {
    int[] arr1 = {83, 90, 87};
    // arr1 = {83, 90, 87}; // 컴파일 에러
    arr1 = new int[] {83, 90, 87};

    int sum2 = add(new int[] {83, 90, 87});

    int[] arr2 = null;
    arr2 = new int[5];

    int[][] arr3 = new int[2][3];
    int[][] arr4 = new int[2][];
    int[][] arr5 = {{95, 80}, {92, 65}};

    String[] oldStrArray = {"java", "array", "copy"};
    String[] newStrArray = new String[5];

    System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

    int[] scores = {95, 71, 84, 93, 87};
    int sum = 0;

    for(int score: scores) {
      sum += score;
    }

    double avg = (double) sum / scores.length;

    Week week1 = Week.SATURDAY;
    Week week2 = Week.SATURDAY;
    System.out.println(week1 == week2); // true
  }

  public static int add(int [] scores) {
    int sum = 0;
    
    for(int i = 0; i < 3; i++) {
      sum += scores[i];
    }

    return sum;
  }
}
