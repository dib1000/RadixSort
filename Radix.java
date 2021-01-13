public class Radix {
  public static int nth(int n, int col) {
    return Math.abs(n/((int)Math.pow(10,col)))%10;
  }

  public static int length(int n) {
    if(n==0) {
      return 1;
    }
    return (int)Math.log10(Math.abs(n))+1;
  }

  public static void merge(SortableLinkedList original,SortableLinkedList[]buckets) {
    for (int i = 0; i<buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }

  public static int mostDigits(SortableLinkedList data) {
    int digit = 0;
    for(int i = 0; i<data.size(); i++) {
      if(length(data.get(i))>digit) {
        digit = length(data.get(i));
      }
    }
    return digit;
  }

  public static void clear(SortableLinkedList s) {
    int length = s.size();
    for(int i = 0; i<length; i++) {
      s.remove(0);
    }
  }

  public static SortableLinkedList[] digitSort(SortableLinkedList data, int col) {
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int i = 0; i<buckets.length; i++) {
      buckets[i] = new SortableLinkedList();
    }
    for(int i = 0; i<data.size(); i++) {
      int number = nth(data.get(i),col);
      SortableLinkedList bucket = buckets[number];
      bucket.add(data.get(i));
    }
    return buckets;
  }

  public static void radixSortSimple(SortableLinkedList data) {
    int digit = mostDigits(data);
    for(int i = 0; i<digit; i++) {
     SortableLinkedList[] buckets = digitSort(data,i);
     clear(data);
     merge(data,buckets);
    }
    System.out.println(data.toString());
  }
}
