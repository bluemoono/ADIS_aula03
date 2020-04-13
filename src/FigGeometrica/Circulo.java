package FigGeometrica;

public class Circulo extends Figura{
	private double radio;
	private double pi;
	

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	@Override
	public double area() {
		double radio = 0;
		double pi = 3.14;
		double dobro = 2.0;
		return (pi*(Math.pow(radio,dobro)));
	}
	
}
