package SGMScode;

import java.util.ArrayList;
import java.util.List;

// 主类，程序的入口点
public class Main {
    public static void main(String[] args) {
        // 创建一个存储学生记录的列表
        List<StudentRecord> records = new ArrayList<>();
        // 创建菜单显示对象
        MenuDisplay menu = new MenuDisplay();
        // 创建成绩记录对象
        GradeRecorder recorder = new GradeRecorder();
        // 创建成绩查询对象
        GradeQuery query = new GradeQuery();
        // 创建成绩统计对象
        GradeStatistics statistics = new GradeStatistics();

        while (true) {
            // 显示菜单并获取用户选择
            int choice = menu.showMenu();
            switch (choice) {
                case 1:
                    // 若用户选择 1，调用记录成绩的方法
                    recorder.recordGrade(records);
                    break;
                case 2:
                    // 若用户选择 2，调用查询成绩的方法
                    query.queryGrades(records);
                    break;
                case 3:
                    // 若用户选择 3，调用统计成绩的方法
                    statistics.statisticsGrades(records);
                    break;
                case 4:
                    // 若用户选择 4，输出退出信息并结束程序
                    System.out.println("感谢使用学生成绩管理系统，再见！");
                    return;
                default:
                    if (choice != -1) {
                        // 若用户输入的选择无效，给出错误提示
                        System.out.println("错误：无效的选项序号！");
                    }
            }
        }
    }
}
