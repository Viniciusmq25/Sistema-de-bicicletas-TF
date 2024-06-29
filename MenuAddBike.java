import java.util.Scanner;

public class MenuAddBike {
    
    public static void menuAddBike(CadastroBicicleta cb) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código da bicicleta:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        System.out.println("Digite o modelo da bicicleta:");
        String modelo = scanner.nextLine();
        System.out.println("Digite a quantidade de unidades da bicicleta:");
        int quantidadeUnidades = scanner.nextInt();

        Bicicleta bicicleta = new Bicicleta(codigo, modelo, quantidadeUnidades);

        cb.adicionaBicicleta(bicicleta);
        }
  }
