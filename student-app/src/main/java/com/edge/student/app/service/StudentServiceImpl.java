package com.edge.student.app.service;

import com.edge.student.app.model.Student;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    String jdbcUrl = "jdbc:postgresql://localhost:5432/employeeinfo";
    String username = "postgres";
    String password = "55555";

    @Override
    public Student save(Student student) {
        Student returnStudent = null;

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            String sqlStatement = "insert into edge_student_info(id, name, email, mobile) values(?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sqlStatement);
            statement.setInt(1, student.getId());
            statement.setString(2, student.getName());
            statement.setString(3, student.getEmail());
            statement.setString(4, student.getMobile());
            int res = statement.executeUpdate();
            System.out.println("res : " + res);
            if(res > 0){
                returnStudent =  student;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return returnStudent;
    }

    @Override
    public Student update(Student student) {
        Student returnStudent = null;

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            String sqlStatement = "update edge_student_info set name =? , email =? , mobile =? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sqlStatement);

            statement.setString(1, student.getName());
            statement.setString(2, student.getEmail());
            statement.setString(3, student.getMobile());
            statement.setInt(4, student.getId());
            int res = statement.executeUpdate();
            System.out.println("res : " + res);
            if(res > 0){
                returnStudent =  student;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return returnStudent;
    }

    @Override
    public Student delete(Integer id) {
        Student returnStudent = null;

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            String sqlStatement = "delete from edge_student_info  where id = ?";
            PreparedStatement statement = connection.prepareStatement(sqlStatement);

            statement.setInt(1, id);

            int res = statement.executeUpdate();
            System.out.println("res : " + res);
            if(res > 0){
                returnStudent =  new Student();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return returnStudent;
    }

    @Override
    public Student getById(Integer id) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }
}
