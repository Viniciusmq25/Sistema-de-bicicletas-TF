public class CadastroBicicleta {
    private Bicicleta [] bicicletas;
    private int index;

    public CadastroBicicleta(){
        bicicletas = new Bicicleta[10];
        index = 0;
    }

    public boolean adicionaBicicleta(Bicicleta b){
        if (index >= 10){
            System.out.println("cadastro cheio, não é possivel adicionar mais bicicletas.");
            return false;
        }

        for (int i = 0; i < index; i++) {
          if (b.getCodigo() == bicicletas[i].getCodigo()){
            System.out.println("codigo já existente, bicicleta nao adicionada.");
            return false;
        }
      }

        bicicletas[index] = b;
        index++;
        App.espaco();
        System.out.println("bicicleta(s) adicionada(s) com sucesso!!");
        return true;
    }

    public void mostraBikes(){
      if(index == 0){
          System.out.println("Ainda nao tem nenhuma bicicleta adicionada.");
      }else{
          for (int i = 0; i < index; i++){
              App.divisor();
              System.out.println(bicicletas[i].toString());
              App.divisor();
          }
      }
  }

  public Bicicleta buscaBicicletaPeloModelo(String modelo) {
    for (Bicicleta bicicleta : bicicletas) {
        if (bicicleta != null && bicicleta.getModelo().equals(modelo)) {
            return bicicleta;
        }
    }
    return null;
}

    public int totalUnidades() {
      int total = 0;
      for (Bicicleta bicicleta : bicicletas) {
          if (bicicleta != null) {
              total += bicicleta.getQuantidadeUnidades();
          }
      }
      return total;
  }
}
