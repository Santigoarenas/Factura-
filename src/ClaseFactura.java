import java.util.Scanner;

public  class ClaseFactura extends ClasePrecio{
	
	String cliente;
	String emisor;
	
	public ClaseFactura(String cliente, String emisor) {
		super();
		this.cliente = cliente;
		this.emisor = emisor;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	
	public int Precio() 
	{
		Scanner ingreso = new Scanner(System.in);
		int precio;
		System.out.print("ingrese el precio del producto : ");
		precio = ingreso.nextInt();		
		
		return precio;
	}
	
	public void ImprimirFactura(int precio) 
	{
		System.out.println("la factura fue emitidad por "+emisor+" por un valor de "+precio+" para "
						  +"el señor "+cliente);
	}
	
	
}
