public class triangle {
  public static void main(String[] args) {
    int count = 10;
    for (int i = 0; i < count; i++) {
      for (int i2 = 0; i2 < i+1; i2++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}