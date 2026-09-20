# Padrão de Projeto: Factory Method (Sistema de RH)

Projeto em Java exemplificando a aplicação do padrão criacional **Abstract Factory** no contexto de Recursos Humanos para a disciplina DCC078-2026.3-A - Aspectos Avançados em Engenharia de Software.

## Diagrama de Classes UML

![Diagrama UML - Sistema de Benefícios](src\main\resources\diagrama.png)

## Estrutura
- `IBeneficio`: Interface comum para cálculo e cancelamento de benefícios.
- `BeneficioFactory`: Abstract Factory responsável pela criação das famílias de benefícios.
- `BeneficioCLTFactory`, `BeneficioPJFactory`: Responsáveis pela criação dos benefícios de cada família.
- `BeneficioValeRefeicao`, `BeneficioPlanoSaude`, `BeneficioValeTransporte`, `BeneficioPrevidenciaPrivada`: Produtos concretos.
- `BeneficioFactoryTest`: Classe de teste para validar a criação das famiílias e o tratamento de exceções.
- Classes de teste específicas para cada benefício concreto.