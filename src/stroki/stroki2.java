
package stroki;

public class stroki2 {
    public static void main(String[] args) {
        String word = new String("java");
        String text = "java is a general-purpose computer-programming language"
                + " that is concurrent, class-based, object-oriented, and"
                + " specifically designed to have as few"
                + " implementation dependencies as possible";
        String[]words=text.split("\\W+");
        System.out.printf("Слов в тексте = %d%n", words.length);
        
        
        for(String w: words){ 
                    System.out.print(w + "; "); 
             } 

                System.out.println("\n-------------"); 

            System.out.printf("Используемем equalsIgnoreCase(%s,%s) = %s%n", word, words[0], word.equalsIgnoreCase(words[0])); 
            System.out.printf("Используемем compareTo(%s,%s) = %s%n", word, words[0], word.compareTo(words[0]));
    }
    
}
