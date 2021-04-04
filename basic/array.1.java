public class array{

  public static void main(String[] args){
    int[] number = new int[30];
    for (int i = 0; i < number.length; i++){
      number[i] = i * 5;
      System.out.println(number[i]);
    }
  }
}