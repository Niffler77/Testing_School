package Workbooks.Testverfahren;

public class PalindromSven {

    public static void main(String[] args)
    {
        String[] words = {"Kajak", "laufen", "Level", "test", "Lagerregal", "rentner","nenner", "example"};
        int palindromeCount = 0;

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reversed = "";

            for (int j = word.length() - 1; j >= 0; j--)
            {
                reversed += word.charAt(j);
            }

            if (word.equalsIgnoreCase(reversed)) {
                palindromeCount++;
            }
        }

        System.out.println("Anzahl der Palindrome: " + palindromeCount);
    }

}
