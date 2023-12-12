# Tarefa-03---Fixacao-de-Conteudo---Java
Tarefa aula de Linguagem de Programacao - Funec Riacho

Professor, eu respondi tudo num codigo que tá funcionando sem nenhum erro, mas como ficou beeeem extenso pra postar como atividade eu vou por um sumariozinho de em qual linha eu respondi cada questao. Eu usei o que eu sabia de c++ ( algumas coisas funcionam da mesma forma ) e o W3Scholls, mas poucas vezes. A atividade tá bem easy.


    1) Declare a classe pública RendaMediaFamilia;  Linha 4...
    2) Declare o método principal (ex: public static void main(String[] args){    )
 Linha 8


    3) Declare as variaveis para receber: o nome do pai, o nome da mae, o nome de dois filhos

Declaracao de Variaveis: Linha 14
Receber nomes ( o usuario insere ): Linhas: 30,31. 33, 34
Se tiver filhos( Criei uma estrutura condicional pra saber se tem filhos. Caso tenha, existe uma outra condicional verficando se e apenas 1 ou são 2) Nome dos filhos: Linhas 44,45, 97,98,100,101.
    4) Declare a idade de cada um deles e registre sua idade.

A mesma estrutura base para os nomes eu usei aqui: Linhas 16, 57,58, 60,61,63,64, 124-134, 174-178.
    5) Declare o salario de cada um deles.

Linhas 67-74, 138-148, 181--186
    6) Some o salario de todos da familia e faça a média de quantidade de salarios da familia.

Linhas 83-86, 157-160. 196 e 197.
    7) Declare se são ou não estudantes (boolean). Linha 20

       
    8) Imprima na tela utilizando varias informações em uma mesma linha:
        a. Os nomes,
        b. Idades,
        c. Se sao estudantes ou não.
        d. A média salarial da familia. 

Usei esse codigo e algo parecido em todas as alternativas, tendo ou não filhos, obviamente com algumas mudancas.

System.out.printf("Nome: %s, Idade: %d, Salario: %f   ", nomePai, idadePai, salarioPai );
                System.out.printf("Nome: %s, Idade: %d, Salario: %f   ", nomeMae, idadeMae, salarioMae );
                System.out.printf("Nome: %s, Idade: %d, Salario: %f, Estuda? %B   ", nomeFilho1, idadeFilho1, salarioFilho1, estudante1 );
                System.out.printf("Nome: %s, Idade: %d, Salario: %f, Estuda? %B   ", nomeFilho2, idadeFilho2, salarioFilho2, estudante2 );


                System.out.println("A media salarial da familia e:  " + mediaSalario);
    
Lembre-se de declarar logo no inicio do método principal:
    a) A classe Scanner, com instancia: ex: Scanner sc = new Scanner(System.in); linha 10...
    b) Declarar as variaveis necessárias, com nomes que identificam os conteudos das variaveis.
Linhas 14, 16, 18 e 20

CODIGO (RECOMENDO QUE ABRA EM UMA IDE SE PREFERIR OU FOR AVALIAR)
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------_________________________________________________________________________________________________________________________________________________________
import java.util.Scanner;

//Declare a classe pública RendaMediaFamilia
public class RendaMediaFamilia {

    
    //Declare o método principal
    public static void main(String[] args){
        
        Scanner tec = new Scanner(System.in);


        //Declare as variaveis para receber: o nome do pai, o nome da mae, o nome de dois filhos
        String nomePai, nomeMae, nomeFilho1, nomeFilho2;
        //Declare a idade de cada um deles e registre sua idade.
        int idadePai, idadeFilho1, idadeFilho2, idadeMae, filho1Estuda, filho2Estuda;
        //Declarar salarios
        double salarioPai, salarioMae, salarioFilho1, salarioFilho2, mediaSalario;
        
        boolean estudante1, estudante2;



        System.out.println("Prezado cliente, para concluir seu cadastro precisamos das seguintes informacoes: ");
        System.out.println("Qual o nome do pai/responsavel ? ");
        nomePai = tec.nextLine();

        //Definir se o nome e valido ou nao

        System.out.println("Qual o nome da mae/responsavel? ");
        nomeMae = tec.nextLine();

        System.out.println("Possui filhos(as)? Responda 0 para NAO e 1 para SIM: ");
        int temFilhos = tec.nextInt();

        if (temFilhos == 1 ){
            System.out.println("Quantos sao? OBS: por problemas tecnicos e possivel registrar APENAS 2 no momento.");
            int numFilhos = tec.nextInt();

            if (numFilhos == 1){


                System.out.println("Possui um(a) filho(a).");
                System.out.println("Qual o nome do(a) seu filho(a)?");
                nomeFilho1 = tec.nextLine();

                System.out.println("Seu filho(a) e estudante? Responda 0 para NAO e 1 para SIM: ");
                filho1Estuda = tec.nextInt();

                if (filho1Estuda == 1){
                    estudante1 = true;
                
                }else{
                estudante1 = false;
                }

                System.out.println("Qual a idade do Pai? ");
                idadePai = tec.nextInt();

                System.out.println("Qual a idade da mae? ");
                idadeMae = tec.nextInt();

                System.out.println("Qual a idade do(a) filho(a)? ");
                idadeFilho1 = tec.nextInt();

                //descobrir o salario de cada um
                System.out.println("Qual o salario do pai? ");
                salarioPai = tec.nextDouble();

                System.out.println("Qual o salario da mae? ");
                salarioMae = tec.nextDouble();

                System.out.println("Qual o salario do(a) filho(a) ? ");
                salarioFilho1 = tec.nextDouble();

                //Some o salario de todos da familia e faça a média de quantidade de salarios da familia.
                System.out.println("A media salarial da sua familia sera gerada. ");
                mediaSalario = (salarioPai + salarioFilho1 + salarioMae) / 3;

                //Imprima na tela.


                System.out.printf("Nome: %s, Idade: %d, Salario: %f   ", nomePai, idadePai, salarioPai );
                System.out.printf("Nome: %s, Idade: %d, Salario: %f   ", nomeMae, idadeMae, salarioMae );
                System.out.printf("Nome: %s, Idade: %d, Salario: %f, Estuda? %B   ", nomeFilho1, idadeFilho1, salarioFilho1, estudante1 );
                System.out.println("A media salaria da familia e:  " + mediaSalario);







            }else if (numFilhos == 2){

                System.out.println("Possui dois/duas filhos(as).");
                System.out.println("Qual o nome do(a) seu primeiro(a) filho(a)?");
                nomeFilho1 = tec.nextLine();

                System.out.println("Qual o nome do(a) seu segundo(a) filho(a)?");
                nomeFilho2 = tec.nextLine();


                System.out.println("Seu 1 filho(a) e estudante? Responda 0 para NAO e 1 para SIM: ");
                filho1Estuda = tec.nextInt();

                if (filho1Estuda == 1){
                    estudante1 = true;
                
                }else{
                estudante1 = false;
                }

                System.out.println("Seu 2 filho(a) e estudante? Responda 0 para NAO e 1 para SIM: ");
                filho2Estuda = tec.nextInt();

                if (filho2Estuda == 1){
                    estudante2 = true;
                
                }else{
                estudante2 = false;
                }

                System.out.println("Qual a idade do Pai? ");
                idadePai = tec.nextInt();

                System.out.println("Qual a idade da mae? ");
                idadeMae = tec.nextInt();

                System.out.println("Qual a idade do(a) 1 filho(a)? ");
                idadeFilho1 = tec.nextInt();

                System.out.println("Qual a idade do(a) 2 filho(a)? ");
                idadeFilho2 = tec.nextInt();


                //descobrir o salario de cada um
                System.out.println("Qual o salario do pai? ");
                salarioPai = tec.nextDouble();

                System.out.println("Qual o salario da mae? ");
                salarioMae = tec.nextDouble();

                System.out.println("Qual o salario do(a) 1 filho(a) ? ");
                salarioFilho1 = tec.nextDouble();

                System.out.println("Qual o salario do(a) 2 filho(a) ? ");
                salarioFilho2 = tec.nextDouble();

                //Some o salario de todos da familia e faça a média de quantidade de salarios da familia.
                System.out.println("A media salarial da sua familia sera gerada. ");
                mediaSalario = (salarioPai + salarioFilho1 + salarioMae + salarioFilho2) / 4;

                //Imprima na tela.


                System.out.printf("Nome: %s, Idade: %d, Salario: %f   ", nomePai, idadePai, salarioPai );
                System.out.printf("Nome: %s, Idade: %d, Salario: %f   ", nomeMae, idadeMae, salarioMae );
                System.out.printf("Nome: %s, Idade: %d, Salario: %f, Estuda? %B   ", nomeFilho1, idadeFilho1, salarioFilho1, estudante1 );
                System.out.printf("Nome: %s, Idade: %d, Salario: %f, Estuda? %B   ", nomeFilho2, idadeFilho2, salarioFilho2, estudante2 );


                System.out.println("A media salarial da familia e:  " + mediaSalario);



            }
            
    


        } 
        else {
            System.out.println("Qual a idade do seu pai? ");
            int idade1 = tec.nextInt();

            System.out.println("Qual a idade da sua mae? ");
            int idade2 = tec.nextInt();


            //descobrir o salario de cada um
            System.out.println("Qual o salario do pai ?");
            double salario1 = tec.nextDouble();

            System.out.println("Qual o salario da mae? ");
            double salario2 = tec.nextDouble();


            //Some o salario de todos da familia e faça a média de quantidade de salarios da familia.
            System.out.println("A media salarial da sua familia sera gerada. ");
            mediaSalario = (salario1 + salario2 ) / 2;

            //Imprima na tela.


            System.out.printf("Nome: %s, Idade: %d, Salario: %f    ", nomePai, idade1, salario1 );
            System.out.printf("Nome: %s, Idade: %d, Salario: %f    ", nomeMae, idade2, salario2 );
            


            System.out.println("A media salarial da familia e:  " + mediaSalario);
        }

    }
}
