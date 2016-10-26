package uk.co.agilekatas.romannumerals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsConverterTest {

  private RomanNumeralsConverter converter = new RomanNumeralsConverter("I");

  @Test
  public void returnsIFor1() {
    String result = converter.toNumeral(1);
    assertThat(result).isEqualTo("I");
  }

  @Test
  public void returnsIIFor2() {
    String result = converter.toNumeral(2);
    assertThat(result).isEqualTo("II");
  }

  @Test
  public void returnsIIIFor3() {
    String result = converter.toNumeral(3);
    assertThat(result).isEqualTo("III");
  }
  
}
