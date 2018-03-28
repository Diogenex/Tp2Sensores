import java.util.Observable;

public class Auto extends Observable implements Cloneable
{
	
	private String patente;
	private int modelo;
	private String marca;
	private String color;
	private int kilometraje;
	private int nivel_aceite;
	private int presion_neumaticos;
	private int nivel_agua;
	
	
	public Auto(String patente, int modelo, String marca, String color, int kilometraje, int nivel_aceite,int presion_neumaticos, int nivel_agua) 
	{
		this.patente = patente;
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.kilometraje = kilometraje;
		this.nivel_aceite = nivel_aceite;
		this.presion_neumaticos = presion_neumaticos;
		this.nivel_agua = nivel_agua;
	}


	public String getPatente() 
	{
		return patente;
	}


	public void setPatente(String patente)
	{
		this.patente = patente;
	}


	public int getModelo() 
	{
		return modelo;
	}


	public void setModelo(int modelo) 
	{
		this.modelo = modelo;
	}


	public String getMarca() 
	{
		return marca;
	}


	public void setMarca(String marca) 
	{
		this.marca = marca;
	}


	public String getColor() 
	{
		return color;
	}


	public void setColor(String color) 
	{
		this.color = color;
	}


	public int getKilometraje() 
	{
		return kilometraje;
	}


	public void setKilometraje(int kilometraje)
	{
		this.kilometraje = kilometraje;
	}


	public int getNivel_aceite()
	{
		return nivel_aceite;
		
	}

	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	public void setNivel_aceite(int nivel_aceite) throws CloneNotSupportedException
	{
		Auto old = (Auto) this.clone();
		this.nivel_aceite = nivel_aceite;
		setChanged();
        //Notificamos a los observadores y le enviamos el nuevo valor
        notifyObservers(old);
        //notifyObservers(); Este metodo solo notifica que hubo cambios en el objeto
	}


	public int getPresion_neumaticos()
	{
		return presion_neumaticos;
	}


	public void setPresion_neumaticos(int presion_neumaticos) throws CloneNotSupportedException
	{
		Auto old = (Auto) this.clone();
		this.presion_neumaticos = presion_neumaticos;
		setChanged();
        //Notificamos a los observadores y le enviamos el nuevo valor
        notifyObservers(old);
        //notifyObservers(); Este metodo solo notifica que hubo cambios en el objeto
	}


	public int getNivel_agua()
	{
		return nivel_agua;
	}


	public void setNivel_agua(int nivel_agua) throws CloneNotSupportedException 
	{
		Auto old = (Auto) this.clone();
		this.nivel_agua = nivel_agua;
		setChanged();
        //Notificamos a los observadores y le enviamos el nuevo valor
        notifyObservers(old);
        //notifyObservers(); Este metodo solo notifica que hubo cambios en el objeto
	}


	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color
				+ ", kilometraje=" + kilometraje + ", nivel_aceite=" + nivel_aceite + ", presion_neumaticos="
				+ presion_neumaticos + ", nivel_agua=" + nivel_agua + "]";
	}
	
}
