import java.util.Scanner;

public class MenuAddBike {
    
    public static void menuAddBike(CadastroBicicleta cb) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Digite o código da bicicleta:");
        int codigo = inp.nextInt();
        inp.nextLine();
        System.out.println("Digite o modelo da bicicleta:");
        String modelo = inp.nextLine();
        System.out.println("Digite a quantidade de unidades da bicicleta:");
        int quantidadeUnidades = inp.nextInt();

        Bicicleta bicicleta = new Bicicleta(codigo, modelo, quantidadeUnidades);

        cb.adicionaBicicleta(bicicleta);
        }
    }


