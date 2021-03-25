package jo_basic_day7_EX04;

        import java.sql.SQLOutput;
        import java.util.Scanner;

public class SungJukV3b {
    //성적처리 프로그램을 체계적으로 만들려고함
    //배열과 메소드를 효율적으로 코들르 재작성함
    Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String menu= "";

        //System.out.print("작업을 선택하세요:");
        //뭘 입력해야 할지 , 입력시 어떤 기능이 실행 되는지 알수 없음

        while(true) {
            String displaymenu=
                    "=======================\n"+
                            "    성적 프로그램 v3   \n"+
                            "=======================\n"+
                            "1.성적 데이터 입력  \n"  +
                            "2.성적 데이터 조회  \n"  +
                            "3.성적 데이터 상세조 \n"  +
                            "4.성적 데이터 수정  \n" +
                            "5.성적 데이터 삭제  \n" +
                            "0.성적 데이터 종료  \n" +
                            "=======================\n" +
                            "작업을 선택하세요:";

            System.out.println(displaymenu);

            menu = sc.next();
            switch(menu) {//jdk 7부터는 switch 문에 문자형 사용 가능
                case"1":;break;
                case"2":System.out.println("성적 데이터 조회");break;
                case"3":System.out.println("성적 데이터 상세조회");break;
                case"4":System.out.println("성적 데이터 수정");break;
                case"5":System.out.println("성적 데이터 삭제");break;
                case"0":System.exit(0);break;

                default :System.out.println("잘못 입력");
            }//switch



        }//while



    }//main
//    //메뉴 출력하는 메서드
//    public static void addSunghuk() {
//
//        String displaymenu=
//                "=======================\n"+
//                        "    성적 프로그램 v3   \n"+
//                        "=======================\n"+
//                        "1.성적 데이터 입력  \n"  +
//                        "2.성적 데이터 조회  \n"  +
//                        "3.성적 데이터 상세조 \n"  +
//                        "4.성적 데이터 수정  \n" +
//                        "5.성적 데이터 삭제  \n" +
//                        "0.성적 데이터 종료  \n" +
//                        "=======================\n" +
//                        "작업을 선택하세요:";
//
//        System.out.println(displaymenu);
//
//        String name;
//        int kor,eng, mat,tot;
//        double avg;
//        char grd;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("이름은?");
//        name =sc.next();
//        System.out.println("국어는?");
//        name =sc.next();
//        System.out.println("영어는?");
//        name =sc.next("수학은?");
//        System.out.println();
//
//        tot=kor+eng+mat;
//        avg=(double)tot/3;
//        switch((int)avg/10){
//            case"1":grd =addSunghuk(); break;
//            case"2":grd ='우';break;
//            case"3":grd ='미';break;
//            case"4":grd ='양';break;
//            case"5":grd ='가';break;
//        }
//        String fmt ="%s %d %d %d \n %d %.1f %c";
//        System.out.printf(fmt,name,kor,eng,mat,tot,avg,grd);
//
//
//
//
  //  }//메뉴 출력하는 메서드 - displayMenu
}//클래스