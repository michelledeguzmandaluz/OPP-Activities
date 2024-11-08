class Book{
    private int Book_Num;
    private String Title;
    private int price;

    public void setNum(int num){
        this.Book_Num = num;
    }
    public int getNum(){
        return Book_Num;
    }
    public void setTitle(String title){
        this.Title = title;
    }
    public String gettitle(){
        return Title;
    }
    public void setprice (int price){
        this.price = price;
    } 
    public int getBook_price(){
        return price;
    }
    }