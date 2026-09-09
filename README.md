# Padrão de Projeto: Factory Method (Sistema de RH)

Projeto em Java exemplificando a aplicação do padrão criacional **Factory Method** no contexto de Recursos Humanos para a disciplina DCC078-2026.3-A - Aspectos Avançados em Engenharia de Software.

## Diagrama de Classes UML

![Diagrama UML - Sistema de Benefícios](src\main\resources\diagrama.png)

## Estrutura
- `IBeneficio`: Interface comum para cálculo e cancelamento de benefícios.
- `BeneficioFactory`: Factory que instancia a classe concreta dinamicamente via reflexão e gerencia as exceções.
- `BeneficioValeRefeicao`, `BeneficioPlanoSaude`, `BeneficioValeTransporte`, `BeneficioPrevidenciaPrivada`: Classes concretas.
- `BeneficioFactoryTest`: Classe de teste para validar a factory e o tratamento de exceções.
- Classes de teste específicas para cada benefício concreto.
