package jo_basic_day8;

public class Person_main {
    public static void main(String[] args) {



        Person p1 = new Person("인간","남자",26,173,65);

        System.out.println(p1.name);
    }//void main

    static class
    Person {
        private String name;
        private String gender;
        private int age;
        private int height;
        private int weight;

        public Person() { }

        public Person(String name, String gender, int age, int height, int weight) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.height = height;
            this.weight = weight;

        }//변수
    }//static class person
}//전체 클래스