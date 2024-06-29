import java.util.Scanner;

public class MenuAddMembro {

    public static void menuAddMembro(CadastroMembro cm) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Digite a matrícula do membro:");
        int matricula = inp.nextInt();
        
        inp.nextLine(); 

        System.out.println("Digite o nome do membro:");
        String nome = inp.nextLine();
        System.out.println("Digite a cidade de origem do membro:");
        String cidadeOrigem = inp.nextLine();

        Membro membro = new Membro(matricula, nome, cidadeOrigem);

        cm.adicionaMembro(membro);
        
    }

}
