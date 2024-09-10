import java.util.Scanner;

public class Navio extends Transporte {
    private String nome;
    private int numeroTripulantes;
    private String dataLancamento;

    // Construtor vazio
    public Navio() {
        super();
        this.nome = "";
        this.numeroTripulantes = 0;
        this.dataLancamento = "";
    }


    public Navio(String nome, int capacidadeTanque, int numeroPassageiros, double preco, int numeroTripulantes, String dataLancamento) {
        super("", capacidadeTanque, numeroPassageiros, preco); // Prefixo não definido aqui
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    // Getters e Setters específicos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    // Sobrescrevendo o método entrada
    @Override
    public void entrada(Scanner scanner) {
        // Não chamando o método da superclasse para evitar a coleta de prefixo
        System.out.println("Capacidade do Tanque: ");
        this.capacidadeTanque = scanner.nextInt();
        System.out.println("Número de Passageiros: ");
        this.numeroPassageiros = scanner.nextInt();
        System.out.println("Preço: ");
        this.preco = scanner.nextDouble();
    }

    
}
