public class Main {

  public static void main(String args[]) {
    Calc calculator = new Calc();
    int res = calculator.add(3, 4);
    // System.out.println(res);

    int[][] multiDimensionalArr = new int[3][4];

    for (int i = 0; i < multiDimensionalArr.length; i++) {
      for (int j = 0; j < multiDimensionalArr[0].length; j++) {
        multiDimensionalArr[i][j] = (int) (Math.random() * 10);
        System.out.print(multiDimensionalArr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    for (int n[] : multiDimensionalArr) {
      for (int m : n) {
        System.out.print(m + " ");
      }
      System.out.println();
    }
  };
};
