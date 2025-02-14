package dev.denvega.leave_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dev.denvega.leave_system.Entity.requestsEntity;


@Repository
public interface requestsRepository extends JpaRepository<requestsEntity, Long> {
}
