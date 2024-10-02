public class Product {
    private Long id;
    private String name;
    private String category;
    private double price;
    private double prezzoScontato;

    // Constructor that initializes all fields
    public Product(Long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.prezzoScontato = price;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
        // Optionally, update discounted price if needed
    }


    public double getPrezzoScontato() {
        return prezzoScontato;
    }


    public void setPrezzoScontato(double prezzoScontato) {
        this.prezzoScontato = prezzoScontato;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", prezzoScontato=" + prezzoScontato +
                '}';
    }
}
