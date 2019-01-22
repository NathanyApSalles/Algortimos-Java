# Algortimos-Java

REORDER FILE
Algoritmo que reordena as linhas de um arquivo de forma que as linhas cujo número é um número de Fibonacci apareçam primeiro e depois são exibidas as linhas restantes.

STRING PERMUTATION
Algoritmo que determina se duas strings são permutação uma da outra. Primeiro passo é verificar se as duas strings possuem o mesmo tamanho, caso contrário, não são permutação uma da outra. Se possuem o mesmo tamanho, cria-se duas tabelas hash, uma para cada string, onde o valor da chave será o caracter inserido e o valor será a frequência com que ele aparece na string. Faça um laço que percorre até o tamanho de uma das strings(já que as duas possuem o mesmo tamanho), dado uma chave (caracter), verifica se ele já está na tabela hash que corresponde a string, se sim, incremento em 1 o valor que a chave possui, se não, acrescento a chave com o valor 1. Por fim, faça um busca para verificar se as duas tabelas hash possuem o mesmo valor dado a chave.
Custo para inserir e buscar na tabela hash é O(1). O algoritmo utiliza um laço para inserção e um laço para a busca,
portanto o custo será na ordem de O(n).

CRIPTOGRAFIA


Solicitaram para que você construisse um programa simples de criptografia. Este programa deve possibilitar enviar mensagens codificadas sem que alguém consiga lê-las. O processo é muito simples. São feitas três passadas em todo o texto.
Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas devem ser deslocadas 3 posições para a direita, segundo a tabela ASCII: letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente. Na segunda passada, a linha deverá ser invertida. Na terceira e última passada, todo e qualquer caractere a partir da metade em diante (truncada) devem ser deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'. Por exemplo, se a entrada for “Texto #3”, o primeiro processamento sobre esta entrada deverá produzir “Wh{wr #3”. O resultado do segundo processamento inverte os caracteres e produz “3# rw{hW”. Por último, com o deslocamento dos caracteres da metade em diante, o resultado final deve ser “3# rvzgV”.
Entrada: A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de linhas que o problema deve tratar. As N linhas contém cada uma delas M (1 ≤ M ≤ 1*103) caracteres.
Saída: Para cada entrada, deve-se apresentar a mensagem criptografada.
