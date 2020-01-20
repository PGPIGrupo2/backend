package pgpi.backend_pgpi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehiculo {
  @Id
  private String matricula;

  public String getMatricula() {
	  return matricula;
  }
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
