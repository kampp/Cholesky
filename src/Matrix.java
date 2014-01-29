import java.util.Vector;

public class Matrix { 
	
	Vector[] mat;
	
	public Matrix(String dateiname) {
	 
	}
	
 	public Matrix(int zeilen, int spalten) {
 		 
 		mat = new Vector[spalten];
 		
 		while ( spalten != 0 ) {
 			mat[spalten] = new Vector(zeilen);
 			spalten--;
 		}
 	}
 	
 	public void setElement(int zeile, int spalte, double wert) {
 		mat[spalte].set(zeile, wert);
 		
 	}
 	
 	public double getElement(int zeile, int spalte) {
 		return (double) mat[spalte].get(zeile);
 	}
 	
 	public double[] zeile(int _zeile) {
 		int i =0;
 		double[] temp = new double[mat.length-1];
 		
 		while ( i < mat.length ) {
 			temp[i] = (double)mat[i].get(_zeile);
 			i++;
 		}
 		return temp;
 	}
 	
 	public double[] spalte(int _spalte) {
 		int i =0;
 		double[] temp = new double[mat.length-1];
 		
 		while ( i < mat.length ) {
 			temp[i] = 
 		}
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
