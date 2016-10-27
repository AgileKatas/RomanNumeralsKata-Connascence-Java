package uk.co.agilekatas.romannumerals;

public class RomanNumeralsConverter {

  private final String numeralForOne;
  private final String numeralForFour;

  public RomanNumeralsConverter(String numeralForOne, String numeralForFour) {
    this.numeralForOne = numeralForOne;
    this.numeralForFour = numeralForFour;
  }

  public String toNumeral(int number) {
    if(number == 4) {
      return numeralForFour;
    }
    String result = "";
    for (int i = 0; i < number; i++) {
      result += numeralForOne;
    }
    return result;
  }

}
