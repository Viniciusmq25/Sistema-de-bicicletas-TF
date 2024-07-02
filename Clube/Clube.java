package Clube;
import java.util.Scanner;

class Membro {
    private int matricula;
    private String nome;
    private String cidadeOrigem;
    private Bicicleta bicicletaEmprestada;

    public Membro(int matricula, String nome, String cidadeOrigem) {
        this.matricula = matricula;
        this.nome = nome;
        this.cidadeOrigem = cidadeOrigem;
        this.bicicletaEmprestada = null;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public Bicicleta getBicicletaEmprestada() {
        return bicicletaEmprestada;
    }

    public void setBicicletaEmprestada(Bicicleta bicicletaEmprestada) {
        this.bicicletaEmprestada = bicicletaEmprestada;
    }
}

class Bicicleta {
    private int codigo;
    private String modelo;
    private int quantidadeUnidades;

    public Bicicleta(int codigo, String modelo, int quantidadeUnidades) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.quantidadeUnidades = quantidadeUnidades;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getQuantidadeUnidades() {
        return quantidadeUnidades;
    }

    public void setQuantidadeUnidades(int quantidadeUnidades) {
        this.quantidadeUnidades = quantidadeUnidades;
    }

    public boolean emprestar() {
        if (quantidadeUnidades > 0) {
            quantidadeUnidades--;
            return true;
        }
        return false;
    }

    public void devolver() {
        quantidadeUnidades++;
    }
}

class CadastroMembro {
    private Membro[] membros;
    private int indice;

    public CadastroMembro() {
        membros = new Membro[10];
        indice = 0;
    }

    public boolean adicionaMembro(Membro membro) {
        if (indice < membros.length) {
            membros[indice++] = membro;
            return true;
        }
        return false;
    }

    public Membro buscaMembroPeloNome(String nome) {
        for (Membro membro : membros) {
            if (membro != null && membro.getNome().equals(nome)) {
                return membro;
            }
        }
        return null;
    }

    public void mostraMembros() {
        for (Membro membro : membros) {
            if (membro != null) {
                System.out.println("Matrícula: " + membro.getMatricula() + ", Nome: " + membro.getNome() + ", Cidade de Origem: " + membro.getCidadeOrigem());
            }
        }
    }
}

class CadastroBicicleta {
    private Bicicleta[] bicicletas;
    private int indice;

    public CadastroBicicleta() {
        bicicletas = new Bicicleta[10];
        indice = 0;
    }

    public boolean adicionaBicicleta(Bicicleta bicicleta) {
        if (indice < bicicletas.length) {
            bicicletas[indice++] = bicicleta;
            return true;
        }
        return false;
    }

    public Bicicleta buscaBicicletaPeloModelo(String modelo) {
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta != null && bicicleta.getModelo().equals(modelo)) {
                return bicicleta;
            }
        }
        return null;
    }

    public int totalUnidades() {
        int total = 0;
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta != null) {
                total += bicicleta.getQuantidadeUnidades();
            }
        }
        return total;
    }

    public void mostraBicicletas() {
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta != null) {
                System.out.println("Código: " + bicicleta.getCodigo() + ", Modelo: " + bicicleta.getModelo() + ", Quantidade: " + bicicleta.getQuantidadeUnidades());
            }
        }
    }
}

public class Clube {
    private static CadastroMembro cadastroMembro = new CadastroMembro();
    private static CadastroBicicleta cadastroBicicleta = new CadastroBicicleta();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("1. Incluir membro");
            System.out.println("2. Mostrar membros");
            System.out.println("3. Pesquisar membro por nome");
            System.out.println("4. Incluir bicicleta");
            System.out.println("5. Mostrar bicicletas");
            System.out.println("6. Pesquisar bicicleta por modelo");
            System.out.println("7. Emprestar bicicleta");
            System.out.println("8. Devolver bicicleta");
            System.out.println("9. Quantidade total de unidades disponíveis no sistema de empréstimo");
            System.out.println("10. Sair do programa");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    incluirMembro();
                    break;
                case 2:
                    mostrarMembros();
                    break;
                case 3:
                    pesquisarMembro();
                    break;
                case 4:
                    incluirBicicleta();
                    break;
                case 5:
                    mostrarBicicletas();
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
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 10);
    }

    private static void incluirMembro() {
        System.out.println("Digite a matrícula do membro:");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        System.out.println("Digite o nome do membro:");
        String nome = scanner.nextLine();
        System.out.println("Digite a cidade de origem do membro:");
        String cidadeOrigem = scanner.nextLine();

        Membro membro = new Membro(matricula, nome, cidadeOrigem);
        if (cadastroMembro.adicionaMembro(membro)) {
            System.out.println("Membro incluído com sucesso!");
        } else {
            System.out.println("Não foi possível incluir o membro.");
        }
    }

    private static void mostrarMembros() {
        cadastroMembro.mostraMembros();
    }

    private static void pesquisarMembro() {
        System.out.println("Digite o nome do membro:");
        String nome = scanner.nextLine();
        Membro membro = cadastroMembro.buscaMembroPeloNome(nome);
        if (membro != null) {
            System.out.println("Matrícula: " + membro.getMatricula() + ", Nome: " + membro.getNome() + ", Cidade de Origem: " + membro.getCidadeOrigem());
        } else {
            System.out.println("Membro não encontrado.");
        }
    }

    private static void incluirBicicleta() {
        System.out.println("Digite o código da bicicleta:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        System.out.println("Digite o modelo da bicicleta:");
        String modelo = scanner.nextLine();
        System.out.println("Digite a quantidade de unidades da bicicleta:");
        int quantidadeUnidades = scanner.nextInt();

        Bicicleta bicicleta = new Bicicleta(codigo, modelo, quantidadeUnidades);
        if (cadastroBicicleta.adicionaBicicleta(bicicleta)) {
            System.out.println("Bicicleta incluída com sucesso!");
        } else {
            System.out.println("Não foi possível incluir a bicicleta.");
        }
    }

    private static void mostrarBicicletas() {
        cadastroBicicleta.mostraBicicletas();
    }

    private static void pesquisarBicicleta() {
        System.out.println("Digite o modelo da bicicleta:");
        String modelo = scanner.nextLine();
        Bicicleta bicicleta = cadastroBicicleta.buscaBicicletaPeloModelo(modelo);
        if (bicicleta != null) {
            System.out.println("Código: " + bicicleta.getCodigo() + ", Modelo: " + bicicleta.getModelo() + ", Quantidade: " + bicicleta.getQuantidadeUnidades());
        } else {
            System.out.println("Bicicleta não encontrada.");
        }
    }

    private static void emprestarBicicleta() {
        System.out.println("Digite a matrícula do membro:");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        Membro membro = cadastroMembro.buscaMembroPeloNome(String.valueOf(matricula));

        if (membro != null && membro.getBicicletaEmprestada() == null) {
            System.out.println("Digite o modelo da bicicleta:");
            String modelo = scanner.nextLine();
            Bicicleta bicicleta = cadastroBicicleta.buscaBicicletaPeloModelo(modelo);

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
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        Membro membro = cadastroMembro.buscaMembroPeloNome(String.valueOf(matricula));

        if (membro != null && membro.getBicicletaEmprestada() != null) {
            membro.getBicicletaEmprestada().devolver();
            membro.setBicicletaEmprestada(null);
            System.out.println("Bicicleta devolvida com sucesso!");
        } else {
            System.out.println("Membro não encontrado ou não possui bicicleta emprestada.");
        }
    }

    private static void mostrarTotalUnidades() {
        System.out.println("Quantidade total de unidades disponíveis: " + cadastroBicicleta.totalUnidades());
    }
}

