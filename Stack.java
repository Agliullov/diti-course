package stack;

public interface Stack {
    void push(String item);
    String pop();
    boolean isEmpty();
    int size();
}
class Stack
{
    private String[] stackArray;
    private int head;
    public String pop() {
        if (head == -1)
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            head--;
            return stackArray[head--];
        }
    }

    public Stack(int m) {
        stackArray = new String[m];
        head = -1;
    }

    public void push(String item) {
        if (stackArray.length == head+1)
            head++;
        stackArray[++head] = item;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public int size(){
        return head++;
    }
}
