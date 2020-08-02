
public class Ligacao {

	private Telefone celular;
	private Telefone telefoneFixo;
	
	
	public Ligacao() {
		
		this.celular = new Celular();
		this.telefoneFixo = new TelefoneFixo();
	}
	
   
	public void ligarParaCelular() {
		celular.ligar();
	}
	
	public void ligarParaTelefoneFixo() {
		telefoneFixo.ligar();
	}
}
