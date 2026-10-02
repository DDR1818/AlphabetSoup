public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters = " ";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    //either creates or adds to letters    
    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        return letters.charAt((int)Math.random()*(letters.length()));
    //Gets a random number that represents a specific letter    
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        return letters.substring(0,letters.length()/2) + company + letters.substring(letters.length()/2);
    //Puts company inside the middle of the letter    
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        System.out.println(letters.replaceFirst("[aeiou]",""));
    //Gets rid of the first vowel    
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        int index = (int)(Math.random()*(letters.length()-num+1));
        letters = letters.substring(0,index) + letters.substring(index+num);
    //Gets rid of a random amount of characters    
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        letters = letters.replaceFirst(word,"");
    //Gets rid of the word word    
    }
}
