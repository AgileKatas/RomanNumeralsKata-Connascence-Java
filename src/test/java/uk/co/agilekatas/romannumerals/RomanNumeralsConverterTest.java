package uk.co.agilekatas.romannumerals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsConverterTest {

  @Test
  public void returnsIFor1() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    String result = converter.toNumeral(1);
    assertThat(result).isEqualTo("I");
  }
  
}
