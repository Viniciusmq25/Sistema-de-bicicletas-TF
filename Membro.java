public class Membro {
    private int matricula;
    private String nome;
    private String cidadeDeOrigem;
    private int bicicletas;

    public Membro(int matricula, String nome, String cidadeDeOrigem, int bicicletas){
        this.matricula = matricula;
        this.nome = nome;
        this.cidadeDeOrigem = cidadeDeOrigem;
        this.bicicletas = bicicletas;
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
    public int bicicletas(){
        return bicicletas;
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

    public void setBicicletas(int bicicletas){
        this.bicicletas = bicicletas;
    }

    public String toString(){
        return " Nome: " + nome + "\n Matricula: " + matricula + "\n CidadeDeOrigem: " + cidadeDeOrigem + "\n Bicicletas: " + bicicletas;
    }
    
}
