import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o primeiro parametro");   
        int parametro2 = terminal.nextInt();
        try{
           contar(parametro1,parametro2); 
        }catch(ParametrosInvalidosException erro){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }  
    }
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1>parametro2){
            throw new ParametrosInvalidosException();
        }
        int resultado = parametro2 - parametro1;
        for(int i=0; i<resultado; i++){
            System.out.println("Imprimindo o numero " + (i+1));
        }
    }

}

