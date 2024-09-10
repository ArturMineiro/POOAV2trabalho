import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando informações sobre a quantidade de cada tipo de transporte
        System.out.println("Quantos aviões deseja cadastrar?");
        int numAvioes = scanner.nextInt();

        System.out.println("Quantos navios deseja cadastrar?");
        int numNavios = scanner.nextInt();

        // Criando vetor de transportes
        Transporte[] transportes = new Transporte[numAvioes + numNavios];

        // Preenchendo o vetor com aviões
        for (int i = 0; i < numAvioes; i++) {
            Aviao aviao = new Aviao();
            System.out.println("Cadastro do avião " + (i + 1) + ":");
            aviao.entrada(scanner);
            System.out.println("Data da revisão:");
            aviao.setDataRevisao(scanner.next());
            transportes[i] = aviao;
            System.out.println("------------------------");
        }

        // Preenchendo o vetor com navios
        for (int i = numAvioes; i < numAvioes + numNavios; i++) {
            Navio navio = new Navio();
            System.out.println("Cadastro do navio " + (i - numAvioes + 1) + ":");
            navio.entrada(scanner);
            System.out.println("Nome do navio:");
            navio.setNome(scanner.next());
            System.out.println("Número de tripulantes:");
            navio.setNumeroTripulantes(scanner.nextInt());
            System.out.println("Data de lançamento:");
            navio.setDataLancamento(scanner.next());
            transportes[i] = navio;
            System.out.println("------------------------");
        }

        // Imprimindo dados dos transportes
        for (Transporte transporte : transportes) {
            transporte.imprimir();
            if (transporte instanceof Aviao) {
                System.out.println("Data da Revisão: " + ((Aviao) transporte).getDataRevisao());
            } else if (transporte instanceof Navio) {
                System.out.println("Nome: " + ((Navio) transporte).getNome());
                System.out.println("Número de Tripulantes: " + ((Navio) transporte).getNumeroTripulantes());
                System.out.println("Data de Lançamento: " + ((Navio) transporte).getDataLancamento());
            }
            System.out.println();
            System.out.println("------------------------");
        }

        scanner.close();
    }
}
