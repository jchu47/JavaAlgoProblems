class Solution {
  public boolean squareIsWhite(String coordinates) {
      char column = coordinates.charAt(0);
      char row = coordinates.charAt(1);

      int x = column - 'a' + 1;
      int y = Character.getNumericValue(row);

      int z = x + y;
      return (z % 2 == 0) ? false : true;
  }
}

// extract values from the string input.  Ex "a", 1;
// Convert column by subtracting ASCII value and adding 1.  "a" = 1
// COnvert the string for row into an Integer
// add the coordinates.  Evens are black, odds are white. 