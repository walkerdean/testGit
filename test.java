class MyException extends Exception
{
	public MyException(String str){System.out.println(str);}
} 
public class test{
 public static void main(String[] args){
    try{test();}catch(MyException e){
	  System.out.println(e.getMessage());  
	}
 }
  static void test() throws MyException{
   throw new MyException("test1");
   }
  }