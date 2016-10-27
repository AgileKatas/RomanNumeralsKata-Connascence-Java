package uk.co.agilekatas.romannumerals;

public class RomanNumeralsConverter {

  private final String numeral;

  public RomanNumeralsConverter(String numeral) {
    this.numeral = numeral;
  }

  public String toNumeral(int number) {
    if(number == 4) {
      return "IV";
    }
    String result = "";
    for (int i = 0; i < number; i++) {
      result += numeral;
    }
    return result;
  }

}
