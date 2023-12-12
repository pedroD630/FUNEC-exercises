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