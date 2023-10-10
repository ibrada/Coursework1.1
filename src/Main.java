public class Main {

    public static boolean palindrom(String word) {
        String wordDefault = word.toLowerCase().replace(" ", "").replace(",", "");
        StringBuilder wordPrepared = new StringBuilder(wordDefault);
        StringBuilder wordReverse = wordPrepared.reverse();

        return (wordReverse.toString().equals(wordDefault));
    }

    public static void main(String[] args) {

        String word = "Wow, Level Wow";
        String word2 = "Ser, yes, ser";

        System.out.println(palindrom(word));
        System.out.println(palindrom(word2));

    }
}