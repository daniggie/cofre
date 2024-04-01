package br.com.cofre.moedas;

public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return "R$ " + valor;
    }

    @Override
    public double converterParaReal() {
        return valor;
    }
}

