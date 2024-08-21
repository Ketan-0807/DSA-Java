import java.util.ArrayList;

public class PowerOfTwoMaxHeap {
    private ArrayList<Integer> heap;
    private int numChildren; // No. of children per node

    public PowerOfTwoMaxHeap(int k) {
        heap = new ArrayList<>();
        numChildren = (int) Math.pow(2, k);
    }

    public void insert(int value) {  // insert the value
        heap.add(value);
        bubbleUp(heap.size() - 1);
    }

    public int popMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        bubbleDown(0);
        return maxValue;
    }

    private void bubbleUp(int index) {
        int parentIndex = (index - 1) / numChildren;
        while (index > 0 && heap.get(index) > heap.get(parentIndex)) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / numChildren;
        }
    }

    private void bubbleDown(int index) {
        int maxIndex = index;
        int size = heap.size();
        
        for (int i = 1; i <= numChildren; i++) {
            int childIndex = numChildren * index + i;
            if (childIndex < size && heap.get(childIndex) > heap.get(maxIndex)) {
                maxIndex = childIndex;
            }
        }

        if (maxIndex != index) {
            swap(index, maxIndex);
            bubbleDown(maxIndex);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String[] args) {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(1); 
        
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        System.out.println(heap.popMax()); 
        System.out.println(heap.popMax()); 
        System.out.println(heap.popMax()); 

        
        PowerOfTwoMaxHeap heap2 = new PowerOfTwoMaxHeap(2); 
        heap2.insert(10);
        heap2.insert(20);
        heap2.insert(5);
        heap2.insert(30);
        heap2.insert(25);
        System.out.println(heap2.popMax()); 
        System.out.println(heap2.popMax()); 
        System.out.println(heap2.popMax()); 
        System.out.println(heap2.popMax()); 
        System.out.println(heap2.popMax()); 
    }
}
