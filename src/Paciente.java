import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.beans.*;
public class Paciente implements java.io.Serializable {
	
	//Emisor
	
	private String nombre;
	private String apellido;
	private int edad;
	private int telefono;
	private int ultimo_hierro;
	private int ultimo_urea;
	private PropertyChangeSupport propertySupport; //puede generar un evento
	
	public Paciente() {
		propertySupport = new PropertyChangeSupport(this);
	}
	
	//Recibimos los datos del paciente enviados desde el main
	public Paciente (String nombre, String apellido, int edad, int telefono, int ultimo_hierro, int ultimo_urea) {
		propertySupport = new PropertyChangeSupport(this);
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.ultimo_hierro = ultimo_hierro;
		this.ultimo_urea = ultimo_urea;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getUltimo_hierro() {
		return ultimo_hierro;
	}

	public void setUltimo_hierro(int ultimo_hierro) {
		
		int valorNuevo = ultimo_hierro;
		
		//En caso de que el hierro sea superior a 10 enviaremos un evento que recibirá el lisener
		if (ultimo_hierro > 10) {
			//Lanzamos evento
			propertySupport.firePropertyChange("valor hierro", this.ultimo_hierro, valorNuevo);
	
		}
		else {
			System.out.println("El paciente tiene le hierro dentro de los parametros de la OMS");
		}
		this.ultimo_hierro = ultimo_hierro;
	}

	public int getUltimo_urea() {
		return ultimo_urea;
	}

	public void setUltimo_urea(int ultimo_urea) {
		this.ultimo_urea = ultimo_urea;
	}

	public PropertyChangeSupport getPropertySupport() {
		return propertySupport;
	}
	//se utilizará para gestionar los eventos de cambio de propiedades
	public void setPropertySupport(PropertyChangeSupport propertySypport) {
		this.propertySupport = propertySypport;
	}
	//permite agregar un objeto PropertyChangeListener a la lista de Listeners
	public void addPropertyChangeLisener (PropertyChangeListener listener) {
		propertySupport.addPropertyChangeListener(listener);
	}
	//nos permite eliminar un objeto PropertyChangeListener de la lista de Listeners
	public void removePropertyChangeLisener (PropertyChangeListener lisener) {
		propertySupport.removePropertyChangeListener(lisener);
	}

}
