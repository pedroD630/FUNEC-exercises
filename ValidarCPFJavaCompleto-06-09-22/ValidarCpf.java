import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ValidarCpf {
    
    public static int calculaIdade(String dataNasc, String pattern){
        DateFormat sdf = new SimpleDateFormat(pattern);
        Date dataNascInput = null;
        
        try {
            dataNascInput= sdf.parse(dataNasc);
            
        } catch (Exception e) {}
        
        Calendar dateOfBirth = new GregorianCalendar();
        dateOfBirth.setTime(dataNascInput);
        
        // Cria um objeto calendar com a data atual
        Calendar today = Calendar.getInstance();
        
        // Obtém a idade baseado no ano
        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        dateOfBirth.add(Calendar.YEAR, age);
        
        if (today.before(dateOfBirth)) {
            age--;
        }
        return age;
    }

    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
    
        //receber dados do user
        System.out.println("Digite seu nome");
        String nome = tec.nextLine();
    
        System.out.println("Digite sua data de nascimento ( use o formato: dd/MM/yyyy) :");
        String dataNasc = tec.nextLine();
        
        int idade = calculaIdade(dataNasc, "dd/MM/yyyy");
        
        System.out.print("Digite os 9 primeiros digitos do cpf: ");
        String numCpf = tec.nextLine();  //recebe o numero do cpf via teclado como string
        
        System.out.print("Digite os 2 ultimos digitos do cpf: ");
        String verificadoresCpf = tec.nextLine();

        int[] arrayCpf = new int[numCpf.length()];
        int[] somas = new int[numCpf.length()];
        //os 9 primeiros dígitos sao multiplicados pela sequência decrescente de 10 à 2
        int j = 10;
        int soma = 0;//variavel para guardar a soma
        for (int p = 0; p < 9; p++) {//RODA O ARRAY DE 9 VEZES
            //Converte para int o numero do cpf na posição p e joga para o vetor
            arrayCpf[p] = Character.getNumericValue(numCpf.charAt(p));  
            int multi = arrayCpf[p] * j; //multiplica o que tem na posiçao p * j
            j--;
            soma = soma + multi;
            somas[p] = soma;
            
            
            //System.out.print(somas[8]);
        }
        int resto1 = somas[8] % 11;
        //System.out.println(resto1);
        
        int primVerif = 11 - resto1;
        if (resto1 >= 10){
            primVerif = 0;
        }
        
        
        String numCpfOFC = numCpf + primVerif;
        //System.out.println(numCpf);
        
        j = 11;
        soma = 0;
        int[] array2Cpf = new int[numCpfOFC.length()];
        int[] somas2 = new int[numCpfOFC.length()];
        
        for (int p = 0; p < 10; p++) {//RODA O ARRAY DE 9 VEZES
        
            //Converte para int o numero do cpf na posição p e joga para o vetor
            array2Cpf[p] = Character.getNumericValue(numCpfOFC.charAt(p));  
            
            int multi = array2Cpf[p] * j; //multiplica o que tem na posiçao p * j
            j--;
            soma = soma + multi;
            somas2[p] = soma;
            
            
            //System.out.println(somas2[9]);
        }
        int resto2 = somas2[9] % 11;
        //System.out.println(resto2);
        
        int segVerif = 11 - resto2;
        if (resto2 >= 10){
            segVerif = 0;
        }
        numCpfOFC = numCpfOFC + segVerif;
        //System.out.print(numCpf);
        String cpfComp = numCpf + verificadoresCpf;
        
            System.out.println(nome);
            System.out.println("Data de nascimento: " + dataNasc + "  Idade: " + idade);
            System.out.println("CPF digitado: " + cpfComp);
            System.out.println("CPF calculado pelo sistema: " + numCpfOFC);
             //comparar o digitado com o resultado
             
            if(numCpfOFC.equals(cpfComp)){
                System.out.println("Seu CPF e valido!");
            }
            else{
                System.out.println("Seu CPF e invalido!");
            }
            
    } 
}
