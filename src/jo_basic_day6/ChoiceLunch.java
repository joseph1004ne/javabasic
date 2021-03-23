package jo_basic_day6;

import java.sql.SQLOutput;
import java.util.Random;

public class ChoiceLunch {
    public static void main(String[] args) {
String[] menu={"김밥","라면","돈까스","우동", "짜장면" ,"햄버거", "짬뽕"};

//Random rnd=new Random();
//int idx =rnd.nextInt();
//// 난수 생성
     //메뉴는 7개이므로 idx 변수의 범위는 0~6
//Math.random 를 이용해ㅓ 실제 난수가 만들어지는 원리를 알아봄
        double magic =Math.random();
        System.out.println(magic);

        //0~9사이 임의의 난수 생성
        System.out.println(magic*10);
        System.out.println((int)magic*10);
        System.out.println((int)magic*100);
//0~(n-1)범위난수 :random%b
        //0~(100-1)범위 난수
        System.out.println(magic * 100);
        //a~b 범위 난수 :(random *(최대값- 최솟값))+최소값
        // 1~45 범위 난수
System.out.println((int)(magic * (45-1))+1);

int idx =(int)(Math.random()*7);

        System.out.println(menu[idx]);



//        System.out.println(menu [idx]);

    }
}
