package FigGeometrica;

public class Poligono extends Figura implements Diagonal{
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@SuppressWarnings("unused")
	@Override
	public double area() {
		double base;
		double altura;
		return 0;
	}

}
