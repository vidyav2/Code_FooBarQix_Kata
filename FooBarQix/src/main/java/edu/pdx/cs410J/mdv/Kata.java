package edu.pdx.cs410J.mdv;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public String compute(String number) {
    int integer = Integer.parseInt(number);
    String result = number;

    if ((integer % 3 == 0) && (integer % 5 == 0)) {
      return "FooBar";
    }
    else if (integer % 3 == 0) {
      return "Foo";
    }
    else if (integer % 5 == 0) {
      return "Bar";
    }
    else if (integer % 7 == 0) {
      return "Qix";
    }
    return result;
  }
}