package dev.denvega.leave_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dev.denvega.leave_system.Entity.usersEntity;


@Repository
public interface usersRepository extends JpaRepository<usersEntity, Long> {
}
