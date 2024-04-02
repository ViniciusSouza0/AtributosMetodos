package com.mycompany.metodosefuncoesobjeto;
import java.util.Locale;
import java.util.Scanner;
public class Caneta1 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Scanner STRING = new Scanner (System.in);
        Scanner INT = new Scanner (System.in);
        Scanner DOUBLE = new Scanner (System.in);
        
        
        System.out.printf("Digite a marca da 1º caneta: ");
        String marcaC1 = STRING.nextLine();
        System.out.printf("\nDigite a cor da 1º caneta: ");
        String corC1 = STRING.nextLine();
        System.out.printf("\nDigite a espessura da 1º caneta: ");
        double pontaC1 = DOUBLE.nextDouble();
        System.out.printf("\nDigite a carga da 1º caneta: ");
        int cargaC1 = INT.nextInt();
        
      
        Caneta0 c1 = new Caneta0();
        
        c1.marca = marcaC1;
        c1.cor = corC1;
        c1.ponta = pontaC1;
        c1.carga = cargaC1;
        
        boolean respostaTampada = c1.perguntaTampada();
        c1.tampada = respostaTampada;
        c1.estado();
        c1.escrever();
        
        /*Classe c2 = new Classe();
        c2.marca = "Bic";
        c2.ponta = 7.4;
        c2.cor = "Preta";
        c2.tampada = false;
        c2.carga = 1;
        c2.destampar();
        c2.estado();
        c2.escrever();*/
           
}
}

    
    
    
    

