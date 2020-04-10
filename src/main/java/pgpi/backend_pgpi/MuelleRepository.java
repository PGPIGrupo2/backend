package pgpi.backend_pgpi;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MuelleRepository extends CrudRepository<Muelle, Integer> {

	List<Muelle> findByTipoVehiculo(TipoVehiculo tipoVehiculo);
}

