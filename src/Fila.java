class Fila {
    Node front;
    Node rear;
    int tamanho;

    public int getQtd() {
        return tamanho;
    }
    public Fila() {
        this.front = null;
        this.rear = null;
    }

    public void enfilerar(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        tamanho++;
    }

    public int desfilerar() throws Exception {
        if (isEmpty()) {
            throw new Exception("fila is empty");
        }

        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
