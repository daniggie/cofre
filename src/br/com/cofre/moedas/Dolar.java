package br.com.cofre.moedas;

public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return "$ " + valor;
    }

    @Override
    public double converterParaReal() {
        // Converte dolar para real
        return valor * 5.01;
    }
}