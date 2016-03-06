

public class Solution
{

		/**将字符串转换成整数*/
		public int StrToInt(String str){
	        int result=0;
	        
	        if(str.equals("")||str.length()==0)
	        {
	        	return 0;
	        }
	        
	        char[] array=str.toCharArray();
	        
	        for(int i=((array[0]=='-'||array[0]=='+')?1:0);i<array.length;i++)
	        {
	        	if(array[i]<'0'||array[i]>'9')
	        	{
	        		return 0;
	        	}
	        	result=result*10+array[i]-'0';
	        	
	        }
	        result=array[0]=='-'?result*-1:result;
	        return result;       
		}
	}