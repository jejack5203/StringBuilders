/******************************************************************************
Jodie Jackson
StringBuilder/StringBuffer

*******************************************************************************/
public class StringBuilders
{
    public static void main(String[] args) {
        StringBuilder X = new StringBuilder("Hello World");
        
        // Print the value and location of StringBuilder X
        System.out.println("Original Value of StringBuilder X: " + X);
        System.out.println("Location of StringBuilder X in Decimal: " + System.identityHashCode(X));
        System.out.println("Location of StringBuilder X in Hexadecimal: " + Integer.toHexString(System.identityHashCode(X)));
        System.out.println(); 

        //copy of x
        StringBuilder Y = new StringBuilder(X); 
        System.out.println("Copy Value StringBuilder Y: " + Y);
        System.out.println("Location of StringBuilder Y in Decimal: " + System.identityHashCode(Y));
        System.out.println("Location of StringBuilder Y in Hexadecimal: " + System.identityHashCode(Y));
        System.out.println();

        Y = new StringBuilder ("Goodbye World");
        System.out.println("Value of X: " + X);
        System.out.println("Location of StringBuilder X in Decimal: " + System.identityHashCode(X));
        System.out.println("Location of StringBuilder X in Hexadecimal: " + System.identityHashCode(X));
        System.out.println();

        System.out.println("Changed Value of Y: " + Y);
        System.out.println("Location of StringBuilder Y in Decimal: " + System.identityHashCode(Y));
        System.out.println("Location of StringBuilder Y in Hexadecimal: " + System.identityHashCode(Y));
        System.out.println();

        //concat without reassigning string
        Y.append(" Again"); 
        System.out.println("Value of Y after concatenating 'Again': " + Y.toString());
        System.out.println("Location of Y after concatenating 'Again' without reassigning in Decimal: " + System.identityHashCode(Y));
        System.out.println("Location of Y after concatenating 'Again' without reassigning in Hexadecimal: " + Integer.toHexString(System.identityHashCode(Y)));
        System.out.println();
        
        // Reassign to a String variable
        Y.append(" Again");
        String concatenatedY = Y.toString(); 
        System.out.println("Value of Y after concatenating 'Again': " + concatenatedY);
        System.out.println("Location of Y after concatenating 'Again' with reassigning in Decimal: " + System.identityHashCode(concatenatedY)); 
        System.out.println("Location of Y after concatenating 'Again' with reassigning in Hexadecimal: " + Integer.toHexString(System.identityHashCode(concatenatedY)));
        System.out.println();

        // Call StringBuilderMethod with X
        StringBuilder Z = StringBuilderMethod(X);
        
        // Print the value and location of StringBuilder X and Z
        System.out.println("Value of X: " + X);
        System.out.println("Location of StringBuilder X in Decimal: " + System.identityHashCode(X));
        System.out.println("Location of StringBuilder X in hexadecimal: " + Integer.toHexString(System.identityHashCode(X)));
        System.out.println();
        System.out.println("Value of Z: " + Z);
        System.out.println("Location of Returned StringBuilder Z in Decimal: " + System.identityHashCode(Z));
        System.out.println("Location of Returned StringBuilder Z in hexadecimal: " + Integer.toHexString(System.identityHashCode(Z)));

       
    }
    
    public static StringBuilder StringBuilderMethod(StringBuilder A) {
        System.out.println("Value of A: " + A);
        System.out.println("Location of A in Decimal: " + System.identityHashCode(A));
        System.out.println("Location of A in Hexadecimal: " + Integer.toHexString(System.identityHashCode(A)));
        System.out.println();

        // Change/replace the value 
        A.replace(0, A.length(), "Adios World");
        System.out.println("Value of A after replacing StringBuilder: " + A);
        System.out.println("Location of A after replacing StringBuilder in Decimal: " + System.identityHashCode(A));
        System.out.println("Location of A after replacing StringBuilder in Hexadecimal: " + Integer.toHexString(System.identityHashCode(A)));
        System.out.println();
     

        // Change/replace it again by setting new StringBuilder value
        A = new StringBuilder("Goodbye World");
        System.out.println("Value of A after changing StringBuilder again: " + A);
        System.out.println("Location of A after changing StringBuilder again in Decimal: " + System.identityHashCode(A));
        System.out.println("Location of A after changing StringBuilder again in Hexadecimal: " + Integer.toHexString(System.identityHashCode(A)));
        System.out.println();
         
      
        // Return string A
        return A;
        
    }
}