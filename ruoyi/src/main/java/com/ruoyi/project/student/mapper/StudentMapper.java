package com.ruoyi.project.student.mapper;

import java.util.List;
import com.ruoyi.project.student.domain.Student;

/**
 * 学生信息Mapper接口
 * 
 * @author abc
 * @date 2020-04-10
 */
public interface StudentMapper 
{
    /**
     * 查询学生信息
     * 
     * @param studentId 学生信息ID
     * @return 学生信息
     */
    public Student selectStudentById(Long studentId);

    /**
     * 查询学生信息列表
     * 
     * @param student 学生信息
     * @return 学生信息集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增学生信息
     * 
     * @param student 学生信息
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改学生信息
     * 
     * @param student 学生信息
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 删除学生信息
     * 
     * @param studentId 学生信息ID
     * @return 结果
     */
    public int deleteStudentById(Long studentId);

    /**
     * 批量删除学生信息
     * 
     * @param studentIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudentByIds(Long[] studentIds);
}
