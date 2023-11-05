package br.com.fk.apimultipleservices.repository;

import br.com.fk.apimultipleservices.entity.EventDayPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventDayPersonRepository extends JpaRepository<EventDayPerson, Long> {
}
