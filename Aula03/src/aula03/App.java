package aula03;

public class App {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f; - Não irá funcionar pois o atributo está definido como privado
		c1.carga = 80;
		//c1.tampada = false;
		c1.destampar();
		c1.status();
		c1.rabiscar();
	}
}
