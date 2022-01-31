package pl.akapron.stock.productcatalog;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository
        extends JpaRepository<Product, String> {
}