package se.annaisacson.conferencedemo.Repositories;

import se.annaisacson.conferencedemo.Model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
