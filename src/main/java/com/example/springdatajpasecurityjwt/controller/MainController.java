package com.example.springdatajpasecurityjwt.controller;

import com.example.springdatajpasecurityjwt.entity.Chuyenbay;
import com.example.springdatajpasecurityjwt.entity.Employee;
import com.example.springdatajpasecurityjwt.entity.Maybay;
import com.example.springdatajpasecurityjwt.entity.Nhanvien;
import com.example.springdatajpasecurityjwt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class MainController {
    @Autowired
    EmployeeRepository employeeRepository;

    @ResponseBody
    @GetMapping("/")
    public String home(){
        String html;
        html = "<a href=\"getDAD\">Tìm chuyến bay đến Đà lạt</a><br/>"
        +"<a href=\"getMayBay\">Tìm máy bay có tầm bay > 10000 km </a><br/>"
        +"<a href=\"getNV\">Tìm nhân viên có lương <10000</a><br/>"
        +"<a href=\"getChuyenBay\">Tìm chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.</a><br/>"

        ;
        return html;
    }

    @ResponseBody
    @RequestMapping("/testInsert")
    public String testInsert() {

//        Long empIdMax = this.employeeRepository.getMaxId();

        Employee employee = new Employee();

        int random = new Random().nextInt(3);
        employee.setFirstName("Dao");
        employee.setLastName("Cao Thang");
        employee.setEmail("Thang@gmail.com");
        this.employeeRepository.save(employee);

        return "Inserted: " + employee;
    }
    @ResponseBody
    @GetMapping("/getDAD")
    List<Chuyenbay> getAllChuyenBayDAD()
    {
        List<Chuyenbay> ds = employeeRepository.getChuyenBayDAD();
        return ds;
    }
    @ResponseBody
    @GetMapping("/getMayBay")
    List<Maybay> getMayBay()
    {
        List<Maybay> ds = employeeRepository.getMayBay();
        return ds;
    }
    @ResponseBody
    @GetMapping("/getNV")
    List<Nhanvien> getNV()
    {
        List<Nhanvien> ds = employeeRepository.getNV();
        return ds;
    }
    @ResponseBody
    @GetMapping("/getChuyenBay")
    List<Chuyenbay> getChuyenBay()
    {
        List<Chuyenbay> ds = employeeRepository.getChuyenBay();
        return ds;
    }


}
