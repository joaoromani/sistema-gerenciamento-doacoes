// Arquivo: DoacoesSystem.java

import java.util.ArrayList;

public class DoacoesSystem {
    public static void main(String[] args) {
        // Exemplo de uso do GerenciadorDeDoacoes
        GerenciadorDoacoes gerenciador = new GerenciadorDoacoes();
        
        gerenciador.adicionarDoacao("Alimentos", 100.0, "2024-06-20");
        gerenciador.adicionarDoacao("Roupas", 50.0, "2024-06-21");
        
        double totalDoacoes = gerenciador.calcularTotalDoacoes();
        System.out.println("Total de Doações: R$ " + totalDoacoes);
        
        ArrayList<Doacao> listaDoacoes = gerenciador.getDoacoes();
        System.out.println("Lista de Doações:");
        for (Doacao doacao : listaDoacoes) {
            System.out.println("Tipo: " + doacao.getTipo() + ", Valor: R$ " + doacao.getValor() + ", Data: " + doacao.getData());
        }
    }
}

class Doacao {
    private String tipo;
    private double valor;
    private String data;

    public Doacao(String tipo, double valor, String data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }
}

class GerenciadorDoacoes {
    private ArrayList<Doacao> doacoes;

    public GerenciadorDoacoes() {
        doacoes = new ArrayList<>();
    }

    public void adicionarDoacao(String tipo, double valor, String data) {
        Doacao novaDoacao = new Doacao(tipo, valor, data);
        doacoes.add(novaDoacao);
    }

    public double calcularTotalDoacoes() {
        double total = 0.0;
        for (Doacao d : doacoes) {
            total += d.getValor();
        }
        return total;
    }

    public ArrayList<Doacao> getDoacoes() {
        return doacoes;
    }
}
