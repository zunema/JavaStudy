public class array{

  public static void main(String[] args){
    int[] array = new int[20];
    for (int i = 0; i < array.length; i++){
      array[i] = (i+1)*5;
      System.out.println(array[i]);
    }
    // System.out.println(array.length);
  }

}
