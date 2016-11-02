package uk.co.agilekatas.romannumerals;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class RomanNumeralsConverter {

  private final Stack<Map.Entry<Integer, String>> stack;

  public RomanNumeralsConverter(Map<Integer, String> values) {
    this.stack = new Stack<>();
    this.stack.addAll(new TreeMap<>(values).entrySet());
  }

  public String toNumeral(int number) {
    return doToNumeral("", number, stack);
  }

  private String doToNumeral(String numeral, int number, Stack<Map.Entry<Integer, String>> stack) {
    if (number == 0) {
      return numeral;
    }
    Map.Entry<Integer, String> entry = stack.peek();
    if (number >= entry.getKey()) {
      number -= entry.getKey();
      numeral += entry.getValue();
    } else {
      stack.pop();
    }
    return doToNumeral(numeral, number, stack);
  }

}
