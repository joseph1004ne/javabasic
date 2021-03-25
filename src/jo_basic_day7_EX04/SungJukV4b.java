package jo_basic_day7_EX04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;


 //      public static void main(String[] args) {
//            //성적 데이터 생성
//            SungJuk sj =new SungJuk(name:"지현",kor:87,eng:56, mat:32);
//            //성적처리를 위해 service 객체 생성
//            SungJukService sjsrv =new SungJukService();
//            //성적 처리
//            sjsrv.computeSungJuk(sj);
//            //결과 출력
//            sjsrv.printSungJuk(sj);
//public class SungJukV4b {
//    //클래스 종류
//    // - vo/DTO :  값만 저장하기 위해 사용하는 클래스
//    //              주로 데이터베이스 테이블의 각열과 연계해서 작성함
//
//    // - Service : 비지니스 로직(처리하는것들 총점 학점 평균 구하는등)을 구성하는 클래스
//    //             데이터 영속화(데이터베이스를 사용한 영구저장) 전에 처리하는 코드들로 구성
//    // -DAo : data access object
//    //데이터 영속화와 관련된 코드들로 구성된 클래스
//    //주로 데이터베이스를 사용해서 데이터를 추가/조회/수정/삭제하는 기능을 작성함
//    //
//    //클래스당 책임은 하나
//    //멤버변수
//    static class SunJuk{}
//}
//    static class SungJuk{
//        private String name;
//        private int kor;
//        private int eng;
//        private int mat;
//        private int tot;
//        private int avg;
//        private int grd;
//
//        //생성자
//        public SungJuk(){}
//
//        public SungJuk(String name, int kor, int eng, int mat) {
//            this.name = name;
//            this.kor = kor;
//            this.eng = eng;
//            this.mat = mat;
//
//
//        }
//    static class SungJukService {
//        //성적 데이터 입력
//        public Sungjuk readSungJuk(){
//            return null;
//        }
//
//
//
//
//
//            //성적처리
//        public void computeSungJuk(Sunjuk sj) {
//            sj.tot = sj.kor + sj.eng + sj.mat;
//            sj.avg = (double) sj.tot / 3
//            switch ((int) sj.avg / 10) {
//                case10:
//                case 9:
//                sj.grd = '수';
//                break;
//                case 8:
//                    sj.grd = '우';
//                    break;
//                case 7:
//                    sj.grd = '미';
//                    break;
//                case 6:
//                    sj.grd = '양';
//                    break;
//                default:
//                    sj.grd = '가';
//            }
//        }
//
//        //결과출력
//        public String printSungJuk(SungJuk sungJuk {})
//        String fmt = "%s %d %d %d \n %d %1f %c\n ";
//        System.out.printf(fmt,sj.name,sj.kor,sj.eng,sj.mat,sj.tot,sj.avg,sj.grd);
//    }









