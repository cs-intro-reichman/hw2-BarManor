//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String AorAN = "";// to determine either "a" or "an"
        Character Letter = ' ';// The current letter being processed
        byte numOfLetters = (byte)args[0].length(); // number of letters in the input word       
        for (byte i = 0; i < numOfLetters; i++) { //a check for each letter in the input word 
        Letter = Character.toUpperCase(args[0].charAt(i));// converting the letter to uppercase to simplify the comparison, pulls a letter from the input word
        if (Letter == 'A' || Letter == 'E' || Letter == 'F' || Letter == 'H' || Letter == 'I' || Letter == 'L' || Letter == 'M' || Letter == 'N' || Letter == 'O' || Letter == 'R' || Letter == 'S' || Letter == 'X') {
            AorAN = "an";
        } else {
            AorAN = "a ";     
        }
        System.out.println("Give me "+AorAN+" "+ Letter +": "+ Letter +"!");
        }        

        System.out.println("What does that spell?");
        for (int j = 0; j < Integer.parseInt(args[1]); j++) { // repeats the final cheer based on the second input argument
            System.out.println(args[0].toUpperCase() + "!!!");
        }
}
}
