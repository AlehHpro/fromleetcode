public class BrowserHistory {
    Node currentNode = null;
    public BrowserHistory(String homepage) {
        currentNode = new Node(homepage);
    }

    public void visit(String url) {
        Node newNode = new Node(url);
        currentNode.next = newNode;
        newNode.prev = currentNode;
        currentNode = newNode;
        System.out.println(currentNode.url);
    }

    private static class Node{
        Node next = null;
        Node prev = null;
        String url;
        public Node(String url){
            this.url = url;
        }
    }

    public String back(int steps) {
        while (steps != 0 && currentNode.prev != null){ //TODO
            currentNode = currentNode.prev;
            steps--;
        }
        System.out.println("In " + currentNode.url);
        return currentNode.url;
    }

    public String forward(int steps) {
        while (steps != 0 && currentNode.next != null){ //TODO
            currentNode = currentNode.next;
            steps--;
        }
        System.out.println("In " + currentNode.url);
        return currentNode.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
