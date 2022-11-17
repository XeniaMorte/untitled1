public class Flower {
    String name;
    private String flowerColor;
    private String country;
    private float cost;
    int lifeSpan;

    public Flower(String name, String flowerColor, String country, float cost, int lifeSpan) {
        this.cost = cost == 0 ? 1 : cost;
        this.flowerColor = flowerColor == null ? "белый" : flowerColor;
        this.country = country == null ? "Россия" : country;
        this.name = name;
        this.lifeSpan = lifeSpan == 0 ? 3 : lifeSpan;

    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public int getCost() {
        return (int) cost;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void infoFlower() {
        System.out.println(" Цветок" + getName() + " " + getCountry() + " " + getFlowerColor() + " " + getCost() + " " + getLifeSpan());
    }

    int countRoza = 2;
    int countHrizantema = 3;
    int countPion = 0;
    int countHipsofila = 1;

    public float buketcountHrizantem() {
        return getCost() * countHrizantema * 1.1f;

    }
    public float buketcountRoza() {
        return getCost() * countRoza * 1.1f;

    }
    public float buketcountPion() {
        return getCost() * countPion * 1.1f;

    }
    public float buketcountHipsophila() {
        return getCost() * countHipsofila * 1.1f;

    }



}


