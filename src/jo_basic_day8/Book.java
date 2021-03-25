package jo_basic_day8;

public class Book {
    private String bkname;
    private String writer;
    private String trlator;
    private String publisher;      //실제 세계를 변수화 시킨거
    private String pubdate;
    private int bkprice;
    private double discount;
    private int saleprice;
    private int point;

    public Book(String bkname, String writer, String trlator, String publisher, String pubdate, int bkprice, double discount) {
        this.bkname = bkname;
        this.writer = writer;
        this.trlator = trlator;
        this.publisher = publisher;
        this.pubdate = pubdate;
        this.bkprice = bkprice;
        this.discount = discount;
    }

    public String getBkname() {
        return bkname;
    }

    public String getWriter() {
        return writer;
    }

    public String getTrlator() {
        return trlator;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPubdate() {
        return pubdate;
    }

    public int getBkprice() {
        return bkprice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setBkname(String bkname) {
        this.bkname = bkname;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setTrlator(String trlator) {
        this.trlator = trlator;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public void setBkprice(int bkprice) {
        this.bkprice = bkprice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
