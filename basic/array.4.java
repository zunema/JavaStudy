public class array4 {
  public static void main(String[] args) {
    int[] array = new int[20];
    int evensum = 0;
    int evencount = 0;
    int oddsum = 0;
    int oddcount = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = (i + 1) * 5;
    }
    for (int number : array) {
      if (number % 2 == 0) {
        evensum += number;
        evencount += 1;
      }
      if (number % 2 != 0) {
        oddsum += number;
        oddcount += 1;
      }
    }
    System.out.println("偶数の合計は" + evensum + "です");
    System.out.println("偶数の個数は" + evencount + "です");
    System.out.println("奇数の合計は" + oddsum + "です");
    System.out.println("奇数の個数は" + oddcount + "です");

    for (int num = 10; num >= 1; num--) {
      System.out.println(num);
    }

    for (int num2 = 1; num2 <= 10; num2++) {
      if (num2 == 10) {
        System.out.println(num2);
      } else {
        System.out.print(num2 + ",");
      }
    }

    int evennum3sum = 0;
    int evennum3count = 0;
    for (int num3 = 1; num3 <= 10; num3++) {
      if (num3 % 2 == 0) {
        evennum3sum += num3;
        evennum3count += 1;
      }
    }
    System.out.println("num3の偶数の合計は" + evennum3sum + "です");
    System.out.println("num3の偶数の個数は" + evennum3count + "です");
  }
}

