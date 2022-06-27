package logica;

public class Auto {
	private String marca;
	private double velMax;
	private int potencia;
	private double precio;


//constructor por defecto
public Auto() {
	
}

//constructor especifico
public Auto(String m, double v, int po, double pr) {
	marca=m;
	velMax=v;
	potencia=po;
	precio=pr;
}
//metodos get
public String getMarca() {
	return marca;
}
public double getVelMax() {
	return velMax;
}
public int getPotencia() {
	return potencia;
}
public double getPrecio() {
	return precio;
}


//metodo toString
@Override
public String toString() {
	return("marca: " + marca + " velocidad maxima: " + velMax + " potencia: " + potencia + " precio: " + precio);
} 


//metodos set
public void setMarca(String m) {
	marca=m;
}
public void setVelMax(double v) {
	velMax=v;
}
public void setPotencia(int po) {
	potencia=po;
}
public void setPrecio(double pr) {
	precio=pr;
}
}