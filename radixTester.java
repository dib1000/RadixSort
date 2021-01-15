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
    System.out.println();

    System.out.println("TESTING SortableLinkedList merge");
    SortableLinkedList x = new SortableLinkedList();
    SortableLinkedList y = new SortableLinkedList();
    SortableLinkedList z = new SortableLinkedList();
    for(int i = 0; i<10; i++) {
      z.add(i);
    }
    SortableLinkedList a = new SortableLinkedList();
    for(int i = 2; i<64; i+=2) {
      a.add(i);
    }
    SortableLinkedList[] yza = {z,y,a};
    Radix.merge(x,yza);
    System.out.println();
    //Radix.clear(x);


    System.out.println("Testing sort");
    SortableLinkedList one = new SortableLinkedList();
    one.add(329);
    one.add(457);
    one.add(657);
    one.add(839);
    one.add(436);
    one.add(720);
    one.add(355);
    SortableLinkedList two = new SortableLinkedList();
    two.add(12); two.add(34); two.add(42); two.add(32);
    two.add(44); two.add(41); two.add(34); two.add(11);
    two.add(32); two.add(23); two.add(87); two.add(50);
    two.add(77); two.add(58); two.add(8);  two.add(5);
    //System.out.println(Radix.mostDigits(one));
    //System.out.println(Radix.mostDigits(two));
//Radix.digitSort(one,1);
    Radix.radixSortSimple(one);
    Radix.radixSortSimple(two);
    SortableLinkedList negs = new SortableLinkedList();
    negs.add(10); negs.add(-10);
    negs.add(52); negs.add(-52);
    negs.add(5);  negs.add(-5);
    negs.add(209); negs.add(-209);
    negs.add(19);  negs.add(-19);
    negs.add(44); negs.add(-44);
    Radix.radixSort(negs);
  }
}
