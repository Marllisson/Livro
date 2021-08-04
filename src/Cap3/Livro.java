package Cap3;


public class Livro {
	String nome;
	String descricao;
	double valor;
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
	
	public void aplicarDescontoDe(double porcentagem) {
		this.valor -= this.valor * porcentagem;
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
