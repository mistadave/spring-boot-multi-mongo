package com.marcosbarbero.wd.multiplemongo.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Marcos Barbero
 */
@RepositoryRestResource(collectionResourceRel = "second", itemResourceRel = "second", path = "second")
public interface SecondaryRepository extends MongoRepository<SecondaryModel, String> {
}
