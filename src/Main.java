public class Main {
    public static void main(String[] args) {
        Flower roza = new Flower("Роза обыкновенная", "blue", " из Голландии", 35.59f, 1);
        Flower hrizantema = new Flower("Хризантема", "red", "", 15f, 5);
        Flower pion = new Flower("Пион", "og", "Англия", 69.9f, 1);
        Flower hipsophila = new Flower("Гипсофила", "white", "Турция", 19.5f, 10);
        pion.infoFlower();
        System.out.println(pion.buketcountPion()+ hipsophila.buketcountHipsophila()+hrizantema.buketcountHrizantem()+roza.buketcountRoza());
        System.out.println();
    }
//лютые костыли но я не очень поняла как хотели видеть
}