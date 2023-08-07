import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        int[] values = new int[]{100,5,69,5,9,7,34,99,1,2,13,3,8};

        Node list = createList(values);
        //printList(list);
        //Node modList = removeValue(7, list);
        //printList(list);
        //printList(modList);
        //list = removeLeftElements(list);
        //printList(list);
        //printFromStack(list);
        list = removeFromStack(list);
        printList(list);
    }

    public static void printFromStack(Node root){
        Stack<Node> nodeStack = new Stack<>();
        Node next = root;
        while (next != null){
            nodeStack.push(next);
            next = next.nextNode;
        }
        while (!nodeStack.isEmpty()){
            System.out.println(nodeStack.pop().value);
        }
    }
    public static Node removeFromStack(Node root){
        Stack<Node> nodeStack = new Stack<>();
        Node next = root;
        while (next != null){
            nodeStack.push(next);
            next = next.nextNode;
        }
        Node max = null;
        Node current = null;
        while (!nodeStack.isEmpty()){
            current = nodeStack.pop();
            if(max == null){
                max = current;
                root = current;
            } else if (max.value > current.value) {
                continue;
            } else {
                max = current;
                current.nextNode = root;
                root = current;
            }
        }
        return root;
    }
    public static boolean hasBiggerToTheRight(Node list) {
        Node biggest = list;
        while (list != null) {
            if (list.value > biggest.value) {
                return true;
            } else {
                list = list.nextNode;
            }
        }
        return false;
    }

    public static Node removeLeftElements(Node list) {
        Node root = list;
        Node prev = root;
        while (list != null) {
            if (hasBiggerToTheRight(list)) {
                if (list == root) {
                    root = list.nextNode;
                    list = list.nextNode;
                    prev = list;
                } else {
                    prev.nextNode = list.nextNode;
                    list = list.nextNode;
                }
            } else {
                prev = list;
                list = list.nextNode;
            }
        }
        return root;
    }

    public static Node removeValue(int i, Node list) {
        Node root = list;
        Node prev = list;

        if (root.value == i) {
            root = root.nextNode;
            return root;
        }
        while (list.nextNode != null) {
            if (list.value != i) {
                prev = list;
                list = list.nextNode;
            } else {
                prev.nextNode = list.nextNode;
                list = list.nextNode;
            }
        }
        return root;
    }

    public static void printList(Node node) {
        while (node.nextNode != null) {
            System.out.println(node.value);
            node = node.nextNode;
        }
        System.out.println(node.value);
    }

    public static Node createList(int[] values) {
        Node root = new Node(values[0]);
        Node first = root;
        for (int i = 1; i < values.length; i++) {
            Node current = new Node(values[i]);
            root.nextNode = current;
            root = current;
        }
        return first;
    }

    public static class Node {
        Node nextNode = null;
        int value;

        public Node(int value) {
            this.value = value;
        }

    }

}
