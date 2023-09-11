package Part_2;
import java.util.Scanner;

//print "input name"
//Ask to input name
//Call function outputUserBook()
//Ask to input age
//Ask to input favourite book genre
//put genre to uppercase
//check if age is correct
//check if genre is correct
//if age is between 0 and 7,open switch case with genre options
//if age is between 8 and 20, open if statement with genre options
//if age is bigger than 20, open if statement with genre options
//Call function askUserContinue()
//for endless askif user wants to continue
//if print "y" or "Y" - repeat function outputUserBook();
//if print "n" or "N" - end the program
//else - shut down the program
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Input your name!");
        String name = scan.nextLine();
        outputUserBook();
        askUserContinue();
    }
    //Here we ask user to input his age
    public static int inputAge(){
        System.out.println("Input your age!");
        int age = scan.nextInt();
        scan.nextLine();
        while (age < 0 || age > 120) {
            System.out.println("Wrong age, please repeat!");
            age = scan.nextInt();
        }
        return age;
    }
    //Here we ask user to input his favourite book genre
    public static String inputGenre(){
        System.out.println("Input your favourite book genre!");
        String genre = scan.nextLine();
        genre = genre.toUpperCase();
        while (!genre.contains("FIC") && !genre.contains("BIO") && !genre.contains("POE") && !genre.contains("FAN")) {
            System.out.println("Wrong genre, please repeat!");
            genre = scan.nextLine();
            genre = genre.toUpperCase();
        }
        return genre;
    }
    //This function outputs UserBook list
    public static void outputUserBook(){
        int age = inputAge();
        String genre = inputGenre();
        if(age > 0 && age < 7){
            switch (genre){
                case "FICTION":
                    System.out.println("Try reading \n" +
                            "Beatrix Potter, The Tale of Peter Rabbit. \n" +
                            "A. A. Milne, Winnie-the-Pooh. \n" +
                            "C. S. Lewis, The Lion, the Witch and the Wardrobe. \n" +
                            "E. B. White, Charlotte's Web. \n" +
                            "Roald Dahl, Charlie and the Chocolate Factory. \n" +
                            "J. K. Rowling, Harry Potter and the Philosopher's Stone.");
                    break;
                case "BIOGRAPHY":
                case "AUTOBIOGRAPHY":
                    System.out.println("Try reading \n" +
                            "Boy: Tales of Childhood by Roald Dahl \n" +
                            "Counting the Stars: The Story of Katherine Johnson, NASA Mathematician by Lesa Cline-Ransome.\n" +
                            "Becoming: Adapted for Younger Readers by Michelle Obama \n" +
                            "Six Dots: A Story of Young Louis Braille by Jen Bryant\n" +
                            "Portrait of an Artist: Frida Kahlo by Lucy Brownridge \n" +
                            "Greta's Story: The Schoolgirl Who Went On Strike To Save The Planet by Valentina Camerini");
                    break;
                case "POETRY":
                case "POEMS":
                case "POEM":
                    System.out.println("Try reading \n" + "Life Doesn't Frighten Me by Jean-Michel Basquiat \n" +
                            "Macavity: The Mystery Cat by Thomas Sternz \n" +
                            "Spi-ku: A Clutter of Short Verse on Eight Legs by Lesi Bublion");
                    break;
                case "FANTASY":
                    System.out.println("Try reading \n " +
                            "Harry Potter and the Philosopher's Stone by JK Rowling.\n" +
                            "The Hobbit by JRR Tolkien.\n" +
                            "Northern Lights by Philip Pullman.\n" +
                            "The Earthsea Quartet by Ursula Le Guin. ...\n" +
                            "The Lion The Witch And The Wardrobe by CS Lewis.\n" +
                            "Alice's Adventures in Wonderland by Lewis Carroll.");
                default:
                    System.out.println("Sorry, we cannot suggest you a book.");
            }
        } else if (age > 8 && age < 20) {
            if(genre.contains("FIC")){
                System.out.println("Try reading \n " +
                        "The Kite Runner By Khaled Hossieni.\n" +
                        "Norwegian Wood by Haruki Murakami.\n" +
                        "The Perks of Being a Wallflower by Stephen Chobosky.\n" +
                        "To Kill a Mockingbird by Harper Lee.\n" +
                        "Life of Pi By Yann Martel.\n" +
                        "One Hundred Years of Solitude by Gabriel Garcia Marquez.\n" +
                        "Eat That Frog! ...\n" +
                        "Jane Eyre by Charlotte Bronte.");
            }
            else if(genre.contains("BIO")){
                System.out.println("Try reading \n " +
                        "Steve Jobs by Walter Isaacson\n" +
                        "Wings of Fire: Autobiography of Dr APJ Abdul Kalam\n" +
                        "The Diary of a Young Girl by Anne Frank\n" +
                        "Gandhi Before India Ramachandra Guha");
            }
            else if(genre.contains("POE")){
                System.out.println("Try Reading \n" + " The Complete Sonnets and Poems by William Shakespeare \n" +
                        "John Donne's Poetry by John Donne \n" +
                        "Lyrical Ballads by William Wordsworth (1770–1850) and Samuel Taylor Coleridge \n" +
                        "Selected Poetry by John Keats \n" +
                        "Leaves of Grass by Walt Whitman ");
            } else if (genre.contains("FAN")) {
                System.out.println("Try reading \n A Game Of Thrones by George RR Martin.\n" +
                        "The Colour Of Magic by Terry Pratchett (The Discworld Series)\n" +
                        "The Lord of the Rings by JRR Tolkien.\n" +
                        "Jonathan Strange & Mr Norrell by Susanna Clarke.\n" +
                        "The Name of the Wind by Patrick Rothfuss (The Kingkiller Chronicle)");
            }
            else {
                System.out.println("Sorry, we cannot suggest you a book.");
            }
        }
        else{
            if(genre.contains("FIC")){
                System.out.println("Try reading \n " +
                        "The Kite Runner By Khaled Hossieni.\n" +
                        "Norwegian Wood by Haruki Murakami.\n" +
                        "The Perks of Being a Wallflower by Stephen Chobosky.\n" +
                        "To Kill a Mockingbird by Harper Lee.\n" +
                        "Life of Pi By Yann Martel.\n" +
                        "One Hundred Years of Solitude by Gabriel Garcia Marquez.\n" +
                        "Eat That Frog! ...\n" +
                        "Jane Eyre by Charlotte Bronte.");
            }
            else if(genre.contains("BIO")){
                System.out.println("Try reading \n " +
                        "Steve Jobs by Walter Isaacson\n" +
                        "Wings of Fire: Autobiography of Dr APJ Abdul Kalam\n" +
                        "The Diary of a Young Girl by Anne Frank\n" +
                        "Gandhi Before India Ramachandra Guha");
            }
            else if(genre.contains("POE")){
                System.out.println("Try Reading \n" + " The Complete Sonnets and Poems by William Shakespeare \n" +
                        "John Donne's Poetry by John Donne \n" +
                        "Lyrical Ballads by William Wordsworth (1770–1850) and Samuel Taylor Coleridge \n" +
                        "Selected Poetry by John Keats \n" +
                        "Leaves of Grass by Walt Whitman ");
            } else if (genre.contains("FAN")) {
                System.out.println("Try reading \n A Game Of Thrones by George RR Martin.\n" +
                        "The Colour Of Magic by Terry Pratchett (The Discworld Series)\n" +
                        "The Lord of the Rings by JRR Tolkien.\n" +
                        "Jonathan Strange & Mr Norrell by Susanna Clarke.\n" +
                        "The Name of the Wind by Patrick Rothfuss (The Kingkiller Chronicle)");
            }
            else {
                System.out.println("Sorry, we cannot suggest you a book.");
            }
        }
    }
    //This function asks if User wants to continue using the program
    public static void askUserContinue(){
        for(int i = 0; ;i++){
            System.out.println("Do you want to continue?");
            String choice = scan.nextLine();
            if(choice.equals("Y") || choice.equals("y")){
                outputUserBook();
            } else if (choice.equals("N") || choice.equals("n")) {
                System.out.println("Thanks for using program!");
                break;
            }
            else {
                System.out.println("shutting down");
                break;
            }
        }
    }
}
