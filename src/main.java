public class main {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();

        fila.enfilerar(1);
        fila.enfilerar(2);
        fila.enfilerar(3);
        fila.enfilerar(4);
        fila.enfilerar(5);
        fila.enfilerar(6);
        fila.enfilerar(7);

        Lista<Stack> listapilha = new Lista<>();
        listapilha.obterpilha(fila,3);


    }
}
