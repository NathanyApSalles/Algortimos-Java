# Algortimos-Java
Algoritmos aleatórios em JAVA
Algoritmo que determina se duas strings são permutação uma da outra. Primeiro passo é verificar se as duas strings possuem o mesmo tamanho, caso contrário, não são permutação uma da outra. Se possuem o mesmo tamanho, cria-se duas tabelas hash, uma para cada string, onde o valor da chave será o caracter inserido e o valor será a frequência com que ele aparece na string. Faça um laço que percorre até o tamanho de uma das strings(já que as duas possuem o mesmo tamanho), dado uma chave (caracter), verifica se ele já está na tabela hash que corresponde a string, se sim, incremento em 1 o valor que a chave possui, se não, acrescento a chave com o valor 1. Por fim, faça um busca para verificar se as duas tabelas hash possuem o mesmo valor dado a chave.
Custo para inserir e buscar na tabela hash é O(1). O algoritmo utiliza um laço para inserção e um laço para a busca,
portanto o custo será na ordem de O(n).
