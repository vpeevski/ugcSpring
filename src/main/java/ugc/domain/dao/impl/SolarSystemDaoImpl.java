package ugc.domain.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ugc.domain.dao.api.SolarSystemDaoCustom;
import ugc.domain.entities.SolarSystem;

@Repository
public class SolarSystemDaoImpl implements SolarSystemDaoCustom {

	@PersistenceContext
	EntityManager entityManager;


	@Transactional
	public SolarSystem createNewSolarSystem(String solarSystemName) {
		SolarSystem newSolarSytem = new SolarSystem();
		newSolarSytem.setName(solarSystemName);
		entityManager.persist(newSolarSytem);
		entityManager.flush();
		return newSolarSytem;
	}

	public List<SolarSystem> findAllSolarSystems() {
		Query query = entityManager.createQuery("select ss from SolarSystem ss");
		List<SolarSystem> allSolarSystems = query.getResultList();
		return allSolarSystems;
	}

}
