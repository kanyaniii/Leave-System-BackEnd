package dev.denvega.leave_system.Entity;

import jakarta.persistence.*;
import org.apache.catalina.User;
import dev.denvega.leave_system.Entity.usersEntity;
import dev.denvega.leave_system.Entity.typesEntity;

@Entity
@Table(name = "leave_balances")
public class balancesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private usersEntity user;

    @ManyToOne
    @JoinColumn(name = "leave_type_id")
    private typesEntity types;

    private int years;
    private  int remainingDays;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public usersEntity getUser() {
        return user;
    }

    public void setUser(usersEntity user) {
        this.user = user;
    }

    public typesEntity getLeaveType() {
        return types;
    }

    public void setLeaveType(typesEntity leaveType) {
        this.types = leaveType;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getRemainingDays() {
        return remainingDays;
    }

    public void setRemainingDays(int remainingDays) {
        this.remainingDays = remainingDays;
    }
}
