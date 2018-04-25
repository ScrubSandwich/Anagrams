public class Anagrams {
  public static int calculateProduct(String word) {
    int product = 1;

    for (int i = 0 ; i < word.length(); i++) {
      char c = word.charAt(i);
      int number = getNumber(c);
      product *= number;
    }

    return product;
  }

  public static int getNumber(char c) {
    switch (c) {
      case 'a': return 5;
      case 'b': return 53;
      case 'c': return 59;
      case 'd': return 71;
      case 'e': return 131;
      case 'f': return 151;
      case 'g': return 383;
      case 'h': return 409;
      case 'i': return 541;
      case 'j': return 601;
      case 'k': return 659;
      case 'l': return 733;
      case 'm': return 809;
      case 'n': return 863;
      case 'o': return 1013;
      case 'p': return 1223;
      case 'q': return 1373;
      case 'r': return 1451;
      case 's': return 1511;
      case 't': return 1657;
      case 'u': return 1733;
      case 'v': return 1811;
      case 'w': return 1987;
      case 'x': return 2129;
      case 'y': return 2213;
      case 'z': return 2423;
      default:  return 0;
    }
  }

  public static void isAnagram(int p1, int p2) {
    if (p1 == p2) {
      System.out.println("Anagrams");
    } else {
      System.out.println("Not anagrams");
    }
  }

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Usage: java Anagrams [word1] [word2]");
      System.exit(0);
    }

    String word1 = args[0].toLowerCase();
    String word2 = args[1].toLowerCase();

    int product1 = calculateProduct(word1);
    int product2 = calculateProduct(word2);

    if (product1 == 0 || product2 == 0) {
      System.out.println("You entered a word with a number in it! Please enter words only");
      System.exit(0);
    }

    isAnagram(product1, product2);
  }
}