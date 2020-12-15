public class App {
    public static void main(String[] args){
       String name = "Lucas";
       Names a = new Names();
       String partner = a.n1();
       String exclaim = addExclamPoint(name);
       System.out.println(exclaim);
       System.out.println(partner);
    }
public static String addExclamPoint(String s) {
    return s +" !";
}

 }
