package services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface OwnerService  extends CrudService<Owner,Long>{

Owner findByLastName(String lastName);

}
