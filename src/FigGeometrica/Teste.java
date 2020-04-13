package FigGeometrica;
import java.util.ArrayList;

public class Teste{
	public static void main(String[] args) {
		ArrayList<Figura> figura= new ArrayList<>();
		figura.add(new Circulo());
		figura.add(new Poligono());
		figura.add(new Losangulo());
		figura.add(new Quadrado());
		figura.add(new Retangulo());
	}
}
