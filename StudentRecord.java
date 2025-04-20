package SGMScode;

// 这个类用于存储学生的成绩记录信息
class StudentRecord {
    // 学生姓名
    String name;
    // 学生学号
    String studentId;
    // 课程名称
    String course;
    // 课程成绩
    double grade;

    // 构造方法，用于初始化学生记录
    public StudentRecord(String name, String studentId, String course, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
        this.grade = grade;
    }
}

