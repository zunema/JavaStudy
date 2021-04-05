public class array2 {
  public static void main(String[] args) {
    int[] array = new int[20];
    int evensum = 0;
    int evencount = 0;
    int oddsum = 0;
    int oddcount = 0;
    for (int i = 0; i < array.length; i++){
      array[i] = (i + 1) * 5;
      // System.out.println(array[i]);
    }
    for (int array2 : array) {
      if (array2 % 2 == 0) {
        evensum += array2;
        evencount += 1;
      }
      if (array2 % 2 != 0) {
        oddsum += array2;
        oddcount += 1;
      }
    }
    System.out.println("偶数の合計は" + evensum + "です");
    System.out.println("偶数の個数は" + evencount + "です");
    System.out.println("奇数の合計は" + oddsum + "です");
    System.out.println("奇数の個数は" + oddcount + "です");
  }
}