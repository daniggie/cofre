package br.com.cofre.moedas;

public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return "€ " + valor;
    }

    @Override
    public double converterParaReal() {
        // Converte o euro para real
        return valor * 5.41;
    }
}