package jo_basic_day7_EX04;

public class people {

    public static void main(String[] args) {
        //객체 지향 프로그래밍 개요
        //모든 데이터를 객체로 취급하여 소프트웨어를 개발함
        //객체 :실생활에서 우리가 인식하는 유/무형의 사물
        //ex)집,자동차,사람,급여,주문,사랑,
        //클래스:객체를 만들어 내는 틀, 설계도








        //고객 정보를 클래스로 정의
        //이름,직업,나이,성별,혈액형
        //밥먹기,잠자기,말하기,걷기
        //고객 정볼를 기존방식으로 정의
        //속성별로 변수를 각각 선언해야함 -관리가 번거로움
        String name;
        String job;
        int age;
        String gender;
        String blood;

        name="최승희";
        job="의사";
        age=45;
        gender ="여";
        blood ="A";
        //클래스 사용하기
        //1.클래스에 대한 객체화 필요
        // 클래스를 구성하는 변수들이 메모리에 할당되어야 사용가능
        Person p = new Person();

        //2. 클래스를 멤버변수 초기화
        p.name = "이미녀";
        p.job= "골프선수";
        p.age=28;
        p.gender ="여";
        p.blood="o";

        //학생 클래스 사용하기
        Student s = new Student();

        s.hakbun = "201350050";
        s.name   = "김태희";
        s.addr = "경기도 고양시";
        s.birth  = "1985.3.22";
        s.dname  = "컴퓨터";
        s.prof =  "504"   ;
        //생성자를 이용해서 클래스 사용하기
        Person p2 =new Person ("김미남","교수",47, "남","AB");

        Student s2 = new Student("20125006","송혜교","서울영등포구","1988.9.17","컴퓨터","301");

    }
    //고객 클래스
    static class Person {
       //변수 선언(속성property,필드 field, 멤버member)
        private String name;
        private String job;
        private int age;
        private String gender;
        private String blood;


        //생성자: 변수 초기화 관련 특수한 메서드
       //기본생성자,매개변수를 포함하는 생성자

        //기본생성자:컴파일러가 자동으로 생성해서 추가해줌줌
        //public 클래스명(){
       //초기화 코드
        //}
       public Person(){}

        //public 클래스명 (매개변수){
        //초기화 코드
        //}
        //생성자의 매개변수명과 멤버변수명이 일치하면
        //일반적으로 shadowing 현상이 발생
        //클래스의 멤버 변수임을 명확하게 표현하기 위해
        //this 라는 키워드를추가함
        public Person(String name, String job, int age, String gender, String blood){
            this.name = name;   //name 왼쪽꺼 오른쪽꺼 클릭해보면 어디랑 연결되는지 알수있다
            this.job= job;
            this.age=age;
            this.gender =gender;
            this.blood=blood;

        }

    }
   //학생 클래스
   static class Student{
        private String hakbun;
        private String name;
        private String addr;
        private String birth;
        private String dname;
        private String prof;

       public Student(){}

       public Student(String hakbun, String name,String  addr, String birth, String dname, String prof) {
           this.hakbun = hakbun;   //name 왼쪽꺼 오른쪽꺼 클릭해보면 어디랑 연결되는지 알수있다
           this.name = name;
           this.addr = addr;
           this.birth = birth;
           this.prof = prof;
       }


       }





}
