package FigGeometrica;

public class Quadrado extends Poligono implements Diagonal{
	
	@Override
	public double area() {
		double base = 0;
		@SuppressWarnings("unused")
		double altura = 0;
		return base*2;
	}
}
