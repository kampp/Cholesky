import java.util.Vector;

public class Matrix { 
	
	Vector[] mat;
	
	public Matrix(String dateiname) {
	 
	}
	
 	public Matrix(int zeilen, int spalten) {
	 
 		mat = new Vector[spalten];
 		
 		while ( spalten != 0 ) {
 			mat[spalten] = new Vector(zeilen);
 		}
 	}
 	
 	public void setElement(int zeile, int spalte, double wert) {
 		mat[spalte].set(zeile, wert);
 		
 	}
 	
 	public double getElement(int zeile, int spalte) {
 		return (double) mat[spalte].get(zeile);
 	}
 	
 	public double[] zeile(int _zeile) {
 		
 	}
 	
 	public double[] spalte(int _spalte) {
	 
 	}
 	
 	public int hoehe() {
	 
 	}
 	
 	public int breite() {
	 
 	}
 	
 	public String toString() {
	 
 }
 	public void toFile(String dateiname) {
	 
 }
 	public Matrix transponierte() {
	 
 }
} 
