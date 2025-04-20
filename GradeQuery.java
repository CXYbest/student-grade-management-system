package SGMScode;

import java.util.List;
import java.util.Scanner;

// 这个类用于查询学生的成绩
public class GradeQuery {
    // 创建一个 Scanner 对象用于读取用户输入
    Scanner scanner = new Scanner(System.in);

    // 查询学生成绩的方法
    public void queryGrades(List<StudentRecord> records) {
        System.out.println("===== 查询学生成绩 =====");
        System.out.println("请选择查询方式：");
        System.out.println("1. 按学生姓名查询");
        System.out.println("2. 按学生学号查询");
        System.out.println("3. 按课程名称查询");

        try {
            // 读取用户选择的查询方式
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("请输入学生姓名：");
                    // 读取要查询的学生姓名
                    String name = scanner.nextLine();
                    boolean foundByName = false;
                    // 遍历记录列表，查找匹配的学生姓名
                    for (StudentRecord record : records) {
                        if (record.name.equals(name)) {
                            System.out.printf("姓名：%s, 学号：%s, 课程：%s, 成绩：%.1f\n", record.name, record.studentId, record.course, record.grade);
                            foundByName = true;
                        }
                    }
                    if (!foundByName) {
                        // 若未找到匹配记录，给出提示
                        System.out.println("未找到相关记录！");
                    }
                    break;
                case 2:
                    System.out.print("请输入学生学号：");
                    // 读取要查询的学生学号
                    String studentId = scanner.nextLine();
                    boolean foundById = false;
                    // 遍历记录列表，查找匹配的学生学号
                    for (StudentRecord record : records) {
                        if (record.studentId.equals(studentId)) {
                            System.out.printf("姓名：%s, 学号：%s, 课程：%s, 成绩：%.1f\n", record.name, record.studentId, record.course, record.grade);
                            foundById = true;
                        }
                    }
                    if (!foundById) {
                        // 若未找到匹配记录，给出提示
                        System.out.println("未找到相关记录！");
                    }
                    break;
                case 3:
                    System.out.print("请输入课程名称：");
                    // 读取要查询的课程名称
                    String course = scanner.nextLine();
                    boolean foundByCourse = false;
                    // 遍历记录列表，查找匹配的课程名称
                    for (StudentRecord record : records) {
                        if (record.course.equals(course)) {
                            System.out.printf("姓名：%s, 学号：%s, 课程：%s, 成绩：%.1f\n", record.name, record.studentId, record.course, record.grade);
                            foundByCourse = true;
                        }
                    }
                    if (!foundByCourse) {
                        // 若未找到匹配记录，给出提示
                        System.out.println("未找到相关记录！");
                    }
                    break;
                default:
                    // 若用户输入的选择无效，给出错误提示
                    System.out.println("错误：无效的选项序号！");
            }
        } catch (NumberFormatException e) {
            // 若用户输入的不是有效数字，给出错误提示
            System.out.println("错误：输入的不是有效的数字！");
        }
    }
}
