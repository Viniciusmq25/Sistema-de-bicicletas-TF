import java.util.Scanner;

public class MenuAddBike {
    
    public static void menuAddMembro(CadastroMembro cm) {
        Scanner inp = new Scanner(System.in);
        
        Membro membro = new Membro(0, "", "", 0);

        System.out.println("digite o nome do membro: ");
        membro.setNome(inp.nextLine());

        App.espaco();
        System.out.println("digite a matricula do membro: ");
        membro.setMatricula(inp.nextInt());

        inp.nextLine();

        App.espaco();
        System.out.println("digite a cidade de origem do membro: ");
        membro.setCidadeDeOrigem(inp.nextLine());

        if (cm.adicionaMembro(membro)) {
            App.espaco();
            System.out.println("Membro adicionado!!");
        } else {
            App.espaco();
            System.out.println("membro nao adicionado, sistema cheio.");
        }

        
    }
}
