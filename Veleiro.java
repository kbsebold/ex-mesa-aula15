package com.company;

import java.time.LocalDate;

public class Veleiro extends Embarcacao {
    private int qtdMastros;

    public Veleiro(double preco, double valorAdc, int anoFab,
                   int comprimento, int qtdMastros) {
        super(preco, valorAdc, anoFab, comprimento);
        this.qtdMastros = qtdMastros;
    }

    public int getQtdMastros() {
        return qtdMastros;
    }

    public void verificarTamanho(){
        if (qtdMastros > 4){
            System.out.println("O veleiro é grande.");
        } else {
            System.out.println("O veleiro tem tamanho padrão.");
        }
    }

    public double calcularValorAluguel(){
        if (getAnoFab() > 2020) {
            return getPreco() + getValorAdc();
        } else {
            return getPreco();
        }

    }

}
