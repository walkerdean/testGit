
public class test {
 public static Comparable findMax(Comparable [] arr){
  int maxIndex=0;
  for(int i=1;i<arr.length;i++)
     if(arr[i].compareTo(arr[maxIndex])>0)
        maxIndex=i;
        return arr[maxIndex];
  }
 public static void main(String[] args){
  String [] str={"Joe","BOb","Bill","Clerk","David","Marry"};
  person p1=new person();
  person p2=new person();
  p1.setName("Jack");
  p1.setAge(12);
  p2.setName("Tom");
  p2.setAge(15);
  person [] p={p1,p2};
  System.out.println(findMax(str));
  System.out.println(findMax(p));
  }
}
class person implements Comparable<person>
{
	public String name;
	public int age;
	public person(){};
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
	return name;
	}
	public int getAge(){
	return age;
	}
	public String toString(){
	return this.name+"->"+this.age;
	}
	public int CompareTo(person p){
	if(this.age>p.age){return 1;}
	else if(this.age<p.age){return -1;}
	else{return 0;}
	}
}