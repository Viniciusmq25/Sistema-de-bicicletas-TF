public class Bicicleta {
    private int codigo;
    private String modelo;
    private int quantidadeUnidades;

    public Bicicleta(int codigo, String modelo, int quantidadeUnidades){
        this.codigo = codigo;
        this.modelo = modelo;
        this.quantidadeUnidades = quantidadeUnidades;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getModelo(){
        return modelo;
    }

    public int getQuantidadeUnidades() {
      return quantidadeUnidades;
  }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setQuantidadeUnidades(int quantidadeUnidades) {
      this.quantidadeUnidades = quantidadeUnidades;
  }

  public boolean emprestar() {
    if (quantidadeUnidades > 0) {
        quantidadeUnidades--;
        return true;
    }
    return false;
  }

  public void devolver() {
    quantidadeUnidades++;
  }
    public String toString(){
        return "\n Codigo: " + codigo + "\n Modelo: " + modelo + "\n Quantidade de Unidades: " + quantidadeUnidades;
    }
}
