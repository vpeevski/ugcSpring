package ugc.domain.dao.api;

import java.util.List;

import ugc.domain.entities.SolarSystem;

public interface SolarSystemDaoCustom {

	SolarSystem createNewSolarSystem(String solarSystemName);

	List<SolarSystem> findAllSolarSystems();

}
