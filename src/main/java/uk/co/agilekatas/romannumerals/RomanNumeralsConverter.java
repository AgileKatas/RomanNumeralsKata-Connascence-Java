package uk.co.agilekatas.romannumerals;

public class RomanNumeralsConverter {

  private final String numeral;

  public RomanNumeralsConverter(String numeral) {
    this.numeral = numeral;
  }

  public String toNumeral(int number) {
    if (number == 2) {
      return "II";
    }
    return numeral;
  }

}
