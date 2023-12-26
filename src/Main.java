import demographic.textHandle.ReadMapFromText;

import java.util.Map;

public class Main {
  public static void main(String[] args) {
    String text = "6 goi bim bim:120000,4 cai keo:10000";
    Map<String, Integer> map = ReadMapFromText.readMapFromText(text);
  }
}
