package factura;

import java.util.Arrays;
/**
 * Clase para almacenar facturas
 * aqui pongo más información de la clase factura
 * @author isa
 * @version 1.0
 * @since 1
 */
public class Factura {

	public String id_cliente;		// Identificador (codigo) del cliente
	public String nombre_cliente;	// Nombre del cliente
	
	public LineaFactura lineas[];	// lista de productos comprados
		
	/**
	 *   Constructor <strong> <big>Factura </big></</strong>
	 *   @param  idCliente Parametro 1 Es un String que indica el código del cliente
	 *   @param  nombreCliente  Parametro 2 Es un String que indica el nombre del cliente
	 *   @param  lineas Parametro 3 Es un array que contiene la lista de productos comprados
	 *   @see LineaFactura
	 */
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	
	/**
	 * Método getTotal() de la <u>clase Factura</u>
	 * @return Devuelve float: el precio total de la Factura, calculado a partir del precio de cada linea	 
	 */
	public float getTotal(){
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++ ){
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	
	
	@Override
	public String toString() {
		return "Factura [" 
		+ "id_cliente=" + id_cliente 		 
		+ ", nombre_cliente=" + nombre_cliente 
		+ ", getTotal()=" + getTotal()
		+ ", lineas=" + Arrays.toString(lineas)
		+ "]";
	}

/**
 *  Programa principal main, de la <u>clase Factura </u>
 *  crea una factura y la muestra por pantalla
 * @param args
 */
	public static void main(String[] args){
		
		// Crear una factura
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		// Escribir la factura
		System.out.println( factura1 );
		
	}	
	
}
