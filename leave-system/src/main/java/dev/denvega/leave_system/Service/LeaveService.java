package dev.denvega.leave_system.Service;

import dev.denvega.leave_system.Entity.requestsEntity;
import dev.denvega.leave_system.Entity.balancesEntity;
import dev.denvega.leave_system.Repository.requestsRepository;
import dev.denvega.leave_system.Repository.balancesRepository;
import dev.denvega.leave_system.Repository.usersRepository;
import dev.denvega.leave_system.Repository.typesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import dev.denvega.leave_system.Exception.ResourceNotFoundException;

@Service
public class LeaveService {

    @Autowired
    private requestsRepository requestsRepository;

    @Autowired
    private balancesRepository balancesRepository;

    @Autowired
    private usersRepository usersRepository;

    @Autowired
    private typesRepository typesRepository;

    public requestsEntity createLeaveRequest(requestsEntity requestsEntity) {
        return requestsRepository.save(requestsEntity);
    }

    public List<requestsEntity> getAllLeaveRequests() {
        return requestsRepository.findAll();
    }

    public requestsEntity updateRequestStatus(Long id, String status) {
        requestsEntity leaveRequest = requestsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("LeaveRequest not found"));
        leaveRequest.setStatus(status);
        return requestsRepository.save(leaveRequest);
    }

    public List<balancesEntity> getBalancesByUser(Long userId) {
        return balancesRepository.findByUserId(userId);
    }
}
