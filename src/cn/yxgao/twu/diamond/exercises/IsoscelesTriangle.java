package cn.yxgao.twu.diamond.exercises;

public class IsoscelesTriangle {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    for (int i = 0; i < n; i++) {
      int spaceLength = n - i - 1;
      StringBuilder lineSpace = new StringBuilder();
      for (int j = 0; j < spaceLength; j++) {
        lineSpace.append(" ");
      }
      int asteriskLength = 1 + 2 * i;
      StringBuilder lineAsterisk = new StringBuilder();
      for (int j = 0; j < asteriskLength; j++) {
        lineAsterisk.append("*");
      }
      String line = lineSpace.toString() + lineAsterisk.toString() + lineSpace.toString();
      System.out.println(line);
    }
  }
}
