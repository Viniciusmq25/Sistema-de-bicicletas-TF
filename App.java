import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        CadastroMembro cm = new CadastroMembro();
        int numMenu = 0;

        do{
            System.out.println("****************MENU***************");
            System.out.println("BEM-VINDO AO CLUBE DE COMPARTILHAMENTO DE BICICLETAS DE PORTO ALEGRE!");
            System.out.println("1 - Adicionar membros");
            System.out.println("2 - Mostrar Membros");
            System.out.println("3 - Pesquisar membro por nome");
            System.out.println("4 - incluir bicicleta ao sistema");
            System.out.println("5 - Ver Bikes disponiveis");
            System.out.println("6 - Pesquisar bicicleta por modelo");
            System.out.println("7 - Emprestar bicicleta");
            System.out.println("8 - Devolver bicicleta");
            System.out.println("9 - Quantidade total de unidades disponiceis no sistema de empréstimo");
            System.out.println("10 - Sair");

            numMenu = inp.nextInt();

            switch (numMenu) {
                case 1:  
                    espaco();
                    MenuAddMembro.menuAddMembro(cm);
                    espaco();
                    break;
                case 2:
                    espaco();
                    cm.mostraMembros();
                    espaco();
                    break;
                case 3:  
                    inp.nextLine();
                    System.out.println("Digite o nome do membro: ");
                    String nomeM = inp.nextLine();
                    cm.pesquisaMembro(cm.getMembro(), nomeM);
                    break;
                case 4:  
                    
                    break;
                case 5:  
                    //CadastroMembro.mostraBikes
                    break;
                case 6:  
                    //CadastroBike.PesquisaBike
                    break;
                case 7:
                    //tirar uma bike disponivel e adicionar uma bike ao membro  
                    break;
                case 8:  
                    //tirar a bike do membro e adicionar ao banco de bikes
                    //
                    break;
                case 9:  
                    //quantidade de bikes disponiveis 
                    break;
                case 10: 
    
                    break;
            }

        }while(numMenu != 10);

        System.out.println("Programa encerrado");
        inp.close();
    }


    public static void divisor(){
        System.out.println("*************************");
    }

    public static void espaco(){
        System.out.println("");
    }
}