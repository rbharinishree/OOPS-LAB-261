public class shop{
      public static void main (String[] args){
            int itema=200,itemb=75,itemc=230;
            double price;
            price=((itema*2)+(itemb*3)+(itemc));
            price=price-(.1*price);
            price=price*0.75;
            System.out.println("price="+price);
          }
}