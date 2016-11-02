package uk.co.agilekatas.romannumerals;

import java.util.Map;
import java.util.TreeMap;

public class RomanNumeralsConverter {

  private final Map<Integer, String> values;

  public RomanNumeralsConverter(Map<Integer, String> values) {
    this.values = new TreeMap<>(values).descendingMap();
  }

  public String toNumeral(int number) {
    String result = "";

    for (Map.Entry<Integer, String> entry : values.entrySet()) {
      while (number >= entry.getKey()) {
        result += entry.getValue();
        number -= entry.getKey();
      }
    }
    return result;
  }

}
