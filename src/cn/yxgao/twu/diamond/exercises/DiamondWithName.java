package cn.yxgao.twu.diamond.exercises;

public class DiamondWithName {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    String name = "Melo";
    String[] lines = new String[2 * n - 1];
    for (int i = 0; i < n; i++) {
      int spaceLength = n - i - 1;
      String line = "";
      if (spaceLength == 0) {
        line = name;
      } else {
        StringBuilder lineSpace = new StringBuilder();
        for (int j = 0; j < spaceLength; j++) {
          lineSpace.append(" ");
        }
        int asteriskLength = 1 + 2 * i;
        StringBuilder lineAsterisk = new StringBuilder();
        for (int j = 0; j < asteriskLength; j++) {
          lineAsterisk.append("*");
        }
        line = lineSpace.toString() + lineAsterisk.toString() + lineSpace.toString();
      }
      lines[i] = line;
      lines[lines.length - 1 - i] = line;
    }
    for (String line : lines) {
      System.out.println(line);
    }
  }
}
