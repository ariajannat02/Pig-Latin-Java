import java.util.Scanner;

class pigLatinLab {

	public static void main(String[] args) {
		String englishWord=readWord(new Scanner(System.in));
        String pigLatinWord=convertWord(englishWord);
        printResult(englishWord,pigLatinWord);
	 }
    public static String readWord(Scanner console){
        System.out.println("Please enter a word ==> ");
        String englishWord= console.nextLine();
        return englishWord;
    }
    public static String convertWord(String englishWord){
        String pigLatinWord;
        if(isVowel(englishWord.charAt(0)))
        pigLatinWord=englishWord+"-"+"way";
        else if(englishWord.startsWith("th")||englishWord.startsWith("Th")||englishWord.startsWith("tH")||englishWord.startsWith("TH")){
            pigLatinWord=englishWord.substring(2)+"-"+englishWord.substring(0,2)+"ay";
        }
        else
            pigLatinWord=englishWord.substring(1)+"-"+englishWord.charAt(0)+"ay";
        return pigLatinWord;
    }
    public static boolean isVowel(char c){
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
    public static void printResult(String englishWord,String pigLatinWord){
        System.out.println(englishWord+"\n"+
                            " in Pig Latin is "+"\n"
                            +pigLatinWord);

	}

}
