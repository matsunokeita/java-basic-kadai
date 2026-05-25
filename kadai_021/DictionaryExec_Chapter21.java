package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
        
        dictionary.createDictionary();
        
        String[] targetWords = {"apple", "banana", "grape", "orange"};
        
        dictionary.searchWords(targetWords);
    }
}
