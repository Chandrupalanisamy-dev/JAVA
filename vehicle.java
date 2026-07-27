class vehicle {
    void start(){
        System.out.println("heee");
    }
}
class car extends vehicle{
    public static void main(String[]args){
        car c1=new car();
        car c2=new car();

            c1.start();
            c2.start();
        }
}
    

