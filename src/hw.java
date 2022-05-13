public class hw {
    public static void main(String[] args) {
        Author kir = new Author("Кир ", "Булычёв");
        Author jules = new Author("Жуль", "Верн");
        Book alice = new Book("Путешествие Алисы", kir, 1965);
        Book island = new Book("Таинственный остров", jules, 1875);
        alice.setYear(1966);

    }
}