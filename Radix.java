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

  public static int largestDigit(SortableLinkedList data) {
    SortableLinkedList storage = new SortableLinkedList();
    int length = data.size();
    int largest = 0;
    for(int i = 0; i<length; i++) {
      if(length(data.get(0))>largest) {
        largest = length(data.get(0));
      }
      storage.add(data.remove(0));
    }
    data.extend(storage);
    return largest;
  }

  public static SortableLinkedList[] digitSort(SortableLinkedList data, int col,SortableLinkedList[]buckets) {
    int length = data.size();
    for(int i = 0; i<length; i++) {
      int number = nth(data.get(0),col);
      SortableLinkedList bucket = buckets[number];
      bucket.add(data.remove(0));
    }
    return buckets;
  }

  public static void radixSortSimple(SortableLinkedList data) {
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    int length = data.size();
    int largest = largestDigit(data);
    for(int i = 0; i<buckets.length; i++) {
      buckets[i] = new SortableLinkedList();
    }
    for(int n = 0; n<largest; n++) {
      digitSort(data,n,buckets);
      merge(data,buckets);
    }
  }

  public static void radixSort(SortableLinkedList data) {
    SortableLinkedList negatives = new SortableLinkedList();
    SortableLinkedList positives = new SortableLinkedList();
    int length = data.size();
    for(int i = 0; i<length;i++) {
      if(data.get(0)<0) {
        negatives.add(data.remove(0));
      }
      else {
        positives.add(data.remove(0));
      }
    }
    radixSortSimple(negatives);
    radixSortSimple(positives);
    int negLength = negatives.size();
    for(int n = 0; n<negLength; n++) {
      data.add(negatives.remove(negatives.size()-1));
    }
    data.extend(positives);
    System.out.println(data);
  }
}
