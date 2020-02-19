package com.marcosbarbero.wd.multiplemongo.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Marcos Barbero
 */
@RepositoryRestResource(collectionResourceRel = "first", itemResourceRel = "first", path = "first")
public interface PrimaryRepository extends MongoRepository<PrimaryModel, String> {
}
