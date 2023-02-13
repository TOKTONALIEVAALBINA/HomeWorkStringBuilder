public class Alphabet {
    private String letters;
    private String numbers;

    public Alphabet(String letters, String numbers) {
        this.letters = letters;
        this.numbers = numbers;
    }

    public Alphabet() {

    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Alphabet" +
                "letters : " + letters  +
                " numbers : " + numbers ;
    }
}
