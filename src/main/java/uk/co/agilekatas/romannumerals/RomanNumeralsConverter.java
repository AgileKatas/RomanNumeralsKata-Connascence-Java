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
    String result = "";
    if (number == arabicForFour) {
      result += numeralForFour;
      number -= arabicForFour;
    }
    while (number >= arabicForOne) {
      result += numeralForOne;
      number -= arabicForOne;
    }
    return result;
  }

}
