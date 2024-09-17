package br.com.fiap.locaweb.LocawebEmail;

import br.com.fiap.locaweb.LocawebEmail.entities.ContactsMasterEntity;
import br.com.fiap.locaweb.LocawebEmail.repositories.ContactsMasterRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LocawebEmailApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctxt = SpringApplication.run(LocawebEmailApplication.class, args);

		ContactsMasterRepo bean = ctxt.getBean(ContactsMasterRepo.class);
		ContactsMasterEntity contactsMasterEntity = new ContactsMasterEntity();

		contactsMasterEntity.setContactName("Thaina");
		contactsMasterEntity.setContactNumber(11921212121L);
		bean.save(contactsMasterEntity);
		ctxt.close();
	}

}
