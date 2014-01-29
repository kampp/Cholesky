import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Matrix { 
	
	Vector[] mat;
	
	public Matrix(String dateiname) {
		File matDat = new File(dateiname);
		BufferedReader buffRead = null;
		
		try {
			FileReader fr = new FileReader(matDat);
			buffRead = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int[] size = null;
		try {
			size = readHeadder(buffRead.readLine());
		} catch (Exception e1) {
			System.out.println("Die Matrix Datei ist Leer");
		}	
		int i =0;
		
		mat = new Vector[size[1]];;
		while ( i < size[1] ) {
			mat[i] = new Vector(size[0]);
			i++;
		}
		
		i = 0;
		while ( i < size[0] ) { // zeilen durchgehen
			double[] tempLine;
			String temp ="";
			try {
				if ( (temp = buffRead.readLine()) != null ) {
					tempLine = readLinen(temp);
					for ( int j = 0; j < size[1]; j++) { // spalten durchgehen
						setElement(i,j, tempLine[j]);
					}
				i++;
				}
				else {
					i++;
				}
			} catch (Exception e) {
				
			}			
		}
		
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
 			int j =0;
 			while ( j < mat[i].size() ) {
 				temp[i] = (double)mat[i].get(j);
 				j++;
 			} 				
 			i++;
 		}
 		return temp;
 	}
 	
 	public int hoehe() {
 		return mat[0].size();
 	}
 	
 	public int breite() {
 		return mat.length;
 	}
 	
 	public String toString() {
 		String temp ="";
 		
 		for ( int i =0; i < breite(); i++ ) {
 			for ( int j = 0; j < hoehe(); j++ ) {
 				temp += getElement(j,i);
 				System.out.println("bla");
 				temp += " ";
 			}
 			temp += "\n";
 		}
 		return temp;
 	}
 	
 	public void toFile(String dateiname) {
	 
 	}
 	
 	public Matrix transponierte() {
	 
 	}
 	
 	private int[] readHeadder(String line) {
 		String[] temp = line.split(" ");
 		int[] dimensions = new int[2];
 		
 		try {
 			dimensions[0] = Integer.parseInt(temp[0]);
 			dimensions[1] = Integer.parseInt(temp[1]);

 			if ( !(dimensions[0] == dimensions[1] )) {
 				throw new Exception();
 			}
 		}
 		catch ( Exception e ) {
 			System.out.println("Sie Haben falsche Angaben im Datei-Headder gemacht");
 		}
 		return dimensions;
 	}
 	
 	private double[] readLinen(String line) {
 		String[] temp = line.split(" ");
 		double[] dubbel = new double[temp.length];
 		int i = 0;
 		
 		while ( i < temp.length ) {
 			try {
 				dubbel[i] = Double.parseDouble(temp[i]);
 				i++;
 			}
 			catch ( Exception e ) {
 				System.out.println("Falsche Angabe in der Datei");
 			}
 		}
 		return dubbel;
 		
 	}
} 
