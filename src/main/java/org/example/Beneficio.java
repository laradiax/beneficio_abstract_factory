package org.example;

public class Beneficio {

    private final BeneficioFactory factory;

    public Beneficio(BeneficioFactory factory) {
        this.factory = factory;
    }

    public String calcularValeRefeicao() {
        return factory.criarValeRefeicao().calcular();
    }

    public String cancelarValeRefeicao() {
        return factory.criarValeRefeicao().cancelar();
    }

    public String calcularPlanoSaude() {
        return factory.criarPlanoSaude().calcular();
    }

    public String cancelarPlanoSaude() {
        return factory.criarPlanoSaude().cancelar();
    }

    public String calcularValeTransporte() {
        return factory.criarValeTransporte().calcular();
    }

    public String cancelarValeTransporte() {
        return factory.criarValeTransporte().cancelar();
    }

    public String calcularPrevidenciaPrivada() {
        return factory.criarPrevidenciaPrivada().calcular();
    }

    public String cancelarPrevidenciaPrivada() {
        return factory.criarPrevidenciaPrivada().cancelar();
    }
}