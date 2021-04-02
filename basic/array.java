public class array{

  public static void main(String[] args){
    int[] array = new int[20];
    for (int i = 0; i < array.length; i++){
      array[i] = (i+1)*5;
      // System.out.println(array[i]);
    }
    for (int num : array){
      if (num % 2 == 0){
      System.out.println("偶数、" + num);
      } else {
      System.out.println("奇数、" + num);
      }
    }
    // System.out.println(array[18]);
    // System.out.println(array.length);
  }

}
