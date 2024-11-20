# Desafio Banco Digital

Um projeto Java para simular operações bancárias básicas, utilizando os princípios de **Programação Orientada a Objetos** (POO) como abstração, encapsulamento, herança e polimorfismo.

## 📋 Descrição

O **Desafio Banco Digital** é uma aplicação simples desenvolvida para reforçar conceitos fundamentais de POO. O sistema permite criar contas bancárias (corrente e poupança), realizar operações como saques, depósitos, transferências e consultar extratos.

## 🚀 Funcionalidades

- **Criar contas**: Conta Corrente e Conta Poupança.
- **Operações bancárias**:
    - Saque
    - Depósito
    - Transferência entre contas
- **Consulta de extratos**: Visualize o saldo e as informações básicas.

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **JDK 11+**: Recomendado para execução.
- **IDE**: IntelliJ IDEA, Eclipse ou qualquer IDE compatível com Java.

## 📂 Estrutura do Projeto

```plaintext
DesafioBancoDigital/
├── src/
│   ├── interfaces/
│   │   └── IConta.java        # Interface que define as operações bancárias
│   ├── models/
│   │   ├── Banco.java         # Representa o banco, gerencia contas
│   │   ├── Cliente.java       # Representa o cliente do banco
│   │   ├── Conta.java         # Classe abstrata para contas
│   │   ├── ContaCorrente.java # Implementação de Conta Corrente
│   │   └── ContaPoupanca.java # Implementação de Conta Poupança
│   └── Main.java              # Classe principal para executar o projeto
└── README.md
```

## ⚙️ Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/Gabzk/DesafioBancoDigital.git
   cd DesafioBancoDigital
   ```

2. **Importe o projeto em sua IDE**:
    - Abra sua IDE preferida (IntelliJ IDEA, Eclipse, etc.).
    - Importe o projeto como um projeto **Java**.

3. **Compile e execute**:
    - Certifique-se de que o arquivo `Main.java` seja configurado como o ponto de entrada.
    - Execute o projeto e interaja com o sistema.

## 📝 Exemplo de Uso

Aqui está um exemplo simples de como criar contas e realizar operações:

```java
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("Gabriel", "001.002.003-04");
        Cliente cliente2 = new Cliente("Ana", "987.654.321-00");

        Conta conta1 = new ContaCorrente(cliente1);
        Conta conta2 = new ContaPoupanca(cliente2);

        banco.adicionarConta(conta1, conta2);

        conta1.depositar(500);
        conta1.transferir(200, conta2);
        conta2.imprimirExtrato();
        conta1.imprimirExtrato();
    }
}
```

## 📌 Objetivos de Aprendizado

- Implementar conceitos de POO (herança, polimorfismo, abstração).
- Trabalhar com **interfaces** para padronizar comportamentos.
- Reforçar boas práticas de desenvolvimento em Java.

## 🤝 Contribuições

Contribuições são bem-vindas! Siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma branch para a funcionalidade ou correção:
   ```bash
   git checkout -b feature/nova-funcionalidade
   ```
3. Faça um commit das suas alterações:
   ```bash
   git commit -m "Adiciona nova funcionalidade X"
   ```
4. Envie suas alterações:
   ```bash
   git push origin feature/nova-funcionalidade
   ```
5. Abra um Pull Request.

## 🧑‍💻 Autor

Desenvolvido por [Gabriel](https://github.com/Gabzk).

