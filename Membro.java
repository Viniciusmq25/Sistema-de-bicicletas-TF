public class Membro {
    private int matricula;
    private String nome;
    private String cidadeDeOrigem;
    private Bicicleta bicicletaEmprestada;

    public Membro(int matricula, String nome, String cidadeDeOrigem){
        this.matricula = matricula;
        this.nome = nome;
        this.cidadeDeOrigem = cidadeDeOrigem;
        this.bicicletaEmprestada = null;
    }

    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getCidadeDeOrigem(){
        return cidadeDeOrigem;
    }
    
    public Bicicleta getBicicletaEmprestada() {
      return bicicletaEmprestada;
  }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCidadeDeOrigem(String cidadeDeOrigem){
        this.cidadeDeOrigem = cidadeDeOrigem;
    }

    public void setBicicletaEmprestada(Bicicleta bicicletaEmprestada) {
      this.bicicletaEmprestada = bicicletaEmprestada;
    }

    public String toString(){
        return "\n Matricula: " + matricula + "\n Nome: " + nome + "\n Cidade de Origem: " + cidadeDeOrigem;
    }
    
}
