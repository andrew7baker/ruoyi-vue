package com.ruoyi.project.student.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.student.mapper.StudentMapper;
import com.ruoyi.project.student.domain.Student;
import com.ruoyi.project.student.service.IStudentService;

/**
 * 学生信息Service业务层处理
 * 
 * @author abc
 * @date 2020-04-10
 */
@Service
public class StudentServiceImpl implements IStudentService 
{
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 查询学生信息
     * 
     * @param studentId 学生信息ID
     * @return 学生信息
     */
    @Override
    public Student selectStudentById(Long studentId)
    {
        return studentMapper.selectStudentById(studentId);
    }

    /**
     * 查询学生信息列表
     * 
     * @param student 学生信息
     * @return 学生信息
     */
    @Override
    public List<Student> selectStudentList(Student student)
    {
        return studentMapper.selectStudentList(student);
    }

    /**
     * 新增学生信息
     * 
     * @param student 学生信息
     * @return 结果
     */
    @Override
    public int insertStudent(Student student)
    {
        return studentMapper.insertStudent(student);
    }

    /**
     * 修改学生信息
     * 
     * @param student 学生信息
     * @return 结果
     */
    @Override
    public int updateStudent(Student student)
    {
        return studentMapper.updateStudent(student);
    }

    /**
     * 批量删除学生信息
     * 
     * @param studentIds 需要删除的学生信息ID
     * @return 结果
     */
    @Override
    public int deleteStudentByIds(Long[] studentIds)
    {
        return studentMapper.deleteStudentByIds(studentIds);
    }

    /**
     * 删除学生信息信息
     * 
     * @param studentId 学生信息ID
     * @return 结果
     */
    @Override
    public int deleteStudentById(Long studentId)
    {
        return studentMapper.deleteStudentById(studentId);
    }
}
