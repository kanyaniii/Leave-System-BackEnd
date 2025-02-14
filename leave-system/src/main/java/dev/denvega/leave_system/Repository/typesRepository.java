package dev.denvega.leave_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dev.denvega.leave_system.Entity.typesEntity;


@Repository
public interface typesRepository extends JpaRepository<typesEntity, Long> {
}
