import java.util.Scanner;
public class Test5_1 {
    public static void main(String[] args) {
        int year;
        /********** Begin *********/
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        //在此补全小括号内的逻辑运算式，以判断输入的年份是否为闰年
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println("Yes");
        }
        else {//判定输入的年份不是闰年，执行下面大括号中的语句
            System.out.println("No");


        }
        /********** End *********/
    }
}

