/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica2;
// import java.util.Scanner;
/**
 * @author gabriel
 */
public class Pratica2 
{
    public static void main(String[] args) 
    {
       Livros obj1 = new Livros ();
       Livros obj2 = new Livros ();
       Livros obj3 = new Livros ();
       
       obj1.autor = "Zé";
       obj1.ano = 2001;
       obj1.titulo = "Maias";
       
       obj2.autor = "João";
       obj2.ano = 1998;
       obj2.titulo = "Ungaros";
       
       obj3.autor = "Gabriel";
       obj3.ano = 2010;
       obj3.titulo = "A lógica dos sem lógica";
       
       obj1.getAno();
       obj1.getAutor();
       obj1.getTitulo();
       
       obj2.getAno();
       obj2.getAutor();
       obj2.getTitulo();
       
       obj3.getAno();
       obj3.getAutor();
       obj3.getTitulo();
        /*
        int tamanho;
        
        do{
            System.out.println("Digite o tamnaho da sequencia fibonacci");
            Scanner a = new Scanner(System.in);
            tamanho = a.nextInt();
        }while(tamanho > 90 || tamanho < 3);
        
            long[] fib = new long[tamanho];        
        
            fib[0] = 1;
            fib[1] = 1;

            int cont = 0;
            while (cont < (tamanho-2))
            {
                fib[cont+2] = fib[cont] + fib[cont+1];
                System.out.println(fib[cont]+" ");
                cont++;
            }        
        */
        
        
    }
    
}
