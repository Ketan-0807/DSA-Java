import java.util.EmptyStackException;

public class Stack {
    private int size;
    private int top;
    private int ele[];

    public  Stack(int x) {
        this.size=x;
        this.top=-1;
        this.ele= new int[x];

    
}
    public int pop(){
        if(isEmpty()){
        throw new EmptyStackException();
        } else{
            return ele[--top];
        }
    }
    boolean isEmpty(){
        return (top ==-1);
    }
    public int peek (){
        if(isEmpty()) {
            throw new EmptyStackException();
    }
    return ele[top];}
    boolean isFull(){
        return (top == size-1);
    }
    public void push(int val){
    if(isFull()){
        System.out.println("Stack is full");
    } else{
        ele[++top]=val;
    }
    }
    public static void main (String args []){
        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        System.out.println("The popped element is " +st.pop());
        System.out.println("The top element is "+st.peek()); 
    }
}
