package service;

import config.Config;
import model.Product;
import navbar.Main;

public class Service {
    public static Product createProduct() {
        System.out.println("Input product infor");
        System.out.println("Enter a ID");
        int id = Config.getScanner().nextInt();
        System.out.println("name");
        String name = Config.getScanner().nextLine();
        System.out.println("price");
        double price = Config.getScanner().nextDouble();
        System.out.println("quantity");
        long quantity = Config.getScanner().nextLong();
        System.out.println("color");
        String color = Config.getScanner().nextLine();
        System.out.println("brand");
        String brand = Config.getScanner().nextLine();
        return new Product(id, name, price, quantity, color, brand);
    }


    public static void addProduct() {
        Main.productList.add(createProduct());
    }

    public static void editProduct() {
        System.out.println("Enter id of product you want to edit");
        int id = Config.getScanner().nextInt();
        int index = findIndexById(id);
        Product product =  createProduct();
        product.setId(id);
        if (index != -1) {
            Main.productList.set(index, product);
        }
    }

    public static int findIndexById(int id) {
        for (int i = 0; i < Main.productList.size(); i++) {
            if (id == Main.productList.get(i).getId()) {
                return i;
            }
        }
        System.out.println("Cannot find this product in list");
        return -1;
    }

    public static void deleteById() {
        System.out.println("Enter Id of product you want to delete");
        int id = Config.getScanner().nextInt();
        int index = findIndexById(id);
        if (index != -1) {
            Main.productList.remove(index);
        }
    }
}
