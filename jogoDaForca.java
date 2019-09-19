
package trabalho.pkg1;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    
    public static Random random = new Random();

    public static void main(String[] args) {
        int i, tentativas=0;
        
        StringBuffer secretaCompara = new StringBuffer();
        StringBuffer letrasDigitadas = new StringBuffer();
        String secreta, palavraDigitada;
        char Letra;
       
        ArrayList palavraSecreta = new ArrayList(); // ArrayList foi utilizado para armazenar as palavras secretas 
        
        //Preenchendo o array
        palavraSecreta.add("cachorro");
        palavraSecreta.add("gato");
        palavraSecreta.add("jacare");
        palavraSecreta.add("girrafa");
        palavraSecreta.add("pavao");
        palavraSecreta.add("arara");
        palavraSecreta.add("peixe");
        palavraSecreta.add("elefante");
        palavraSecreta.add("macaco");
        palavraSecreta.add("coala");
        palavraSecreta.add("tubarao");
        palavraSecreta.add("garsa");
        palavraSecreta.add("camaleao");
        palavraSecreta.add("formiga");
        palavraSecreta.add("pato");
        palavraSecreta.add("veado");
        palavraSecreta.add("leao");
        palavraSecreta.add("zebra");
        palavraSecreta.add("onca");
        palavraSecreta.add("bufalo");
        
        
        secreta= (String) palavraSecreta.get(getRandomNumero(palavraSecreta));
        
        System.out.println("Bem-vindo ao jogo da forca!");
        System.out.println("-----");
        System.out.println("|   |");
        System.out.println("|    ");
        System.out.println("|          O     ");
        System.out.println("|         /|\\     ");
        System.out.println("|         / \\    ");
        
        for(i=0; i<secreta.length(); i++){
            secretaCompara.append("_");
            
        }
        System.out.println(secretaCompara);
        
        while(tentativas!=(secreta.length()/2)+1){ 
            System.out.println("Números de erros possíveis: "+((secreta.length()/2)+1));
            System.out.println("Erros: "+(tentativas));
            System.out.println("Letras já Digitadas: "+letrasDigitadas);
            System.out.println(secretaCompara);
            Scanner entrada = new Scanner(System.in);
            Letra = entrada.next().charAt(0);
            letrasDigitadas.append(Letra);
            letrasDigitadas.append(" ");
            System.out.println(secretaCompara);
            for(i=0; i<secreta.length(); i++){
                if(secreta.charAt(i)==Letra){
                    secretaCompara.setCharAt(i, Letra);   
                }
            }
            if(secreta.indexOf(Letra)==-1){
                    tentativas++;
            }
            if(secreta.equals(secretaCompara.toString())){
                System.out.println(secretaCompara);
                tentativas= (secreta.length()/2)+1;   
            }
        }
        
        if(tentativas==(secreta.length()/2)+1){
            if(secreta.equals(secretaCompara.toString())){
                System.out.println("Parabéns vc acertou a palavra !\n");
            }
            else{
                System.out.println("Você excedeu limite de tentativas ! Sabe a palavra ? Digite-a");
                Scanner entrada = new Scanner(System.in);
                palavraDigitada = entrada.next();
                if(palavraDigitada.equals(secreta)){
                    System.out.println("Parabéns vc acertou\n");
                }
                else{
                    System.out.println("Errou !!! Você perdeu ! :(");
                }
            }
        }
    }
        
    private static int getRandomNumero(ArrayList palavraSecreta) {
        
        int tmp = random.nextInt(palavraSecreta.size());
        
        return tmp;     
    }
    
}

    
