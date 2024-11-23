// Uses Newton-Raphson search to approximate sqrt(x).
public class Sqrt3 {
   public static void main(String args[]) {
      double x = 16;
      double epsilon = 0.01;
      int itrCounter = 0;  
      double g = x / 2;
      while (Math.abs(g * g - x) > epsilon) {
         itrCounter++;
         g = g - (g * g - x) / (2 * g);
         System.out.println("Step " + itrCounter + ": g = " + g);
      }
      System.out.println("Square root (approx.) = " + g);
   }
}