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
    System.out.println();

    System.out.println("Testing merge");
    MyLinkedList empty = new MyLinkedList();
    for(int i = 0; i<4; i++) {
      empty.add("r");
    }
    MyLinkedList empty2 = new MyLinkedList();
    MyLinkedList nums = new MyLinkedList();
    for(int i = 0; i<10; i++) {
      nums.add(""+i);
    }
    MyLinkedList tens = new MyLinkedList();
    for(int i = 10; i<20; i++) {
      tens.add(""+i);
    }
    MyLinkedList twix = new MyLinkedList();
    for(int i = 0; i<5; i++) {
      twix.add("xXx");
    }
    MyLinkedList hA = new MyLinkedList();
    for(int i = 0; i<4; i++) {
      hA.add("J");
    }
    MyLinkedList[] stors = {empty2,nums,tens,twix,hA};
    //Radix.merge(empty,stors);
    Radix.merge(empty,stors);
  }
}
