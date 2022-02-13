import java.sql.DriverPropertyInfo;

public class Main {
    public static Book[] bookList;

    public static void main(String[] args) {
//        Book book1 = new Book("Sgk","GDDT",100,10,200);
//        Book book2 = new Book("Sgk2","GDDT",100,10,200);
    bookList = new Book[5];
    bookList[0]=new Book("Sgk1","GDDT",100,10,200);
    bookList[1]=new Book("Sgk2","GDDT",120,12,210);
    bookList[2]=new Book("Sgk3","GDDT",110,8,220);
    bookList[3]=new Book("Sgk4","GDDT",115,10,230);
    bookList[4]=new Book("Sgk5","GDDT",125,10,250);
    String bookName = "Sgk2";
    searchBook(bookName);
    }
    static  void searchBook(String bookName){
        int index = indexOfBook(bookName);
        if(index==-1){
            System.out.printf("%s not found",bookName);
        }
        else {
            System.out.printf("%s found. Price: %d. %d left.",bookName,bookList[index].getPrice(),bookList[index].getQuantity());

        }
    }
    static int indexOfBook(String bookName){
        int index = -1;
        for (int i = 0; i < bookList.length; i++) {
            if(bookName==bookList[i].getName()){
index=i;
break;
            }
        }
        return index;
    }
}
