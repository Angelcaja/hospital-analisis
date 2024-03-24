import java.io.Serializable;
import java.sql.Date;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class GeneraAnalisis implements Serializable, PropertyChangeListener  {
	
	//Receptor
	
	private int num_analisis;
	private Paciente paciente;
	private Date fecha;
	private int analisis_pendiente;


 public GeneraAnalisis() {
	 
 }

 //El Lisener recibe el evento y actua debido que hemos cumplido la condicion de <10 en y hemos mandado el evento desde la clase Paciente
public void propertyChange(PropertyChangeEvent evento) {
	System.out.println("Nivel de hierro anterior: " + evento.getOldValue());
	System.out.println("Nivel de hierro actual: " + evento.getNewValue());
	System.out.println("El paciente debe repetir el analisis");
	
}


public int getNum_analisis() {
	return num_analisis;
}


public void setNum_analisis(int num_analisis) {
	this.num_analisis = num_analisis;
}


public Paciente getPaciente() {
	return paciente;
}


public void setPaciente(Paciente paciente) {
	this.paciente = paciente;
}


public Date getFecha() {
	return fecha;
}


public void setFecha(Date fecha) {
	this.fecha = fecha;
}


public int getAnalisis_pendiente() {
	return analisis_pendiente;
}


public void setAnalisis_pendiente(int analisis_pendiente) {
	this.analisis_pendiente = analisis_pendiente;
}
}
