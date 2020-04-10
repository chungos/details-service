package com.details.dao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import com.details.models.Details;

@RepositoryRestResource
public interface DetailsRepository extends JpaRepository<Details, Long> {
}

@Component
class DetailsInitializer implements CommandLineRunner {

  private final DetailsRepository detailsRepository;

  public DetailsInitializer(DetailsRepository detailsRepository) {
    super();
    this.detailsRepository = detailsRepository;
  }

  public void run(String... args) throws Exception {
    Details d = new Details();
    d.setId( 1L );
    d.setStock( 1 );
    d.setPrice( 1.00 );
    d.setName( "Tester" );

    detailsRepository.save(d);
 }
}
