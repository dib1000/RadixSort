public class radixTester {
  public static void main(String[] args) {
    System.out.println(Radix.nth(123,1));
    System.out.println(Radix.nth(-123,1));
    System.out.println(Radix.nth(123,2));
    System.out.println(Radix.nth(-123,2));
    System.out.println(Radix.nth(256,0));
    System.out.println(Radix.nth(4,2));
    System.out.println(Radix.nth(59,1));
    System.out.println();

    System.out.println("TESTING length");
    System.out.println(Radix.length(0));
    System.out.println(Radix.length(15));
    System.out.println(Radix.length(-10));
    System.out.println(Radix.length(5112));
    System.out.println(Radix.length(350));
    System.out.println(Radix.length(750));
  }
}
