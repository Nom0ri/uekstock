package pl.akapron.stock.sales;

public interface ProductDetailsProvider {
    ProductDetails getProductDetails(String productId);
}