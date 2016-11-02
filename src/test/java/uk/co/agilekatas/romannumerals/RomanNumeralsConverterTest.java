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
    values.put(500, "D");
    values.put(400, "CD");
    values.put(1000, "M");
    values.put(900, "CM");
    values.put(90, "XC");
    values.put(100, "C");
    values.put(40, "XL");
    values.put(50, "L");
    values.put(9, "IX");
    values.put(1, "I");
    values.put(10, "X");
    values.put(4, "IV");
    values.put(5, "V");
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

  @Test
  public void returnsCorrectValueFor1066() {
    String result = converter.toNumeral(1066);
    assertThat(result).isEqualTo("MLXVI");
  }

  @Test
  public void returnsCorrectValueFor1989() {
    String result = converter.toNumeral(1989);
    assertThat(result).isEqualTo("MCMLXXXIX");
  }

}
