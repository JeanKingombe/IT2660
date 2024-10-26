public class Main {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    // Best-case scenario: pattern is at the beginning
    String bestCase = "A";  // Matches at index 0
    
    // Initialize startTime for best case
    long startTime = System.nanoTime();
    int index = match(text, bestCase);
    // Initialize endTime for best case
    long endTime = System.nanoTime();
    // Calculate elapsedTime for best case
    long elapsedTime = endTime - startTime;
    
    if (index >= 0)
      System.out.println("Best-case input matched at index " + index);
    else
      System.out.println("Best-case input unmatched");
    System.out.println("Time taken for best case: " + elapsedTime + " nanoseconds");
    
    // Worst-case scenario: pattern is at the end
    String worstCase = "9";  // Matches at the last index of text
    
    // Initialize startTime for worst case
    startTime = System.nanoTime();
    index = match(text, worstCase);
    // Initialize endTime for worst case
    endTime = System.nanoTime();
    // Calculate elapsedTime for worst case
    elapsedTime = endTime - startTime;
    
    if (index >= 0)
      System.out.println("Worst-case input matched at index " + index);
    else
      System.out.println("Worst-case input unmatched");
    System.out.println("Time taken for worst case: " + elapsedTime + " nanoseconds");
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }
    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    return true;
  }
}
