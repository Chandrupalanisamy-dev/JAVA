class Employee{
    void work(){
        System.out.println("Employee is Working");
    }
}
class Developer extends Employee{
    void code(){
        System.out.println("Developer is coding");
    }
    public static void main(String[]args){
        Developer e1=new Developer();
       
        e1.work();
        e1.code();
    }
}