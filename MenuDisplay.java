package SGMScode;

import java.util.Scanner;

public class MenuDisplay {
    private Scanner scanner = new Scanner(System.in);

    public int showMenu(){
        System.out.println("=============================");
        System.out.println("欢迎使用学生成绩管理系统");
        System.out.println("=============================");
        System.out.println("请选择操作：");
        System.out.println("1.记录学生成绩");
        System.out.println("2.查询学生成绩");
        System.out.println("3.统计课程成绩");
        System.out.println("4.退出系统");
        try{
            return Integer.parseInt(scanner.nextLine());
        }catch(NumberFormatException e){
            System.out.println("错误：输入的不是有效的数字！");
            return -1;
        }

    }
}
