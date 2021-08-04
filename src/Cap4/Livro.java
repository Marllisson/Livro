package Cap4;

import Cap4.Autor;

public class Livro {
	String nome;
	String descricao;
	private double valor;
	String isbn;
	Autor autor;
	
	//Construtor Livro
	public Livro() {
		System.out.println("novo livro criado");
	}
	
	void mostrarDetalhes() {
		System.out.println("Mostra detalhes do Livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		
		System.out.println("----");
		
	}
	
	public boolean  aplicarDescontoDe(double porcentagem) {
		if (porcentagem > 0.3) {
			return false;
		}
		this.valor -= this.valor * porcentagem;
		return true;
	}
	
	boolean temAutor() {
		/*FORMA DE ESCREVER ESTE CÓDIGO MAIS COMPLEXA
		 *boolean naoEhNull = this.autor != null; 
		 *return naoEhNull; 
		 */
		
		//FORMA MAIS SIMPLIFICADA
		return this.autor != null;
	}
}
