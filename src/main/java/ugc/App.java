package ugc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import ugc.config.AppConfig;
import ugc.domain.dao.api.SolarSystemDao;


public class App {


	public static void main(String[] args) {		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		try {
			
			SolarSystemDao solarSystemDao = context.getBean(SolarSystemDao.class);
			solarSystemDao.createNewSolarSystem("Sun solar system");
			System.out.println(solarSystemDao.findAllSolarSystems());
			System.out.println(solarSystemDao.findByNameLike("%solar%"));
			
		} finally {
			context.close();
		}
	}

}
