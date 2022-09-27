public class Array3dimensi
{
  public static void main(String arg[])
  {
    int i,j,k;
    int nilai[][][]={{{1,2,3},{4,5,6},{7,8,9}},
    {{10,11,12},{13,14,15},{16,17,18}}};
    System.out.println("-- Data Array --");
     for(i=0; i<2; i++)
        {
        	for(j=0; j<3; j++)
        	{
        		for (k=0; k<3; k++)
        		{
        			System.out.print(nilai[i][j][k]+" ");
        		}
        		System.out.println(" ");
        	}
        }
        }
}