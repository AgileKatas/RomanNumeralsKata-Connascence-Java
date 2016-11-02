package uk.co.agilekatas.romannumerals;

public class RomanNumeralsConverter {

  private final Integer arabicForOne;
  private final String numeralForOne;
  private final Integer arabicForFour;
  private final String numeralForFour;

  public RomanNumeralsConverter(Integer arabicForOne, String numeralForOne, Integer arabicForFour, String numeralForFour) {
    this.arabicForOne = arabicForOne;
    this.numeralForOne = numeralForOne;
    this.arabicForFour = arabicForFour;
    this.numeralForFour = numeralForFour;
  }

  public String toNumeral(int number) {
    if (number == arabicForFour) {
      return numeralForFour;
    }
    String result = "";
    for (int i = 0; i < number; i++) {
      result += numeralForOne;
    }
    return result;
  }

}
