public class array{

  public static void main(String[] args){
    int[] array = new int[20];
    int evensum = 0;
    int evencount = 0;
    int oddsum = 0;
    int oddcount = 0;
    for (int i = 0; i < array.length; i++){
      array[i] = (i+1)*5;
      // System.out.println(array[i]);
    }
    for (int num : array){
      if (num % 2 == 0){
        evensum += num;
        evencount += 1;
      } else {
        oddsum += num;
        oddcount += 1;
      }
    }
    System.out.println("偶数の合計は = " + evensum);
    System.out.println("偶数の個数は = " + evencount);
    System.out.println("奇数の合計は = " + oddsum);
    System.out.println("奇数の個数は = " + oddcount);
  }

}
