package uk.co.agilekatas.romannumerals;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsConverterTest {

  private RomanNumeralsConverter converter;

  @Before
  public void setUp() {
    Map<Integer, String> values = new LinkedHashMap<>();
    values.put(1, "I");
    values.put(4, "IV");
    converter = new RomanNumeralsConverter(values);
  }

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

  @Test
  public void returnsIVFor4() {
    String result = converter.toNumeral(4);
    assertThat(result).isEqualTo("IV");
  }

}
