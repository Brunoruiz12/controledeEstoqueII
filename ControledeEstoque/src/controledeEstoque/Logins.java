package controledeEstoque;
import java.util.Scanner;

public class Logins {
  
	
	
	public static void loginComoAdm(Scanner Info,Produtos estoque) {
		
		
		
		System.out.println(" Voce escolheu Administrador ");
		System.out.println(" Digite a senha ");
	
		String passwordadm = Info.next();
	
		if (passwordadm.equals("****")) {
		System.out.println( " Bem Vindo, Administrador. ");
		perfilAdm.menuAdm(Info, estoque);
		
		}else {
			System.out.println( " Senha Incorreta ");
		}
	
	
}
	
		

		public static void loginComoFun(Scanner Info, Produtos estoque) {
			
			System.out.println( " Voce escolheu Funcionario ");
			System.out.println( "   Digite a senha ");
			
			String passwordfun = Info.next();
			
				if (passwordfun.equals("****")) {
					System.out.println(" Bem Vindo, Funcionario ");
					
				}else {
					System.out.println( "Senha Incorreta ");
				}
			
		}
		
	
	
}
