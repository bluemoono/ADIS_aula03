package FigGeometrica;

public class Triangulo extends Poligono implements Diagonal{
	
	@Override
	public double area() {
		double base = 0;
		double altura = 0;
		return (base*altura)/2;
	}
}
