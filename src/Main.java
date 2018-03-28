
public class Main {
	
	 public static void main(String args[])throws CloneNotSupportedException{
		 
	        Auto observado = new Auto("OFC 277",1992 , "Ford", "blanco",1100 , 50, 60, 80);
	        Mecanico observador = new Mecanico("Leandro", "Dall", 31, "Guanahani 3845");
	        
	        observado.addObserver(observador);
	        
	        observado.setNivel_aceite(100);
			observado.setKilometraje(200); // No informa nada porque no uso el setchange() en el metodo
	        observado.setNivel_agua(60);
	        observado.setPresion_neumaticos(30);

}
}
