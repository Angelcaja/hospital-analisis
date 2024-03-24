
public class Hospital {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente ("Joe", "Pris", 30, 630009, 10, 44444);
		GeneraAnalisis analisis1 = new GeneraAnalisis();
		
		analisis1.setPaciente ( paciente1);
		
		//Enlace entre el receptor (Lisener) en el emisor
		paciente1.addPropertyChangeLisener (analisis1);
		
		//Cambiamos el valor del hierro del paciente
		paciente1.setUltimo_hierro(12);

	}

}
