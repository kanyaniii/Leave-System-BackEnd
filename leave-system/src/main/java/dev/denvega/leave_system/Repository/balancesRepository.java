package dev.denvega.leave_system.Repository;

import org.apache.catalina.User;
import dev.denvega.leave_system.Entity.balancesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface balancesRepository extends JpaRepository <balancesEntity,Long> {
    List<balancesEntity> findByUserId(Long userId);
}
