package CodingPractice2;

public class InstanceVeriables {
String name;
String address;
static String city="pune";
static int i=0;

public InstanceVeriables(String name, String address)
{
    this.name=name;
    this.address=address;
    //this.city=city;
    i++;
    System.out.println(i);
}
public static String toGetData()
    {
        System.out.println(city);
        return i+" "+city ;
    }
public void display()
{
   System.out.println(address+" " +city);
   // return name+" "+address+" "+city;


}

public static void main(String[] args) {
    InstanceVeriables obj=new InstanceVeriables("Triveni","baner");
    InstanceVeriables obj1=new InstanceVeriables("Samaya","pashan");

  obj.display();
   obj1.display();
   InstanceVeriables.toGetData();



}
}
