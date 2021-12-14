
package com.deggvelopers.pomodoro.repositorio;

import com.deggvelopers.pomodoro.entidad.Configuracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracionRepositorio extends JpaRepository<Configuracion, String>{
	
}
