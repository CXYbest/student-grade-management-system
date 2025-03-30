package SGMScode;

import java.util.List;
import java.util.Scanner;

// 这个类用于记录学生的成绩
public class GradeRecorder {
    // 创建一个 Scanner 对象用于读取用户输入
    Scanner scanner = new Scanner(System.in);

    // 记录学生成绩的方法
    public void recordGrade(List<StudentRecord> records) {
        System.out.println("===== 记录学生成绩 =====");
        System.out.print("请输入学生姓名：");
        // 读取学生姓名
        String name = scanner.nextLine();
        System.out.print("请输入学生学号：");
        // 读取学生学号
        String studentId = scanner.nextLine();

        // 检查学号是否已存在
        for (StudentRecord record : records) {
            if (record.studentId.equals(studentId)) {
                System.out.println("错误：该学号已存在！");
                return;
            }
        }

        System.out.print("请输入课程名称：");
        // 读取课程名称
        String course = scanner.nextLine();
        System.out.print("请输入成绩（0 - 100）：");

        try {
            // 读取成绩
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 0 && grade <= 100) {
                // 若成绩在有效范围内，创建新的学生记录并添加到列表中
                records.add(new StudentRecord(name, studentId, course, grade));
                System.out.println("成绩已成功记录！");
            } else {
                // 若成绩不在有效范围内，给出错误提示
                System.out.println("错误：成绩必须在 0 - 100 范围内！");
            }
        } catch (NumberFormatException e) {
            // 若输入的成绩不是有效数字，给出错误提示
            System.out.println("错误：输入的成绩不是有效的数字！");
        }
    }
}
