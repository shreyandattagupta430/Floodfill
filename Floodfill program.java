package APNIKAKSA;
public class floodFill
{
    static int rows=8;
    static int cols=7;
    static int count=0;
    public static void main(String[] args)
    {
        int a[][]={{1,1,1,1,1,1,1,1},
                   {1,1,1,1,1,1,0,0},
                   {1,2,2,2,2,0,1,0},
                   {1,1,2,2,2,0,1,0},
                   {1,1,1,2,2,2,2,0},
                   {1,1,1,1,1,2,1,1},
                   {1,1,1,1,1,2,2,1},
                };
                floodFill(a,4,3,3,2);
                System.out.println(count);
                System.out.println("Updated screen after call to floodFill: ");
    for (int i = 0; i <= rows; i++)
    {
        for (int j = 0; j <= cols; j++)
        System.out.print(a[i][j] + " ");
        System.out.println();
    }
    }
   static void floodFill(int a[][],int r,int c,int toFill,int prevFill)
   {
       count++;
       int rows=a.length;
       int cols=a[0].length;
       if(r<0 || r>=rows || c<0 || c>=cols)
       {
           return;
        }
        if(a[r][c] != prevFill)
        {
            return;
        }
        a[r][c]=toFill;
        floodFill(a,r-1,c,toFill,prevFill);//top
        floodFill(a,r,c-1,toFill,prevFill);//LEFT
        floodFill(a,r+1,c,toFill,prevFill);//BOTTOM
        floodFill(a,r,c+1,toFill,prevFill);//RIGHT
    }
}
