class person implements Comparable<person>
{
	 private String name;
	 private int age;
	 public person(String name,int age){this.name=name;this.age=age;}
	 public int compareTo(person p){
	 if(this.age>p.age){return 1;}
	 else if(this.age<p.age){return -1;}
	 else{return 0;}
	 }
	 public String toString(){
	 return this.name;
	 }
}
public class testDemo
{
	public static Comparable findMax(Comparable[] arr){
	 int maxIndex=0;
	 for(int i=1;i<arr.length;i++){
	     if(arr[i].compareTo(arr[maxIndex])>0){
		   maxIndex=i;
		 }
	 }
	 return arr[maxIndex];
	}
   public static void main(String[] args){
	person p1=new person("Jack",12);
	person p2=new person("Tom",13);
    person p3=new person("Jerry",15);
    person p4=new person("Marry",19);
	person[] p={p1,p2,p3,p4};
    System.out.print(findMax(p));
   
   }
}