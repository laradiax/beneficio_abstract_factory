package org.example;

public class BeneficioPrevidenciaPrivada implements IBeneficio {
    @Override
    public String calcular() {
        return "Cálculo da Previdência Privada realizado";
    }

    @Override
    public String cancelar() {
        return "Previdência Privada cancelada";
    }
}
