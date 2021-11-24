package com.company;

public class Embarcacao {

    private double preco;
    private double valorAdc;
    private int anoFab;
    private int comprimento;

    public Embarcacao(double preco, double valorAdc, int anoFab,
                      int comprimento) {
        this.valorAdc = valorAdc;
        this.anoFab = anoFab;
        this.comprimento = comprimento;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorAdc() {
        return valorAdc;
    }

    public void setValorAdc(double valorAdc) {
        this.valorAdc = valorAdc;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }


    public double calcularValorAluguel(){
        if (getAnoFab() > 2020) {
            return getPreco() + getValorAdc();
        } else {
            return getPreco();
        }


    }
}
