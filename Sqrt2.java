// Computes an approximate square root by bi-section search
public class Sqrt2 {
   public static void main(String args[]) {
      double x = 16;
      double epsilon = 0.01, low = 1.0, high = x;
      double g = (low + high) / 2.0;
      int itrCounter = 0;
      while (Math.abs(g * g - x) >= epsilon) {
         if (g * g < x)
            low = g;
         else
            high = g;
         g = (low + high) / 2;
         itrCounter++;
      }
      System.out.println("Square root (approx.) = " + g);
      System.out.println("Number of iterations = " + itrCounter);
   }
}