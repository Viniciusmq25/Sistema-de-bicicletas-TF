public class CadastroBicicleta {
    private Bicicleta [] vetor;
    private int index = 0;

    public CadastroBicicleta(){
        vetor = new Bicicleta[10];
        index = 0;
    }

    public Bicicleta[] getBicicleta(){
        return vetor;
    }

    // public boolean adicionaMembro(Bicicleta b){
    //     if (index >= 10){
    //         return false;
    //     }else{
    //         vetor[index] = b;
    //         index++;
    //         return true;
    //     }
    // }
}
