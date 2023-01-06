//	Java program to make frequency count of vowels, constants, special symbols and digits in text

import java.util.Scanner;
class FrequencyCount 
{
	public static void main(String[] args)
	{
		int vowel_count;
		String text;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the text to find out the total number vowels, consonants,special symbols and digits");
		text=obj.nextLine();
		String str=text.toLowerCase();
		int digits[]=new int[]{0,1,2,3,4,5,6,7,8,9};
		char vowels[]=new char[]{'a','e','i','o','u'};
		vowel_count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(str.charAt(i)==vowels[j])
				{
					vowel_count++;
				}
			}
		}
		System.out.println(vowel_count);
		int consonants_count=0;
		for(int i=0;i<str.length();i++)
		{
			int flag=0;
			if(str.charAt(i)!=' ')
			{
					for(int j=0;j<5;j++)
					{
						if(str.charAt(i)==vowels[j])
						{
							flag=1;
							break;
						}
					}
					if(flag==0)
					{
						int temp=0;
						for(int k=0;k<=10;k++)
						{
							if(str.charAt(i)==digits[k])
							{
								temp=1;
								break;
							}
						}
						if(temp==0)
						{
							consonants_count++;
						}
					}
			}
			System.out.println(consonants_count);
		}
	}	
}
