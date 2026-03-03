public class Fila {
    private No inicio = null;
    private No fim = null;

    public void inserir(int dado){
        No p = new No();
        p.setDado(dado);
        if(inicio==null){
            inicio = p;
            fim = p;
        }else{
            fim.setProximo(p);
            fim = p;
        }
        p.setProximo(null);
    }

    public void consultar(){
        No atual = inicio;
        if(atual == null){
            System.out.println("Lista vazia");
        }
        while(atual != null){
            System.out.println("Dados: " + atual.getDado());
            atual = atual.getProximo();
        }
    }

    public void excluir(){
        No atual = inicio;
        if(inicio == fim && inicio != null){
            inicio = null;
            fim = null;
        }else{
            System.out.println("Dado excluido é: " + inicio.getDado());
            inicio = inicio.getProximo();
            System.out.println("");
        }
    }
}