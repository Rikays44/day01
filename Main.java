import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<String> cart = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    while(true){
      System.out.print(">");
      String input = sc.nextLine().trim();
      if (input.startsWith("List")){
        getList(cart);
      }
     else if (input.startsWith("add")){
       addItem(input, cart);
      }
      else if (input.startsWith("delete")){
       removeItem(input, cart);
      }else if(input.startsWith("exit")){
        exit(input);
        break;
      }else{
        System.out.println("invalid command");
      }


    }

  }

  public static void getList(List<String> list){
    if(list.isEmpty()){
      System.out.println("Cart is empty");
    }
    for(int i = 0; i < list.size(); i++){
      System.out.println((i+1) +"."  + " " +list.get(i));
    }
  }
   public static void addItem(String plus, List<String> listadd){
  String[] plus1 = plus.substring(4).split(",");
  for(String plus2 : plus1){
   if (!listadd.contains(plus2)){
    System.out.println(plus2 + " added to cart!");
    listadd.add(plus2);
   } else{
    System.out.println("item already in cart!");
   }
  }
  }
  public static void removeItem(String delete, List<String> x){
    String delete1 = delete.substring(7);
    if (delete1.matches("\\d+")){
    Integer delete2 = Integer.parseInt(delete1);
    String removeitem = x.remove(delete2-1);
      System.out.println(removeitem + " deleted from cart");
      
    }else{
    System.out.println("item not in cart");
    }
    }
    public static void exit(String x){
      System.out.println("thanks for shopping with us!");

    } 
  }



  
