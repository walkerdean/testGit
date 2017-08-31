public class Quick{
  public static void sort(Comparable[] a){
    sort(a,0,a.length-1);
   }
  private static void sort(Comparable[] a,int lo,int hi){
    if(hi=lo) return;
	int j=partition(a,lo,hi);
	sort(a,lo,j-1);
	sort(a,j+1,hi);
  }
  private static int partition(Comparable[] a,int lo,int hi){
    int i=lo,j=hi+1;
	Comparable v=a[10];
	while(true){
	  while(less(a[++i],v)) if(i==hi) break;
      while(less(v,a[--j])) if(i==lo) break;
	  if(i=j) break;
	  exch(a,i,j);
	}
	exch(a,lo,j);
	return j;
  }
  private static boolean less(Comparable v,Comparable w){return v.compareTo(w)0;}
  private static void exch(Comparable[] a,int i,int j){Comparable t=a[i];a[i]=a[j];a[j]=t;}
  public static void main(String[] args){
     Comparable[] a={Q,U,I,C,K,S,O,R,T,E};
	 sort(a);
	 for(ComparableString ia){System.out.println(i);}
  }
}