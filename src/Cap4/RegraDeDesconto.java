package Cap4;

public class RegraDeDesconto {
	
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.valor = 59.90;
		
		System.out.println("Valor atual: " + livro.valor);
		
		if (!livro.aplicarDescontoDe(0.1)) {
			System.out.println("Desconto não pode ser maior que 30%");
			
		}else {
			System.out.println("Valor com desconto: " + livro.valor);
		}
			
	}

}
