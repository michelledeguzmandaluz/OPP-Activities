public class BookClass {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.setNum(1);
        book1.setTitle("Holy Bible");
        book1.setprice((int) (500.00));

        System.out.println("Book Number:" + book1.getNum());
        System.out.println("Book Title:" + book1.gettitle());
        System.out.println("Book Price:" + book1.getBook_price());
    }    
}

