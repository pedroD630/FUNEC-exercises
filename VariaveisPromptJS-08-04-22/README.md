# Task3-JavaScript
Tarefa de Fixacao de conteudo N3 - Funec Riacho



1) Relacione as diferenças ou similaridades dos seguintes tipos de variáveis.
Defina a razão porque se deve utilizar LET ao invés de VAR – Pesquise na Internet.

let permite declarar variáveis   que estão limitadas a uma instrução ou expressão na qual ela é usada,
diferentemente da palavra-chave var, que declara uma variável globalmente ou localmente para uma
função inteira, e o mesmo nome de uma variável pode se repetir várias vezes, causando muitos “bugs”.



2) Defina a funcionalidade do uso da declação “use strict”. Dê suas características de uso.

"use strict";Define que o código JavaScript deve ser executado em "modo estrito". Com o modo
estrito, você não pode, por exemplo, usar variáveis   não declaradas. O modo estrito torna mais
fácil escrever JavaScript "seguro". Além disso,  a exclusão de uma variável (ou objeto) não é
permitida, entre outras funções.



3) Converta as seguintes variáveis para o tipo pedido:
var alunoAtivo = false converter para  String
let alunoAtivo = “false”;
var cpf = 333.444.555-66
converter para  número:
let cpf = 33344455566;
var idadeCidadao = 65
converter para  String: let idadeCidadao = ‘65’;

4) Pesquise e explique o que é o fenômeno do “hoisting”.
Hoisting em JavaScript e usar uma variável antes de ser declarada, a linguagem aceita isso e não
causará erros.

5) Quais são os critérios para dar nomes a variáveis e métodos em javaScript
O nome deve começar com apenas letras. Não deve começar com dígitos e símbolos. É possível
utilizar $ e _ para grafar nomes.

6) Analise a situação abaixo:
Paulo é um programador. Ele trabalha em uma empresa junto com outros programadores e como Paulo
não é muito cuidadoso, ele fez um programa em javaScript e depois de algumas depurações, saiu de
férias.
Seu colega substituto, ao acessar seu código reclamou ao seu superior as seguintes dificuldades:
a) a formatação do código estava irregular e não obedecia à hierarquia de  blocos, além do quê isso
dificultava no entendimento imediato do código.
b) havia erros de variáveis que deveriam se comportar como números e estavam se comportando como
texto ou strings.
c) havia segmentos de códigos misturados, cujas funcionalidades se confundiam com os códigos de
outras funcionalidades.
d) algumas variáveis não estavam sendo aceitas pela "debbuging", gerando como relatório de erro de
depuração, os nomes das variáveis definidos de forma incorreta e com utilização de nomes internos da
linguagem.
e) Por fim, não se conseguia entender bem as funcionalidades de determinadas áreas do programa
feito.
Explique quais deveriam ser as providências que o programador Paulo deveria ter tomado para que seu
código fosse bem aceito por seu substituto.

Paulo deveria ter começado separando cada coisa a ser feita pelo programa em funções, ou métodos,
específicos, o que facilitaria a entender a formatação e impediria que os seguimentos do código se
misturassem.
Também deveria tomar cuidado ao declarar valores a uma variável. Paulo provavelmente colocou “” em
volta de números transformando-os em strings.
Tomar cuidado com as regras de nomenclatura de variáveis e usar boas práticas, como camelCase.


7) Declaração de variáveis:
a. Declare uma variável de texto que receberá o cep do endereço de um aluno
let cepAluno;
b. Declare uma variavel que receba o número de pessoas na casa de um aluno.
let pessoasCasa;
c. Declare uma variavel que receba o valor do último imposto de renda declarado pelo pai
de um aluno.
let valorIR;
d. Declare a situação de um aluno se ele é especial (inclusão) ou não. (Inicialize a variável)
let alunoInclusao = false;
e. Declare uma variável que receba os dados de data de aniversário do aluno. (Inicialize a
variável com o primeiro dia do ano corrente
let dataAniversario;
f. Declare uma variável que receba a altura do aluno.
var alturaAluno;
g. Declare uma variável que receba o número de disciplinas em que o aluno ficou em
dependência.
let disciplinasRecuperacao;


8) Sabendo que JavaScript é uma linguagem flexível, faça declaração do comando que descubra o
tipo de cada uma das variáveis declaradas acima.

Você pode usar o comando typeof para localizar o tipo de dados de uma variável JavaScript.
Funciona pra todas elas mas como exemplo:
var alturaAluno = 1.75;
typeof alturaAluno; // retorna number
typeof alunoInclusao; //retorna boolean


9) Dê a função e característica de funcionamento dos seguintes tipos saída definidos em
programação JavaScript
a. Alert - Uma caixa de alerta é frequentemente usada se você quiser garantir que as
informações cheguem ao usuário. Quando uma caixa de alerta aparecer, o usuário terá
que clicar em "OK" para prosseguir.
b. Prompt
Uma caixa de prompt geralmente é usada se você quiser que o usuário insira um valor
antes de entrar em uma página. o usuário terá que clicar em "OK" ou "Cancelar" para
continuar depois de inserir um valor de entrada. Se o usuário clicar em "OK" a caixa
retornará o valor de entrada. Se o usuário clicar em "Cancelar" a caixa retornará null.
c. Confirm - O usuário deve verificar ou confirmar algo. Se o usuário clicar em "OK", a caixa
retornará verdadeiro. Se o usuário clicar em "Cancelar", a caixa retornará false.
d. Document.write - Escreve algum texto diretamente na saída HTML. Exclui todo o HTML
existente quando usado em um documento carregado.
e. Console.log - Chamado no navegador e exibe dados do console.


10) Crie uma página abaixo que solicite o nome do aluno e depois o nome da disciplina de
programação web e dê a saída em formato de caixa de diálogo.

A parte de JavaScript é essa. Fiz o HTML básico só pra rodar mesmo.

<script>
var nomeAluno = prompt("Digite o nome do aluno: ");
var nomeDisciplina = prompt("Qual o nome da disciplina? ");
document.write("O nome do aluno e: ", nomeAluno);
document.write("      O aluno cursa: ", nomeDisciplina);
</script>
