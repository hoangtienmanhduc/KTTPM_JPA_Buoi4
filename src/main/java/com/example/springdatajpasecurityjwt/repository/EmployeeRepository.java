package com.example.springdatajpasecurityjwt.repository;

import com.example.springdatajpasecurityjwt.entity.Chuyenbay;
import com.example.springdatajpasecurityjwt.entity.Employee;
import com.example.springdatajpasecurityjwt.entity.Maybay;
import com.example.springdatajpasecurityjwt.entity.Nhanvien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    List<Employee> findEmployeeByLastName(String lastname);
    @Query(value = "SELECT e FROM Chuyenbay e WHERE e.gaDen='DAD'")
    List<Chuyenbay> getChuyenBayDAD();
    @Query(value = "SELECT e FROM Maybay e WHERE e.tamBay>10000")
    List<Maybay> getMayBay();
    @Query(value = "SELECT e FROM Nhanvien e WHERE e.luong<10000")
    List<Nhanvien> getNV();
    @Query(value = "SELECT e FROM Chuyenbay e WHERE e.doDai<10000 and e.doDai>8000")
    List<Chuyenbay> getChuyenBay();


}