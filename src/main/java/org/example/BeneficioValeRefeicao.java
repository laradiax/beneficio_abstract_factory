package org.example;

public class BeneficioValeRefeicao implements IBeneficio{
    @Override
    public String calcular() {
        return "Cálculo do Vale Refeição realizado";
    }

    @Override
    public String cancelar() {
        return "Vale Refeição cancelado";
    }
}
