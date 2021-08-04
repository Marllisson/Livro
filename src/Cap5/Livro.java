package Cap5;

public class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	
	//Construtor Livro
	/*	
	 * public Livro() {
	 *		System.out.println("novo livro criado");
	 *	}
	*/
	public Livro () {
		this.isbn = "000-00-00000-00-0";
	}
	
	public Livro(Autor autor) {
		this();
		this.autor = autor;
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
		if (porcentagem > 0.3) {
			System.out.println("Desconto não pode ser maior do que 30%");
		}
		this.setValor() -= this.getValor() * porcentagem;
		
		
	}
	
	boolean temAutor() {
		/*FORMA DE ESCREVER ESTE CÓDIGO MAIS COMPLEXA
		 *boolean naoEhNull = this.autor != null; 
		 *return naoEhNull; 
		 */
		
		//FORMA MAIS SIMPLIFICADA
		return this.autor != null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
