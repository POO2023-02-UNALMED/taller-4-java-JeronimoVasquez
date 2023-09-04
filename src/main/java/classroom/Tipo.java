package classroom;

public enum Tipo {
	DISCIPLINAR(10,"vacio"),FUNDAMENTACION(20,"vacio"),ELECTIVA(30,"vacio");
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
