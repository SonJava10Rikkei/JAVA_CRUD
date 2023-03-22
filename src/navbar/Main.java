package navbar;

import config.Config;
import model.Product;
import service.Service;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        productList.add(new Product(10,"Son",12,100,"blue","GuTrend"));
        productList.add(new Product(9,"long",2,100,"red","fgdg"));
        productList.add(new Product(20,"Huy",42,100,"yellow","aaaa"));
        productList.add(new Product(30,"Hong",52,100,"blue","gfgfg"));

        int choice;
        do {
            System.out.println("1. Show all product list");
            System.out.println("2. add product");
            System.out.println("3. edit product ");
            System.out.println("5. delete product");
            System.out.println("0. Thoat");
            System.out.println("Moi chon lai");
            choice = Config.getScanner().nextInt();
            switch (choice) {
                case 1:
                    System.out.println(productList);
                    break;
                case 2:
                    Service.addProduct();
                    break;
                case 3:
                    Service.editProduct();
                    break;
                case 4:
                    Service.deleteById();
                    break;
                default:
                    System.out.println("hay choi lai");
            }
        } while (choice != 0);
    }
}