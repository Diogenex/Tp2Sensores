import java.util.Observable;
import java.util.Observer;

public class Mecanico implements Observer
{
	
	private String nombre;
	private String apellido;
	private int edad;
	private String domicilio;
	
	public Mecanico(String nombre, String apellido, int edad, String domicilio) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public void update(Observable arg0, Object arg1) 
	{
		if (arg1 instanceof Auto) {
			Auto nuevo = (Auto) arg0;
			Auto viejo = (Auto) arg1;
			System.out.println("Hubo una Nueva Actualizacion!! ");
		 		if(nuevo.getNivel_aceite() != viejo.getNivel_aceite()){
		 				System.out.println(" Se cambio valor de Nivel de Aceite: Anterior= " + viejo.getNivel_aceite() + " Ahora= "+ nuevo.getNivel_aceite());
		 		}else if(nuevo.getNivel_agua() != viejo.getNivel_agua()){
		 		System.out.println(" Se cambio valor de Nivel de Agua: Anterior= " + viejo.getNivel_agua() + " Ahora= "+ nuevo.getNivel_agua());
		 		}else if(nuevo.getPresion_neumaticos() != viejo.getPresion_neumaticos()){
			 		System.out.println(" Se cambio valor de Presion de Neumaticos: Anterior= " + viejo.getPresion_neumaticos() + " Ahora= "+ nuevo.getPresion_neumaticos());
			 		}
		}
	}
	
}

