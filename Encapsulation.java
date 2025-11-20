class Enc{
 private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
    if(age>0 && age<100){
        this.age= age;
    }else{
        System.err.println("Please enter Age between a specific range 1-100");
    }
    }
}
class Encapsulation{
   public static void main(String [] args){
    Enc e = new Enc();
    e.setName("shubham");
    e.setAge(21);
    System.out.println(e.getAge());
    System.out.println(e.getName());
   }
}
