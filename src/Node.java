public class Node {
    int data;
    Node next;
    Stack lista;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(Stack dado) {
        lista = dado;
        this.next = null;
    }
}
