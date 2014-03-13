package factura;

/**
 * Clase que contiene el detalle de lineas correspondiente
 * a una factura. Identificación del producto, nombre, precio, cantidad y descuento
 * @author isa
 * @see Factura
 *
 */
public class LineaFactura {
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	/**
	 *   Constructor  <strong> <big>LineaFactura </big></</strong>
	 *   @param idProducto   Parametro 1. Es un String que indica el código del cliente
	 *   @param nombreProducto Parametro 2. Es un String que indica el nombre del cliente
	 *   @param  precio Parametro 3. Es un array que contiene la lista de productos comprados
	 *   @param  cantidad  Parametro 4. Unidades compradas
	 *   @param  descuento  Parametro 5. Descuento de la unidad (no se esta utilizando)
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	/**
	 *{@inheritDoc}
	 */
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Método getTotal() de la <u> clase Linea Factura </u>
	 * @return Devuelve float el precio total de una linea. El precio de la unidad por la cantidad de productos 
	 * pedidos de esa unidad
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
