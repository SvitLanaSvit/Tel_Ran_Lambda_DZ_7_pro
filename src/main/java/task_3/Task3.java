package task_3;

public class Task3 {
    public static void main(String[] args) {
        String ss = "KikJhYggfTgf";
        long lowerCharsCount = 0;
        long upperCharsCount = 0;
        if(ss.matches("^([A-Za-z]+)$")){
            lowerCharsCount = ss.chars()
                    .filter(e -> Character.isLetter(e))
                    .filter(c -> c - Character.toLowerCase(c) == 0)
                    .count();
            upperCharsCount = ss.length() - lowerCharsCount;
        }
        else{
            lowerCharsCount = ss.chars()
                    .filter(e -> Character.isLetter(e))
                    .filter(c -> c - Character.toLowerCase(c) == 0)
                    .count();
            upperCharsCount = ss.chars()
                    .filter(e -> Character.isLetter(e))
                    .filter(c -> c - Character.toUpperCase(c) == 0)
                    .count();
        }

        System.out.println("Count of lower chars = " + lowerCharsCount);
        System.out.println("Count of upper chars = " + upperCharsCount);
    }
}
