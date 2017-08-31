public class  Singleton  
{  
    public static Singleton s=new Singleton();  
    public static int k1;  
    public static int k2=0;  
      
    private  Singleton(){  
        k1++;  
        k2++;  
    }  
      
  
  
    public static void main(String[] args)   
    {  
        System.out.println(Singleton.k1);  
        System.out.println(Singleton.k2);  
          
    }  
}  