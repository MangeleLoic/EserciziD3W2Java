import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();
        products.add(new Product(11111L, "Culla", "Baby", 228.67));
        products.add(new Product(23322L, "Harry Potter e la pietra filosofale", "Books", 19.50));
        products.add(new Product(22222L, "Harry Potter-Saga completa-", "Books", 119.50));
        products.add(new Product(33333L, "Winds of Winter", "Books", 26.70));
        products.add(new Product(44444L, "Biberon", "Baby", 8.27));
        products.add(new Product(55555L, "Air Jordan 4", "Boy", 350.0));
        products.add(new Product(66666L, "Tutina", "Baby", 13.65));
        products.add(new Product(77777L, "Bracciale", "Boy", 139.99));


        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1L, "Mario Rossi", 1));
        customers.add(new Customer(2L, "Franco Neri", 2));
        customers.add(new Customer(3L, "Maria Verdi", 3));


        Customer customer1 = new Customer(1L, "Mario Rossi", 1);
        Customer customer2 = new Customer(2L, "Franco Neri", 2);
        Customer customer3 = new Customer(3L, "Maria Verdi", 3);


        List<Order> orders = new ArrayList<>();
        orders.add(new Order(11L, "In corso", LocalDate.now(), LocalDate.of(2024, 10, 2), products.subList(0, 3), customer1));
        orders.add(new Order(22L, "Pagato", LocalDate.now(), LocalDate.of(2021, 3, 20), products.subList(3, 6), customer3));
        orders.add(new Order(33L, "In corso", LocalDate.now(), LocalDate.of(2023, 12, 2), products.subList(0, 2), customer2));


        for (Product product : products) {
            System.out.println(product);
        }


        System.out.println("-------Esercizio 1-----");
        products.stream()
                .filter(product -> product.getCategory().equals("Books"))
                .filter(product -> product.getPrice() > 100)
                .forEach(System.out::println);


        System.out.println("-------Esercizio 2-----");
        orders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("Baby")))
                .forEach(System.out::println);


        System.out.println("-------Esercizio 3-----");
        double sconto = 0.10;

        products.stream()
                .filter(product -> product.getCategory().equals("Boy"))
                .forEach(product -> {
                    double prezzoScontato = product.getPrice() - (product.getPrice() * sconto);

                    System.out.println("Prodotto: " + product.getName() +
                            ", Categoria: " + product.getCategory() +
                            ", Prezzo originale: " + product.getPrice() +
                            ", Prezzo scontato: " + prezzoScontato);
                });


        System.out.println("-------Esercizio 4-----");

        orders.stream()
                .filter(order -> order.getCustomer().getTier() == 2)
                .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2021, 1, 31))
                        && order.getOrderDate().isBefore(LocalDate.of(2021, 4, 2)))
                .forEach(System.out::println);

    }
}
