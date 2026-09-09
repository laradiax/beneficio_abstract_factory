package org.example;

public class BeneficioPlanoSaude implements IBeneficio {
    @Override
    public String calcular() {
        return "Cálculo do Plano de Saúde realizado";
    }

    @Override
    public String cancelar() {
        return "Plano de Saúde cancelado";
    }
}
