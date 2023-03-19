package heranca2;

public class RodarAplicacao {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		//Upcasts
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		//Downcast
		//Vendedor vendedor_ = (vendedor) new Funcionario();
		//Este conceito deve ser evitado.ERRO: Class Cast Exception
		
	}

}
