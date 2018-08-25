package list;

import java.util.LinkedList;

public class LinkedListMain {
    private LinkedList<String > linkedList = new LinkedList<>();

    private void push(String s){
        linkedList.addFirst(s);
    }

    private String pop(){
        return linkedList.removeFirst();
    }

    private boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public static void main(String[] args) {
        LinkedListMain stack = new LinkedListMain();
        stack.push("push 1");
        stack.push("push 2");
        stack.push("push 3");
        System.out.print("第一个元素是:\t");
        System.out.println(stack.pop());
        System.out.println();
        System.out.println("全部元素:");
        while(!stack.isEmpty()){
            System.out.println("\t"+stack.pop());
        }
    }
}
