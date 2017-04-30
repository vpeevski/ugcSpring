package ugc.domain.dao.api;

import org.springframework.data.jpa.repository.JpaRepository;

import ugc.domain.entities.SolarSystem;


public interface SolarSystemDao extends JpaRepository<SolarSystem, Long>, SolarSystemDaoCustom {


	
}
