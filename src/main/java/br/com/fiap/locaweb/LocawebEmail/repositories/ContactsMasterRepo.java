package br.com.fiap.locaweb.LocawebEmail.repositories;

import br.com.fiap.locaweb.LocawebEmail.entities.ContactsMasterEntity;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface ContactsMasterRepo
        extends CrudRepository<ContactsMasterEntity, Serializable> {
}
