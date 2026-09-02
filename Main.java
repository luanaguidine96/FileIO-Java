import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String le = "";
      String idade = "";
       try {
           System.out.println("Informe o nome");
          le = sc.next();
         
       } catch (Exception e) {
        System.out.println("nome inválido");
       }
            try {
             System.out.println("Informe a idade");
         idade = sc.next();
       } catch (Exception e) {
        System.out.println("idade inválida");
       }
     
       System.out.println("idade:" + idade);
       System.out.println("nome:" + le);
       sc.close();


 try {
            FileWriter arquivo = new FileWriter("nomes.txt");
            BufferedWriter escritor = new BufferedWriter(arquivo);

            escritor.write("idade: " + idade);
            escritor.newLine();

            escritor.write("nome: " + le);
            escritor.newLine();


            escritor.close();

        } catch (IOException e) {
            System.out.println("Erro ao escrever.");
        }



    }
}