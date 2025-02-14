package dev.denvega.leave_system.Controller;

import dev.denvega.leave_system.Entity.requestsEntity;
import dev.denvega.leave_system.Entity.balancesEntity;
import dev.denvega.leave_system.Service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leave")
public class LeaveController {

    @Autowired
    private LeaveService LeaveService;

    // POST: สร้างคำขอลา
    @PostMapping("/leave-requests")
    public ResponseEntity<requestsEntity> createLeaveRequest(@RequestBody requestsEntity requestsEntity) {
        requestsEntity createdLeaveRequest = LeaveService.createLeaveRequest(requestsEntity);
        return new ResponseEntity<>(createdLeaveRequest, HttpStatus.CREATED);
    }

    // GET: ดูประวัติการลา
    @GetMapping("/leave-requests")
    public List<requestsEntity> getAllLeaveRequests() {
        return LeaveService.getAllLeaveRequests();
    }

    // PUT: อัพเดทสถานะการลา
    @PutMapping("/leave-requests{id}")
    public ResponseEntity<requestsEntity> updateLeaveRequestStatus(@PathVariable Long id, @RequestBody String status) {
        requestsEntity updatedLeaveRequest = LeaveService.updateRequestStatus(id, status);
        return new ResponseEntity<>(updatedLeaveRequest, HttpStatus.OK);
    }

    // GET: ดูจำนวนวันลาคงเหลือ
    @GetMapping("/leave-balances/{userId}")
    public List<balancesEntity> getLeaveBalances(@PathVariable Long userId) {
        return LeaveService.getBalancesByUser(userId);
    }
}
