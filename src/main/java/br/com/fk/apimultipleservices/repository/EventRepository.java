package br.com.fk.apimultipleservices.repository;

import br.com.fk.apimultipleservices.entity.Event;
import br.com.fk.apimultipleservices.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
