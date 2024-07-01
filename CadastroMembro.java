public class CadastroMembro {
    private Membro [] membros;
    private int index;

    public CadastroMembro(){
        membros = new Membro[10];
        index = 0;
    }

    public boolean adicionaMembro(Membro m){
        if (index >= 10){
            System.out.println("cadastro cheio");
            return false;
        }

        for (int i = 0; i < index; i++) {
          if(m.getMatricula() == membros[i].getMatricula()){
            App.espaco();
            System.out.println("matricula ja existente, membro nao adicionado");
            return false;
          };
        }

        membros[index] = m;
        index++;
        App.espaco();
        System.out.println("membro adicionado com sucesso!!");
        return true;
    }

    public void mostraMembros(){
        if(index == 0){
            System.out.println("Ainda nao tem nenhum membro adicionado");
        }else{
            for (int i = 0; i < index; i++){
                App.divisor();
                System.out.println(membros[i].toString());
                App.divisor();
            }
        }
    }

    public Membro pesquisaMembro(String nome){
        for (Membro membro : membros) {
            if (membro != null && membro.getNome().equalsIgnoreCase(nome)) {
                return membro;
            }
        }
        return null;
    }

    public Membro pesquisaMemPorMatricula(int matricula){
        for (Membro membro : membros) {
            if (membro != null && membro.getMatricula() ==matricula) {
                return membro;
            }
        }
        return null;
    }
}
