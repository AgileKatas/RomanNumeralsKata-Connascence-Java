package uk.co.agilekatas.romannumerals;

import java.util.Map;

public class RomanNumeralsConverter {

  private final Map<Integer, String> values;

  public RomanNumeralsConverter(Map<Integer, String> values) {
    this.values = values;
  }

  public String toNumeral(int number) {
    String result = "";
    if (number == 4) {
      result += values.get(4);
      number -= 4;
    }
    while (number >= 1) {
      result += values.get(1);
      number -= 1;
    }
    return result;
  }

}
