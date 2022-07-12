public class FizzBuzz {
/*
This code has 2 bugs! Write unit tests to test the logic and find the bugs - here are the steps:j

Test the "starts with f" case first - this should pass.
Test the "ends with b" case - this should also pass.
Test the "starts with f and ends with b" case - this will not pass.
Fix the logic in the solution so that all 3 test cases pass.
Add a test for when str is null - this will not pass.
Fix the logic in the solution so that all 4 test cases pass.
 */
  public String fizzBuzzString(String str) {
      if (str == null) return null;
      if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
      if (str.startsWith("f"))  return "Fizz";
      if (str.endsWith("b")) return "Buzz";

      return str;
  }
}