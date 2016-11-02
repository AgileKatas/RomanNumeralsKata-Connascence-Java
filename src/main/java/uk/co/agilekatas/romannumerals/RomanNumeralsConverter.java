package uk.co.agilekatas.romannumerals;

import java.util.Map;

public class RomanNumeralsConverter {

  private final Map<Integer, String> values;

  public RomanNumeralsConverter(Map<Integer, String> values) {
    this.values = values;
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
