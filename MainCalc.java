public class MainCalc {

  public static void main(String args[]) {
    Calc obj = new Calc();
    int resAdd = obj.add(3, 4);
    int resSub = obj.sub(4, 3);

    VeryAdvCalc advObj = new VeryAdvCalc();
    int add = advObj.add(1, 2);
    int subtr = advObj.sub(1, 2);
    double divid = advObj.divide(1, 2);
    double pow = advObj.power(2, 2);

    System.out.println(pow + " " + subtr + " " + divid);
  }
}
