interface Menu{
    public void print(int menu);
};

class oldMenu implements Menu{
    @Override
    public void print(int menu){
        System.out.println("Old menu: ");
        System.out.println(menu);
    }
};

// Integrating the old menu to use this
class newMenuObject{
    public void print(String menu){
        System.out.println(menu);
    }
};


class adaptedMenu implements Menu{
    newMenuObject newUI = new newMenuObject();

    @Override
    public void print(int menu){
        System.out.println("NEW menu: ");
        String convert = Integer.toString(menu);
        newUI.print(convert);
    }
};

public class adapter {
    public static void main(String[] args) {
      oldMenu s1 = new oldMenu();
      newMenuObject s2 = new newMenuObject();

      String rice = "Fried rice";
      int order = 1011;

      s1.print(order);
      s2.print(rice);
    
        //S1 cannot print rice, so we use the adapter
        adaptedMenu s3 = new adaptedMenu();
        s3.print(order); //however, order is now a string
    }
}
