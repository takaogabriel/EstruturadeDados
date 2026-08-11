import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        ArrayList<Pessoa>listaP = new ArrayList<Pessoa>();

        Pessoa obj1 = new Pessoa("Gabriel",24);
        Pessoa obj2 = new Pessoa();
        Pessoa obj3 = new Pessoa();
        //Pessoa obj3;

        System.out.println("Nome: " + obj1.getNome());
        System.out.println("Idade: " + obj1.getIdade());

        System.out.println("Digite o nome: ");
        //String nome = input.nextLine();
        obj3.setNome(input.nextLine());

        System.out.println("Digite a idade: ");
        //int idade = input.nextInt();
        obj3.setIdade(input.nextInt());

        //obj3 = new Pessoa (nome, idade);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
        
        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);

        for(Pessoa auxPessoa: listaP){
            System.out.println(axuPessoa.toString());
        }

        listaP.get(1).setNome("João");
        listaP.get(1).setIdade("20");
        System.out.println(listaP.get(1));

        System.out.println(obj2.toString());

        //git add . (deixa os arquivos prontos para subir)
        //git status (verifica o status dos arquivos)
        //git commit -m "Nome dado" (Nomeia o commit e deixa apto para subir)
        //git push origin main (Sobe os arquivos para o github)

    }   
}