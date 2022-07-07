package edu.pdx.cs410J.mdv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void computeReturnsStringItIsPassed() {
    String passedNumber = "1";
    Kata kata = new Kata();
    assertEquals(kata.compute(passedNumber), passedNumber);
  }

  @Test
  void computeArgumentNotDivisibleByThreeFiveOrSeven() {
    String passedNumber = "2";
    Kata kata = new Kata();
    assertEquals(kata.compute(passedNumber), passedNumber);
  }

  @Test
  void computeArgumentNotDivisibleByThreeFiveOrSevenDoesNotReturnBar() {
    String passedNumber = "2";
    Kata kata = new Kata();
    assertNotEquals(kata.compute(passedNumber), "Bar");
  }

  @Test
  void computeArgumentDivisibleByThreeReturnsFoo() {
    String passedNumber = "3";
    Kata kata = new Kata();
    assertEquals(kata.compute(passedNumber), "Foo");
  }

  @Test
  void computeArgumentDivisibleByFiveReturnsFoo() {
    String passedNumber = "25";
    Kata kata = new Kata();
    assertEquals(kata.compute(passedNumber), "Bar");
  }

  @Test
  void computeArgumentDivisibleBySevenReturnsFoo() {
    String passedNumber = "49";
    Kata kata = new Kata();
    assertEquals(kata.compute(passedNumber), "Qix");
  }

  @Test
  void computeArgumentDivisibleByThreeAndFiveReturnsFooBar() {
    String passedNumber = "15";
    Kata kata = new Kata();
    assertEquals(kata.compute(passedNumber), "FooBar");
  }

}
