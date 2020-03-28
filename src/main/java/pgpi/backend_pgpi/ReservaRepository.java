package pgpi.backend_pgpi;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ReservaRepository extends CrudRepository<Reserva, Integer> {
	List<Reserva> findByMatricula(String matricula);
	List<Reserva> findByMuelleAndHoraInicio(Muelle muelle, int horaInicio);

}

