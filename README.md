## Trabalho Prático de Teste Baseado em Especificação e Teste Estrutural

## Introdução

 - Este documento detalha o processo de aplicação de teste baseado em especificação e teste estrutural no método leftPad(), que realiza o preenchimento à esquerda de uma string usando outra string. O objetivo deste relatório é apresentar a análise do método, os casos de teste desenvolvidos, a cobertura de código atingida e quaisquer problemas encontrados durante a execução.

## Passo 2 - Explorar o funcionamento do programa

O método foi analisado com base em diversos cenários de entrada e saída esperadas:

Inicialmente, foi testado um caso bem-sucedido, onde str recebeu o valor "dtr", size foi definido como 6 e padStr foi "esq";

<(str="dtr", size= 6, padStr="esq"), ("esqdrt")>

Em seguida, foi testado o preenchimento à esquerda com um único caractere, e um size maior que o comprimento de str. Neste caso, str foi "dtr", size foi 6 e padStr foi ".";

<(str="drt", size= 6, padStr="."), ("...drt")>

Para um terceiro cenário, padStr foi definido com uma string maior que o espaço restante em size. Foram utilizados os valores str="def", size=5 e padStr="abc";

<(str="def", size= 5, padStr="abc"), ("abdef")>

## Passo 3 - Identificar as partições

Análise por parâmetro

Parâmetro str:

str com valor null;

str vazia;

len(str) >= 0.

Parâmetro size:

size == 0;

size < 0;

size > 0.

Parâmetro padStr:

padStr com valor null;

padStr vazia;

len(padStr) >= 0.

Combinações de entradas

str é null, size é um número inteiro, padStr é null;

str é null, size é um número inteiro, padStr é uma string vazia;

str é null, size é um número inteiro, padStr tem uma string;

str vazia, size igual a 0 ou maior que 0, padStr com diferentes valores;

str com comprimento maior que 1, size igual a 0 ou maior que 0, padStr com diferentes valores.

Saídas esperadas

Retornar null para casos específicos;

Retornar a string original quando não há necessidade de preenchimento;

Retornar uma string preenchida à esquerda.

## Passo 4 - Identificar os valores limite

Foram testados erros relacionados a limites de entrada considerando os valores mínimos e máximos possíveis para cada parâmetro. Exemplos:

size suporta espaço suficiente para padStr;

size não comporta o espaço necessário para padStr.

## Passo 5 - Derivar os casos de teste

T01: str == null

T02: str vazia

T03: padStr == null

T04: padStr vazia

T05: len(str) >= 1 e len(padStr) >= 1

T06: size < 0

T07: size > 1

T08: size == 0

T09: size == len(str)

T10: size == len(padStr)

T11: size == len(str) + len(padStr)

T12: size com um valor "extremo"

T13: padStr com caracteres especiais

## Passo 6 - Automatizar os casos de teste usando JUnit

Os testes foram implementados e executados utilizando a ferramenta Maven, com o comando:

mvn clean test

A suíte de testes foi verificada e validada, garantindo que todos os casos executados retornassem os resultados esperados.

## Passo 7 - Aumentar a suíte de testes por meio de experiência e criatividade

Caso adicional identificado:

T14: padStr com valor de \n

## Implementando Teste Estrutural

 - Passo 3 - Cobertura de código produzido pelo Jacoco

A cobertura de código foi analisada usando Jacoco. No entanto, houve dificuldades técnicas para capturar essas informações detalhadamente.

- Passo 4 - Casos de teste criados a partir da utilização do critério MC/DC

Foi analisada a condição if(padStr == null || padStr.isEmpty()) e a tabela verdade para a combinação genérica A || B foi utilizada para derivar os testes necessários.

N+1 = 3

## Cobertura de código produzido pelo Jacoco após adicionados os testes criados usando MC/DC

Os novos testes foram implementados e a validação completa de cobertura foi realizada com sucesso. O Jacoco confirmou que a cobertura para os critérios aplicados foi atingida.

## Autor: Ricardo de Paula Xavier
