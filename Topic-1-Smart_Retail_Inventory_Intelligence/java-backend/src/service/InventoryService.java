package service;
import model.Product;
public class InventoryService {
    public Product searchByProductId(Product products[],String targetProductID){
        for(int i = 0; i < products.length; i++){
            if(products[i].getProductID().equals(targetProductID)){
                return products[i];
            }
        }
        return null;
    }
    public Product searchByProductName(Product products[], String targetProductName){
        for(int i = 0; i < products.length; i++){
            if(products[i].getProductName().equals(targetProductName)){
                return products[i];
            }
        }
        return null;
    }

    public void displayLowStockProducts(Product products[], int threshold){
        for(int i = 0; i < products.length; i++){
            if(products[i].getStockQuantity() <= threshold){
                System.err.println(products[Integer.compareUnsigned(i, i)]);
            }
        }
    }

    public void displayHighDemandProducts(Product[] products, int threshold) {

        for (Product product : products) {

            if (product.getUnitsSold() >= threshold) {
                System.out.println(product);
            }
        }
    }
}
