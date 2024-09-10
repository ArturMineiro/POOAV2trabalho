import java.util.Scanner;

public class Aviao extends Transporte {
    private String dataRevisao;

    // Construtor vazio
    public Aviao() {
        super();
        this.dataRevisao = "";
    }

    // Construtor com parâmetros
    public Aviao(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco, String dataRevisao) {
        super(prefixo, capacidadeTanque, numeroPassageiros, preco);
        this.dataRevisao = dataRevisao;
    }

    // Getter e Setter específico
    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    // Método para reajustar preço
    public void reajustarPreco(double percentual) {
        this.preco *= (1 + percentual / 100);
    }
}
