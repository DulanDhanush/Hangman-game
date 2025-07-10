import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] Args){

        String filepath = "src\\resource.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while((line = reader.readLine()) !=null){
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not found the file!");
        } catch (IOException e){
            System.out.println("Something went wrong!");
        }

        Random random = new Random();

        if (words.isEmpty()) {
         System.out.println("No words found in file. Make sure txt file exists and is not empty.");
            return;
            }


        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("****************************");
        System.out.println("Welcome to hangman game!");
        System.out.println("****************************");

        System.out.print("Word:");

        while(wrongGuess < 6){

            System.out.println(getArt(wrongGuess));

        for (char c : wordState) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Guess a letter: ");
        char guess = scanner.next().toLowerCase().charAt(0);

        if(word.indexOf(guess) >=0){

            System.out.println("Correct!");
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i)==guess){
                    wordState.set(i, guess);
                }
                
            }
            if(!wordState.contains('_')){
                System.out.println(getArt(wrongGuess));
                System.out.println("You Won!");
                System.out.println("The word was: " + word);
                break;
            }
        }
        else{
            wrongGuess++;
            System.out.println("Wrong!");
        }
    }
    if(wrongGuess >= 6){
        System.out.println(getArt(wrongGuess));
        System.out.println("Game over!");
        System.out.println("The word was: " + word);
    }

        scanner.close();
    }
    static String getArt(int wrongGuess){
        return switch(wrongGuess){
            case 0 ->"""
                    


                    """;
                    case 1 ->"""
                            o


                            """;
                            case 2 ->"""
                                    o
                                    |

                                    """;
                                    case 3 ->"""
                                        o
                                       /|

                                            """;
                                            case 4 -> """
          o
         /|\\                                  

                                                    """;
                                                    case 5 -> """
                                                            o
                                                           /|\\
                                                           /
                                                            """;
                                                            case 6 -> """
                                                                    o
                                                                   /|\\
                                                                   / \\
                                                                    """;
                                                                    default-> "";
        };
    }
}
