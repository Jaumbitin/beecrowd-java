# Beecrowd em Java

Soluções de exercícios do beecrowd para praticar lógica de programação, entrada e saída, estruturas de repetição e algoritmos em Java.

## Conteúdo

A versão atual reúne **30 soluções independentes**. Cada pasta começa com o número do problema e contém seu próprio arquivo `Main.java`. Há exercícios de cálculos básicos, conversão de unidades, condicionais, repetição, strings e números racionais.

## Executar uma solução

Pré-requisito: um JDK com os comandos `javac` e `java` disponíveis. Não há um projeto Maven ou Gradle compartilhado.

```powershell
git clone https://github.com/Jaumbitin/beecrowd-java.git
cd beecrowd-java
cd '1001 - Extremamente Básico'
javac -encoding UTF-8 Main.java
java Main
```

Informe a entrada pelo terminal conforme o exercício. Compile somente a solução escolhida: várias pastas declaram a mesma classe `Main`.

## Observação para Windows

A pasta do exercício 1002 está versionada como `1002 - Área do Círculo `, com um espaço final. Esse nome impede o checkout normal no Windows. Enquanto a pasta não for renomeada no Git, use o GitHub para baixar a solução individual ou clone em um sistema de arquivos compatível. A limitação afeta o clone completo mostrado acima.

## Organização

- Pastas numeradas: código de cada exercício.
- `.gitignore`: exclusão de arquivos gerados e configurações locais.
- `README.md`: orientação de uso.

## Validação

Não há suíte automatizada no repositório. Compare a saída com os exemplos de cada enunciado e envie a solução ao juiz do beecrowd. A presença do arquivo aqui não comprova aprovação no juiz.
