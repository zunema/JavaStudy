public class OddSum3 {
  public static void main(String[] args) {
    int evensum = 0;
    int evencount = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0){
        // System.out.println("これは偶数" + i + "です");
        evensum += i;
        evencount += 1;
      }
    }
    System.out.println("偶数の合計は" + evensum + "です");
    System.out.println("偶数の個数は" + evencount + "です");
  }
}