import java.util.InputMismatchException;
import java.util.Scanner;

public class Transporte {
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;

    // Construtor vazio
    public Transporte() {}

    // Construtor com parâmetros
    public Transporte(int capacidadeTanque, int numeroPassageiros, double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    // Getters e Setters
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método imprimir
    public void imprimir() {
        System.out.println("Capacidade do Tanque: " + capacidadeTanque);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);
    }

    // Método entrada com tratamento de exceções
    public void entrada() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Capacidade do Tanque: ");
            capacidadeTanque = scanner.nextInt();

            System.out.print("Número de Passageiros: ");
            numeroPassageiros = scanner.nextInt();

            System.out.print("Preço: ");
            preco = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Por favor, insira o tipo de dado correto.");
            scanner.nextLine(); // Limpa o buffer do scanner
        }
    }

    // Método para reajustar o preço
    public void reajustarPreco(double percentual) {
        preco += preco * (percentual / 100);
    }
}