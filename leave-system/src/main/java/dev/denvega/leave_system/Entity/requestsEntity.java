package dev.denvega.leave_system.Entity;

import jakarta.persistence.*;
import dev.denvega.leave_system.Entity.usersEntity;
import dev.denvega.leave_system.Entity.typesEntity;


import java.time.LocalDate;

@Entity
@Table(name = "leave_requests")
public class requestsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private usersEntity user;

    @ManyToOne
    @JoinColumn(name = "leave_type_id")
    private typesEntity types;

    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private String reason;

    // Getters and Setters
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
