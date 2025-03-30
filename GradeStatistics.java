package SGMScode;

import java.util.List;
import java.util.Scanner;

// 这个类用于统计课程的成绩
public class GradeStatistics {
    // 创建一个 Scanner 对象用于读取用户输入
    Scanner scanner = new Scanner(System.in);

    // 统计课程成绩的方法
    public void statisticsGrades(List<StudentRecord> records) {
        System.out.println("===== 统计课程成绩 =====");
        System.out.print("请输入课程名称：");
        // 读取要统计的课程名称
        String course = scanner.nextLine();
        java.util.List<Double> grades = new java.util.ArrayList<>();

        // 遍历记录列表，找出该课程的所有成绩
        for (StudentRecord record : records) {
            if (record.course.equals(course)) {
                grades.add(record.grade);
            }
        }

        if (!grades.isEmpty()) {
            double sum = 0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;

            // 计算该课程成绩的总和、最高分和最低分
            for (double grade : grades) {
                sum += grade;
                if (grade > max) {
                    max = grade;
                }
                if (grade < min) {
                    min = grade;
                }
            }

            // 计算平均分
            double average = sum / grades.size();
            System.out.printf("课程：%s\n", course);
            System.out.printf("平均分：%.2f\n", average);
            System.out.printf("最高分：%.1f\n", max);
            System.out.printf("最低分：%.1f\n", min);
        } else {
            // 若未找到该课程的记录，给出提示
            System.out.println("未找到该课程的相关记录！");
        }
    }
}

