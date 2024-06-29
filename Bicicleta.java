public class Bicicleta {
    private int codigo;
    private String modelo;
    private int quantidade;

    public Bicicleta(int codigo, String modelo, int quantidade){
        this.codigo = codigo;
        this.modelo = modelo;
        this.quantidade = quantidade;

    }

    public int getCodigo(){
        return codigo;
    }

    public String getModelo(){
        return modelo;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String toString(){
        return "\n Codigo: " + codigo + "\n Modelo: " + modelo + "\n Quantidade: " + quantidade;
    }
}
