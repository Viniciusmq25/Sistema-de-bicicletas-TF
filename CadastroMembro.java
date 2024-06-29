public class CadastroMembro {
    private Membro [] vetor;
    private int index;

    public CadastroMembro(){
        vetor = new Membro[10];
        index = 0;
    }

    public Membro[] getMembro(){
        return vetor;
    }

    public boolean adicionaMembro(Membro m){
        if (index >= 10){
            return false;
        }else{
            vetor[index] = m;
            index++;
            return true;
        }
    }

    public void mostraMembros(){
        if(index == 0){
            System.out.println("Ainda nao tem nenhum membro adicionado");
        }else{
            for (int i = 0; i < index; i++){
                App.divisor();
                System.out.println(vetor[i].toString());
                App.divisor();
            }
        }
    }

    public void pesquisaMembro(Membro [] m, String nome){
        for(int i = 0; i< index; i++){
            if(nome.equalsIgnoreCase(m[i].getNome())){
                App.espaco();
                System.out.println(m[i]);
                App.espaco();
            }
        }
    }
}
