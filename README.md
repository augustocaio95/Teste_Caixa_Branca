# Teste_Caixa_Branca
Exercício individual - Tema: Testes Caixa Branca

# A DOCUMENTAÇÃO FOI DESCRITA NO CÓDIGO?
* O código não possui comentários, isso dificulta a compreensão do que cada parte do código faz. Isso pode levar a interpretações erradas e dificultar a manutenção do código no futuro.
* É ideal adicionar comentários que expliquem o funcionamento de cada método, variável etc. Isso tornará o código mais legível e facil de se mexer.

# AS VARIÁVEIS E CONSTANTES POSSUEM BOA NOMENCLATURA?
* As variáveis e constantes no código possuem nomes descritivos que facilitam o entendimento de seu funcionamento mas algumas variáveis e constantes podem ser melhorada. Por exemplo, em vez de nome e result, nomes mais descritivos como nomeUsuario e autenticado poderiam ser usados para melhorar a compreensão do código.

#  EXISTEM LEGIBILIDADE E ORGANIZAÇÃO NO CÓDIGO?
* O código está bem formatado com indentação adequada e separação de blocos, o que facilita a leitura e a compreensão. Isso é um ponto positivo, pois torna o código mais organizado e visualmente agradável.

# TODOS OS NULLPOINTERS FORAM TRATADOS?
* O código não possui tratamento explícito para exceções do tipo NullPointerException. Isso significa que se uma variável nula for utilizada em uma operação, o programa poderá falhar de forma inesperada.
* É importante adicionar blocos try-catch para capturar exceções NullPointerException e lidar com elas de forma adequada. Isso tornará o código mais robusto e confiável.

# AS CONEXÕES UTILIZADAS FORAM FECHADAS?
* O código não possui código para fechar a conexão com o banco de dados após a utilização. Isso pode levar a problemas de vazamento de recursos e instabilidade na aplicação.

# Outros erros identificados
* O código não verifica se o usuário digitou a senha correta. Se a senha estiver incorreta, o código apenas informa que o usuário não foi encontrado, o que pode ser confuso para o usuário.
* O código não valida as entradas do usuário (login e senha). Isso significa que o usuário pode digitar caracteres inválidos.


# Grafo de Fluxo
![fluxo](https://github.com/augustocaio95/Teste_Caixa_Branca/assets/124223509/14dbfc13-85e1-499a-b16b-4dc9743303ff)

# Cálculo da complexidade ciclomática

V(G) = complexidade ciclomática
E = número de arestas no grafo
N = número de nós no grafo
P = número de componentes conexos (1 para um único grafo)

V(G) = E - N + 2P

Número de nós (N): 10 (Ponto de entrada, Pontos 2, 3, 4, 5, 6, 7, 8, 9, 10)
Número de arestas (E): 16 (cada ponto está conectado diretamente ao próximo ponto, exceto o ponto de entrada)
Número de componentes conexos (P): 1 (pois o grafo é único e não possui componentes separados)

V(G) = 16 - 10 + 2(1) = 6

# Possiveis sequências

Conexão bem-sucedida e verificação do usuário (Sucesso):
* Conexão bem-sucedida e verificação do usuário (Sucesso):
1. 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
* Conexão bem-sucedida e falha na verificação do usuário:   
2. 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 10
* Conexão bem-sucedida e falha na execução da consulta SQL  
3. 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 9 -> 10
* Conexão bem-sucedida, consulta SQL não executada e verificação do usuário  
4. 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 8 -> 10
* Conexão bem-sucedida, consulta SQL não executada e falha na verificação do usuário
5. 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 8 -> 9 -> 10
* Conexão bem-sucedida, verificação do usuário e consulta SQL não executada  
6. 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 10
* Conexão bem-sucedida, verificação do usuário e falha na execução da consulta SQL  
7. 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 9 -> 10
* Conexão bem-sucedida, consulta SQL não executada e falha na verificação do usuário  
8. 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 8 -> 7 -> 10
* Conexão bem-sucedida, consulta SQL não executada e verificação do usuário  
9. 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 8 -> 9 -> 10
* Conexão bem-sucedida, consulta SQL não executada e verificação do usuário  
10. 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 8 -> 10
