
public class FacturaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseFactura Factura = new ClaseFactura("pedro","jacinto");
		int precio=Factura.Precio();
		Factura.ImprimirFactura(precio);
	}

}
