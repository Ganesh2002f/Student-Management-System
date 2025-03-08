package in.fg.main.service.impl;

import in.fg.main.entity.Student;
import in.fg.main.repository.StudentRepository;
import in.fg.main.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents()
    {

        List<Student> students = studentRepository.findAll();
        System.out.println(students);
       return  students;
    }


    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


}
