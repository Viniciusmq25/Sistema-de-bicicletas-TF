import java.util.Scanner;

public class App{

  
      private static Scanner inp = new Scanner(System.in);
      private static CadastroMembro cm = new CadastroMembro();
      private static CadastroBicicleta cb = new CadastroBicicleta();

    public static void main(String[] args) {
        int numMenu = 0;

        do{
            espaco();
            espaco();
            System.out.println("****************MENU***************");
            System.out.println("BEM-VINDO AO CLUBE DE COMPARTILHAMENTO DE BICICLETAS DE PORTO ALEGRE!");
            System.out.println("1 - Adicionar membros");
            System.out.println("2 - Mostrar Membros");
            System.out.println("3 - Pesquisar membro por nome");
            System.out.println("4 - incluir bicicletas ao sistema");
            System.out.println("5 - Ver Bikes disponiveis");
            System.out.println("6 - Pesquisar bicicleta por modelo");
            System.out.println("7 - Emprestar bicicleta");
            System.out.println("8 - Devolver bicicleta");
            System.out.println("9 - Quantidade total de unidades disponiveis no sistema de empréstimo");
            System.out.println("10 - Sair");

            numMenu = inp.nextInt();

            switch (numMenu) {
                case 1:  
                    espaco();
                    MenuAddMembro.menuAddMembro(cm);
                    espaco();
                    break;
                case 2:
                    cm.mostraMembros();
                    espaco();
                    break;
                case 3:  
                    pesquisarMembro();
                    break;
                case 4: 
                    espaco();
                    MenuAddBike.menuAddBike(cb);
                    espaco();
                    break;
                case 5:
                    cb.mostraBikes();
                    break;
                case 6:  
                    pesquisarBicicleta();
                    break;
                case 7:
                    emprestarBicicleta();
                    break;
                case 8:  
                    devolverBicicleta();
                    break;
                case 9:  
                    mostrarTotalUnidades();
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

    private static void pesquisarBicicleta() {
      inp.nextLine();
      System.out.println("Digite o modelo da bicicleta:");
      String modelo = inp.nextLine();
      Bicicleta bicicleta = cb.buscaBicicletaPeloModelo(modelo);
      if (bicicleta != null) {
          System.out.println("Código: " + bicicleta.getCodigo() + ", Modelo: " + bicicleta.getModelo() + ", Quantidade: " + bicicleta.getQuantidadeUnidades());
      } else {
          System.out.println("Bicicleta não encontrada.");
      }
  }

  private static void pesquisarMembro() {
    System.out.println("Digite o nome do membro:");
    String nome = inp.nextLine();
    Membro membro = cm.pesquisaMembro(nome);
    if (membro != null) {
        System.out.println("Matrícula: " + membro.getMatricula() + ", Nome: " + membro.getNome() + ", Cidade de Origem: " + membro.getCidadeDeOrigem());
    } else {
        System.out.println("Membro não encontrado.");
    }
  }

  private static void emprestarBicicleta() {
    System.out.println("Digite a matrícula do membro:");
    int matricula = inp.nextInt();
    inp.nextLine(); // Consome a nova linha
    Membro membro = cm.pesquisaMembro(String.valueOf(matricula));

    if (membro != null && membro.getBicicletaEmprestada() == null) {
        System.out.println("Digite o modelo da bicicleta:");
        String modelo = inp.nextLine();
        Bicicleta bicicleta = cb.buscaBicicletaPeloModelo(modelo);

        if (bicicleta != null && bicicleta.emprestar()) {
            membro.setBicicletaEmprestada(bicicleta);
            System.out.println("Bicicleta emprestada com sucesso!");
        } else {
            System.out.println("Não há bicicletas disponíveis para empréstimo.");
        }
    } else {
        System.out.println("Membro não encontrado ou já possui uma bicicleta emprestada.");
    }
  }

  private static void devolverBicicleta() {
    System.out.println("Digite a matrícula do membro:");
    int matricula = inp.nextInt();
    inp.nextLine(); // Consome a nova linha
    Membro membro = cm.pesquisaMembro(String.valueOf(matricula));

    if (membro != null && membro.getBicicletaEmprestada() != null) {
        membro.getBicicletaEmprestada().devolver();
        membro.setBicicletaEmprestada(null);
        System.out.println("Bicicleta devolvida com sucesso!");
    } else {
        System.out.println("Membro não encontrado ou não possui bicicleta emprestada.");
    }
  }

  private static void mostrarTotalUnidades() {
    System.out.println("Quantidade total de unidades disponíveis: " + cb.totalUnidades());
}
}