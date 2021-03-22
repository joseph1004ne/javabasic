package jo_basic_day5;

import java.util.Scanner;

public class CardCheck33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//신용카드의 번호의 첫글잘르 보고 
		//어떤 종류와 은행인지 알려주는 프로그램
		//3:jcb카드
	//4:visa 카드
	//5:Master카드
	
    String cardnum;
    String cardtype="";
    String cardbank="";
    String fmt="카드종류는 %s 이고요, %s 입니다";
    
    Scanner sc= new Scanner(System.in);
    
    System.out.println("카드번호를 입력하세요");
    cardnum=sc.next();
    
//    if (cardnum.charAt(0)=='3')
//    cardtype="JCB카드";
//    else if 
//    (cardnum.charAt(0)=='4')
//    	cardtype="visa카드";
//    else if 
//    (cardnum.charAt(0)=='5')
//    	cardtype="master카드";
//    System.out.println(cardtype);
	
	switch(cardnum.charAt(0)){
		case '3': cardtype="JCB카드";break;
		case '4': cardtype="visa카드";break;
		case '5': cardtype="master카드";break;
	}
//	
//System.out.println(cardtype);
	
switch(cardnum) {
case"356317":cardbank="NH농협카드"; break;
case"356901":cardbank="신한카드"; break;
case"356912":cardbank="kb농협카드"; break;
case"404825":cardbank="비씨카드"; break;
case"438676":cardbank="신한카드"; break;
case"457973":cardbank="국민은행"; break;
case"515594":cardbank="신한카드"; break;
case"524353":cardbank="외한카드"; break;
case"540926":cardbank="국민은행"; break;
}
System.out.printf(fmt,cardtype,cardbank);



}

}
