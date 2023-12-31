package com.github.yshameer.springjpa.snowflake.service.api;

import com.github.yshameer.springjpa.snowflake.service.repository.StudentRepository;
import com.github.yshameer.springjpa.snowflake.service.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentApiController implements StudentApi {

    @Autowired
    StudentRepository studentRepository;

    public ResponseEntity<Student> getStudentById(Long studentId) {
        return new ResponseEntity<>(studentRepository.findStudentById(studentId), HttpStatus.OK);
    }

    /**
     * @return
     */
    @Override
    public ResponseEntity<List<Student>> getAllStudent() {
        return new ResponseEntity<>(studentRepository.findAllStudent(), HttpStatus.OK);
    }

}
