
public class Main {

    public static void main(String[] args) {
        String sentence = "hello everyone my name is mehdi";
        int number = 8;

        String result = wordFinder(sentence, number);
        System.out.println(result);
        String number1 = "123456";
        boolean searchForEven = true;

        int result1 = oddEvenCounter(number1, searchForEven);
        System.out.println("Result1: " + result1);


        String wordA = "Ali";
        String wordB = "Mehdi";

        String result2 = firstWord(wordA, wordB);
        System.out.println("Result2: " + result2);

        String sentence1 = "Welcome To Iran";
        String word = "Iran";
        String newWord = "France";

        String result3 = wordCensor(sentence1, word, newWord);
        System.out.println("Result3: " + result3);

        String firstName = "MeHDi";
        String lastName = "hAFEzI";

        String result4 = normalizingName(firstName, lastName);
        System.out.println("Result4: " + result4);

        String word1 = "Hossein";
        String result5 = removeConsecutiveDuplicates(word1);
        System.out.println("Result5: " + result5);

    }
    public static String wordFinder(String sentence, int number) {
        String[] words = sentence.split("\\s+");

        if (number >= 1 && number <= words.length) {
            return words[number - 1];
        } else {
            return "Invalid number";
        }
    }

    public static int oddEvenCounter(String number1, boolean searchForEven) {
        int count = 0;

        for (int i = 0; i < number1.length(); i++) {
            char digitChar = number1.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            if ((searchForEven && digit % 2 == 0) || (!searchForEven && digit % 2 != 0)) {
                count++;
            }
        }

        return count;
    }

    public static String firstWord(String wordA, String wordB) {
        int minLength = Math.min(wordA.length(), wordB.length());

        for (int i = 0; i < minLength; i++) {
            char charA = wordA.charAt(i);
            char charB = wordB.charAt(i);

            if (charA < charB) {
                return wordA;
            } else if (charA > charB) {
                return wordB;
            }
        }

        return (wordA.length() < wordB.length()) ? wordA : wordB;
    }

    public static String wordCensor(String sentence1, String word, String newWord) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence1.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                result.append(newWord);
            } else {
                result.append(words[i]);
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static String normalizingName(String firstName, String lastName) {
        String normalizedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String normalizedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        // Combine the first name and last name with a space in between
        String fullName = normalizedFirstName + " " + normalizedLastName;

        return fullName;
    }

    public static String removeConsecutiveDuplicates(String word1) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word1.length(); i++) {
            char currentChar = word1.charAt(i);

            if (i == 0 || currentChar != word1.charAt(i - 1)) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}



