package se.annaisacson.conferencedemo.Repositories;

import se.annaisacson.conferencedemo.Model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
