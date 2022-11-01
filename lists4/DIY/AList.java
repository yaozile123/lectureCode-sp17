/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    private int[] list;
    int size;
    public AList() {
        list = new int[100];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if (size == list.length){
            int[] a = new int[size*2];
            System.arraycopy(list,0,a,0,size);
            list = a;
        }
        list[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {

        return list[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {

        return list[i];
    }

    /** Returns the number of items in the list. */
    public int size() {

        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int last_element = list[size-1];
        list[size-1] = 0;
        size -= 1;
        return last_element;
    }
} 