//Feedback:
// really good work, very well commented and very clear that you 
// put time into understanding the logic
// Here are some tips to improve:
// 1. as a convention we never write a variable name starting with the upper case 
// 2. as a clean coding practice always add spaces around operators
// 3. Don't be scared to space out your code more, we rather prefer a code that looks longer,
// but more clean and spaced out, than less lines but everything crumbled together
// 4. indentation is important! very important! for improving code readability, do not neglect it
// 5. When wanting to comment on loops/if statements/some operration we should write comment at the top rather then next to it
// when we want to comment on variable declaration/initialization it's fine to do it next to it
// I've left a comment in the bottom on how spaced out your code should look
// But again, good job! I'm not trying to discorouge you in any way, I just want you to write the best code!
// 

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
/*
public static void main(String[] args) {
    String AorAN = ""; // to determine either "a" or "an"
    Character Letter = ' '; // The current letter being processed
    byte numOfLetters = (byte) args[0].length(); // number of letters in the input word

    // A check for each letter in the input word
    for (byte i = 0; i < numOfLetters; i++) {
        // Convert the letter to uppercase to simplify the comparison
        Letter = Character.toUpperCase(args[0].charAt(i));

        if (Letter == 'A' || Letter == 'E' || Letter == 'F' || Letter == 'H' || Letter == 'I'
                || Letter == 'L' || Letter == 'M' || Letter == 'N' || Letter == 'O'
                || Letter == 'R' || Letter == 'S' || Letter == 'X') {
            AorAN = "an";
        } else {
            AorAN = "a";
        }

        System.out.println("Give me " + AorAN + " " + Letter + ": " + Letter + "!");
    }

    System.out.println("What does that spell?");

    // Repeats the final cheer based on the second input argument
    for (int j = 0; j < Integer.parseInt(args[1]); j++) {
        System.out.println(args[0].toUpperCase() + "!!!");
    }
}

 */
