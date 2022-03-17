package exemplo;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		String contato = in.nextLine();
		cachorro c1 = new cachorro(nome,contato);
		
		System.out.println("nome do cachorro:" + c1.nome);
		
		c1.entrar_em_contato();
		
		System.out.println("telefone de contato:" + c1.getContato());
		
		}

}
