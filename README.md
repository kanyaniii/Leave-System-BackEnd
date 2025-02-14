# แผนการพัฒนาระบบลางาน (Leave System) 
# การเริ่มต้นใช้งาน

## 1.	สร้าง Spring Boot 3.3 project ด้วย Spring Initializer
Java JDK เวอร์ชัน 17 หรือสูงกว่า
Spring Boot Framework เวอร์ชัน 3.3 หรือสูงกว่า

## 2.	ออกแบบ Database Schema 
- users (id, username, email, role, department, etc.)
- leave_types (id, name, description, max_days)
- leave_requests (id, user_id, leave_type_id, start_date, end_date, status, reason)
- leave_balances (id, user_id, leave_type_id, year, remaining_days)


## 3.	พัฒนา Spring Boot Backend APIs 
o	สร้าง Entity classes
o	สร้าง Repository interfaces
o	เริ่มพัฒนา Service layer

- POST /api/leave-requests (สร้างคำขอลา)
- GET /api/leave-requests (ดูประวัติการลา)
- PUT /api/leave-requests/{id} (อัพเดทสถานะการลา)
- GET /api/leave-balances (ดูจำนวนวันลาคงเหลือ)


## 4.รันแอปพลิเคชัน
mvn spring-boot:run     


