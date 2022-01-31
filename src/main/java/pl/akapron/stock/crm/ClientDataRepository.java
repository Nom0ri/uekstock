package pl.akapron.stock.crm;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDataRepository extends
        JpaRepository<ClientData, Integer> {
}