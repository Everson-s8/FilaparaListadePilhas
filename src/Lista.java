public class Lista<S> {

    private Node primeiro;

    public Lista<Stack> obterpilha(Fila fila, int qtdpilha) throws Exception {
        Lista<Stack> stacks = new Lista<>();
        Stack pilha = new Stack();

        int media = fila.getQtd()/qtdpilha;
        int resto = fila.getQtd() % qtdpilha;
        int capacidademaxima = media + resto;


        while (!fila.isEmpty()){
            int elemento = fila.desfilerar();
            pilha.push(elemento);
        }

        if (resto == 0){
            for (int i = 0; i < qtdpilha; i++) {
                Stack pilhas = new Stack();

                for (int j = 0; j < media; j++) {
                    pilhas.push(pilha.pop());
                }
                stacks.ListarInicio(pilhas);
            }
        }else {
            for (int i = 0; i < qtdpilha - 1 ; i++) {
                Stack pilhas = new Stack();

                for (int j = 0; j < media; j++) {
                    pilhas.push(pilha.pop());
                }
                stacks.ListarInicio(pilhas);
            }
            Stack pilhas = new Stack();
            for (int i = 0; i <capacidademaxima ; i++) {
                pilhas.push(pilha.pop());
            }
            stacks.ListarInicio(pilhas);
        }
        return stacks;
    }


    public void ListarInicio(Stack dado){
        Node lista = new Node(dado);
        if (primeiro == null){
            primeiro = lista;
        }else {
            lista.next = primeiro;
            primeiro = lista;
        }
    }

    public void Listar(Stack dado){
        Node lista = new Node(dado);
        if (primeiro == null){
            primeiro = lista;
        }else {
            Node noAux = primeiro;
            while (noAux.next != null){
                noAux = noAux.next;
            }
            noAux.next = lista;
        }
    }





}
