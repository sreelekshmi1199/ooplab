import java.util.Scanner;
class arrayasc {
    public static void main(String[] args) {
        int n, temp;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        n = reader.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = reader.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + " ");
        }
    }
}
