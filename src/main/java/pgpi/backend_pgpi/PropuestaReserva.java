package pgpi.backend_pgpi;

import javax.persistence.Entity;

@Entity
public class PropuestaReserva {
	public PropuestaReserva(int muelleId, int hora) {
		super();
		this.muelleId = muelleId;
		this.hora = hora;
	}
	private int muelleId;
	private int hora;
	public int getMuelleId() {
		return muelleId;
	}
	public void setMuelleId(int muelleId) {
		this.muelleId = muelleId;
	}
	public int getHoraInicio() {
		return hora;
	}
	public void setHoraInicio(int hora) {
		this.hora = hora;
	}
}