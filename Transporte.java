import java.util.Scanner;

public class Transporte {
    protected String prefixo;
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;

    // Construtor vazio
    public Transporte() {
        this.prefixo = "";
        this.capacidadeTanque = 0;
        this.numeroPassageiros = 0;
        this.preco = 0.0;
    }

    // Construtor com parâmetros
    public Transporte(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco) {
        this.prefixo = prefixo;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    
    // Getters e Setters
    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

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

    // Método para entrada de dados
    public void entrada(Scanner scanner) {
        System.out.println("Prefixo: ");
        this.prefixo = scanner.next();
        System.out.println("Capacidade do Tanque: ");
        this.capacidadeTanque = scanner.nextInt();
        System.out.println("Número de Passageiros: ");
        this.numeroPassageiros = scanner.nextInt();
        System.out.println("Preço: ");
        this.preco = scanner.nextDouble();
    }

    // Método para imprimir dados
    public void imprimir() {
        
        if (!(this instanceof Navio)) {
            System.out.println("Prefixo: " + prefixo);
        }
        System.out.println("Capacidade do Tanque: " + capacidadeTanque);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);
    }
}
