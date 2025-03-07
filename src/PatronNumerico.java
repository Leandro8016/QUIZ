import java.util.Scanner;  

public class PatronNumerico {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Por favor ingrese un número entero positivo n: ");  
        int n = scanner.nextInt();  

        for (int i = n; i >= 1; i--) {    
            for (int j = 1; j <= n - i; j++) {  
                System.out.print("  ");  
            }  
            for (int j = i; j <= n; j++) {  
                System.out.print(j + " ");  
            }  
            for (int j = n - 1; j >= i; j--) {  
                System.out.print(j + " ");  
            }    
            System.out.println();  
        }  
        scanner.close();  
    }  
}  