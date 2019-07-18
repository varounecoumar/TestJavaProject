
public class findSumPair {

	public static void main(String[] args) {
		int ary[] = {1,2,3,4,5,6,7,8,9,10};
		int val = 10;
		int temp=0;
		for(int i=0;i<ary.length;i++)
		{
			for(int j=i+1;j<ary.length;j++)
			{
			temp = 0;
			temp = ary[i]+ary[j];
			//System.out.println(temp);
			if(temp == val)
				System.out.println(ary[i]+"+"+ary[j]+"="+val);
			}
		}
	}
}
