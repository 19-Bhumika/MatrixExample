import javax.swing.JOptionPane;
class SumMultiply
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int d[][]=new int[3][3];
		int i,j;
		JOptionPane.showMessageDialog(null,"Enter the values in 3*3 array 1:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the value :"));
			}
		}
		JOptionPane.showMessageDialog(null,"Enter the values in 3*3 array 2:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the value :"));
			}
		}
		System.out.print("-----------------------------\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.print("-----------------------------\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.print("-----------------------------\n");
		System.out.print("Addition of matrices:\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					d[i][j]+=a[i][k]*b[k][j];		
				}	
			}
			
		}
		System.out.print("Multiplication of matrices:\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
