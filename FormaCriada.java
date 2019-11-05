
public class FormaCriada {
	private Forma circulo;
	private Forma retangulo;
	private Forma quadrado;

	public FormaCriada() {
		circulo = new Circulo();
		retangulo = new Retangulo();
		quadrado = new Quadrado();
	}

	public void desenharCirculo() {
		circulo.desenhar();	
	}
	public void desenharRetangulo() {
		retangulo.desenhar();		
	}
	public void desenharQuadrado() {
		quadrado.desenhar();
		
	}

}
