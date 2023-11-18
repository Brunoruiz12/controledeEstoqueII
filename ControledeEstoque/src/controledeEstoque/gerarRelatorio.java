package controledeEstoque;

public class gerarRelatorio {
	
	public void gerarRelatorio(Produtos estoque) {
	    System.out.println("Relatorio de Estoque "); 
	    System.out.println("Camisas " + estoque.camisas + " unidades ");
	    System.out.println("Calcas " + estoque.calcas + " unidade ");
	    System.out.println("Saias " + estoque.saias + " unidade ");
	    System.out.println("Vestidos " + estoque.vestidos + " unidade ");
	    System.out.println("Calcados " + estoque.calcados + " unidade ");
	    int totalEstoque = estoque.camisas + estoque.calcas + estoque.saias + estoque.vestidos + estoque.calcados;
	    System.out.println("Total no estoque: " + totalEstoque + " unidade");
	}
	 
	 
	
}
