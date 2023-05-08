package exercicio.discorde;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String comando = "";
		Discorde discorde = new Discorde();
		while (!"S".equals(comando)) {
			String linha = sc.nextLine();
			String[] campos = linha.split(" ");
			comando = campos[0];
			if ("USUARIO".equals(comando)) {
				String nome = campos[1];
				String email = campos[2];
				//Cadastrar Usuario
				discorde.cadastrarUsuario(nome, email);
				
			} else if ("CANAL".equals(comando)) {
				String canal = campos[1];
				//Cadastrar Canal
				discorde.cadastrarCanal(canal);
				
			} else if ("ENTRAR".equals(comando)) {
				String usuario = campos[1];
				String canal = campos[2];
				//Cadastrar Usuario em Canal
				discorde.entrar(usuario, canal);
				
			} else if ("MENSAGEM".equals(comando)) {
				String canal = campos[1];
				String usuario = campos[2];
				String msg = campos[3];
				//Mandar mensagem em um canal
				discorde.mandarMensagem(usuario, canal, msg);
				
			} else if ("IMPRIMIR".equals(comando)) {
				String canal = campos[1];
				//Imprimir as informações do canal
				System.out.println(discorde.imprimir(canal));
			
			} else if ("LISTARC".equals(comando)) {
				//Listar canais
				System.out.println(discorde.listarCanais());
				
				
			} else if ("SAIR".equals(comando)) {
				String canal = campos[1];
				String usuario = campos[2];
				//Excluir usuario do canal
				discorde.sair(usuario, canal);
				
			}
		}
		
	}
	
}
