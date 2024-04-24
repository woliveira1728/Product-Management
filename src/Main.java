import exceptions.NegativePriceException;
import product.ProductController;
import product.ProductModel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            ProductModel product = new ProductModel();

            System.out.print("Nome do produto: ");
            String name = scanner.nextLine();
            product.setName(name);

            System.out.print("Preço do produto (em centavos): ");
            int price = scanner.nextInt();
            product.setPriceInCents(price);

            System.out.print("Quantidade em estoque: ");
            int stock = scanner.nextInt();
            product.setStock(stock);

            try {
                System.out.println(controller.create(product));
            } catch (NegativePriceException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Deseja registrar outro produto? (s/n): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
            scanner.nextLine();
        }

        scanner.close();

        System.out.println("Produtos registrados:");
        System.out.println(controller.read());

    }
}