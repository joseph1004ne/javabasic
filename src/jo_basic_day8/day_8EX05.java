package jo_basic_day8;

public class day_8EX05 {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        System.out.println(f1.speed);
        System.out.println(f1.on);
        System.out.println(f1.radius);
        System.out.println(f1.color);

        Fan f2 = new Fan();
        System.out.println(f2.speed);
        System.out.println(f2.on);
        System.out.println(f2.radius);
        System.out.println(f2.color);
        //시험값 지정

        Fan f3 = new Fan();
        f3.speed = f3.FAST;  //speed =3; 도가능
        f3.radius = 10;
        f3.color = "yellow";
        f3.on = true;
        //클래스를 통해 객체를} 생성함

        Fan f4 = new Fan(2, false, 5, "blue");
        //매개변수 생성자를 사용하면
        //객체의 멤버변수에 값을 초기화하기가 편함
        Account a1 = new Account(1122, 20000, 4.5, "2014-08-15- 14:34:29");

    }

    static class Fan {
        final int SLOW = 1;  //상수, 제정의 불가 변수
        final int MEDIUM = 2;
        final int FAST = 3;


        private int speed;     // 아무나 만나지 못하게 할 데이터 소중한 데이터라 private
        private boolean on;
        private double radius;
        private String color;

        public Fan() {// 생성자 멤버 변수 초기화  Alt+insert 누르고 선택안하고 만들기
            speed = SLOW;
            on = false;
            radius = 5.0;
            color = "blue";
        }

        public Fan(
                int speed, boolean on, double radius, String color) {  //매개변수를 이용한 생성자
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

    }//Fan


    static class Account {
        private int aid;
        private int balance;
        private double interestRate;
        private String dateCreated;

        public Account() {
        }

        public Account(int aid, int balance, double interestRate, String dateCreated) {
            this.aid = aid;
            this.balance = balance;
            this.interestRate = interestRate;
            this.dateCreated = dateCreated;
        }


    }

    //클래스를 통해 객체를 생성함
    class Student {
        private int hakbun;
        private String name;
        private String addr;
        private String birth;
        private String dname;
        private int prof;

    }

    class Subject {
        private int sno;
        private String sname;
        private String sdesc;
        private String ssec;
    }

    class Proffessor {
        private int pno;
        private String name;
        private String field;
        private String tech;
    }


    class Major {
        private String mname;
        private String offpos;
        private String phone;
        private int chief;
    }
//class
}