package model;

public class Product {
        private String productID;
        private String productName;
        private String category;
        private double price;
        private int stockQuantity;
        private int unitsSold;

        // Constructor to initialize all product fields
        public Product(String productID, String productName, String category, double price, int stockQuantity, int unitsSold) {
                this.productID = productID;
                this.productName = productName;
                this.category = category;
                this.price = price;
                this.stockQuantity = stockQuantity;
                this.unitsSold = unitsSold;
        }

        // Getters for all product fields
        public String getProductID() {
                return productID;
        }

        public String getProductName() {
                return productName;
        }

        public String getCategory() {
                return category;
        }

        public double getPrice() {
                return price;
        }

        public int getStockQuantity() {
                return stockQuantity;
        }

        public int getUnitsSold() {
                return unitsSold;
        }

        // Setters for all product fields

        public void setProductID(String productID) {
                this.productID = productID;
        }

        public void setProductName(String productName) {
                this.productName = productName;
        }

        public void setCategory(String category) {
                this.category = category;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public void setStockQuantity(int stockQuantity) {
                this.stockQuantity = stockQuantity;
        }

        public void setUnitsSold(int unitsSold) {
                this.unitsSold = unitsSold;
        }

        //return product information in a readable format
        @Override
        public String toString() {
                return "Product{" +
                        "productID='" + productID + '\'' +
                        ", productName='" + productName + '\'' +
                        ", category='" + category + '\'' +
                        ", price=" + price +
                        ", stockQuantity=" + stockQuantity +
                        ", unitsSold=" + unitsSold +
                        '}';
        }

}       
