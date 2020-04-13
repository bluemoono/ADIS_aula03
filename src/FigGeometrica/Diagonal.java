package FigGeometrica;

public interface Diagonal {
	
	default double diagonal(double altura, double base){
		return (double) Math.sqrt(base*base + altura*altura);
	}
}
