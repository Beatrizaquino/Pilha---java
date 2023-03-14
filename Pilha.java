//Você deverá Fazer a implementação de uma pilha que utiliza um Vetor (Array). A pilha deve conter pelo 
//menos as duas operações essenciais em uma pilha: a operação push() e a operação pop(), e opcionalmente 
//os métodos size(), isEmpty() e peek(), onde que os valores que podem ser inseridos sejam do tipo String.




public class Pilha {
    //declarando array
    public Object[] pilha;
    //variavel para armazenar a posição atual
    public int posicaoPilha;

    public Pilha() {
        //indicando que a posição esta nula, pois o 0 armazena uma posição
        this.posicaoPilha = -1;

        //criando uma pilha com 10 posições
        this.pilha = new Object[10];
    }

    //verifica se a posição da pilha é -1, caso seja retorna vazia
    public boolean pilhavazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }

        return false;
    }

    //função que retorna os quantidade da pilha
    public int tamanho(){
        if (this.pilhavazia()) {
            return 0; //indicando que não tem conteudo na pilha
        }
        return this.posicaoPilha + 1; // quantidade de items na pilha
        // soma mais 1 pois a pilha se inicia em  0
    }

    //função para empilhar os items
    public void empilhar(Object valor)  {
        //metodo push
        //verificando se a posicao da pilha é menor do que o tamanho da pilh, caso seja o valor é inserido e incrementado 
        if (this. posicaoPilha < this.pilha.length -1){
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public Object exibeUltimoValor() {
        //top
        if (this.pil()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }


    //função para remover items da lista
    public Object desempilhar() {
        //metodo pop
        //se a pilha estiver vazia nada será realizado
        if (pilhavazia()){
            return null;
        }
        return this.pilha[this. posicaoPilha --];
    }


    public void desempilhar(Object valor)  {
        //metodo push
        //verificando se a posicao da pilha é menor do que o tamanho da pilh, caso seja o valor é inserido e incrementado 
        if (this. posicaoPilha < this.pilha.length -1){
            this.pilha[++posicaoPilha] = valor;
        }
    }


    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry");
        p.empilhar("Calabresa");
        p.empilhar("Quatro queijos");
        p.empilhar(10);
            while (p.pilhavazia() == false) {
                System.out.println(p.desempilhar());
            }
    }
    
}
