package org.example;

public class BeneficioFactory {
    public static IBeneficio obterBeneficio(String beneficio) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Beneficio" + beneficio);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Benefício inexistente");
        }
        if (!(objeto instanceof IBeneficio)) {
            throw new IllegalArgumentException("Benefício inválido");
        }
        return (IBeneficio) objeto;
    }
}
