package traduttore.src.main.java.com.unibs;

import java.util.ArrayList;

public class TraduttoreTester {
  public static void main(String[] args) {
    if (args.length != 2 || args[0].equals(args[1])) {
      System.err.println("Missing parameters or given both args the same file");
      System.exit(1);
    }
    Traduttore mioTraduttore = new Traduttore();
  }
}

class Traduttore implements DictionaryUD {

  public String toString() {
    return null;
  }

  private ArrayList<WordPair> wordDict= new ArrayList<>();


  @Override
  public boolean isEmpty() {
    return wordDict.isEmpty();
  }

  @Override
  public void makeEmpty() {
    wordDict.clear();
  }

  @Override
  public void insert(Comparable key, Object value) {
    wordDict.add(new WordPair((String) key, (String[]) value));
  }

  @Override
  public void remove(Comparable key) {}

  @Override
  public Object find(Comparable key) {
    return null;
  }

  @Override
  public void update(DictionaryUD newdict) {}

  private class WordPair {
    public WordPair(String word, String[] translations) {
      this.word = word;
      this.translations = translations;
    }

    public String getWord() {
      return word;
    }

    public String[] getTranslations() {
      return translations;
    }

    public String toString() {
      String retString = word + " :";
      for (int i = 0; i < translations.length; i++) retString += " " + translations[i];
      return retString;
    }

    private String word;
    private String[] translations;
  }
}
