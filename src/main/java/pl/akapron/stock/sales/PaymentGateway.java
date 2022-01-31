package pl.akapron.stock.sales;

import pl.akapron.stock.sales.ordering.CustomerDetails;
import pl.akapron.stock.sales.ordering.PaymentDetails;

import java.math.BigDecimal;

public interface PaymentGateway {
    PaymentDetails register(String id, BigDecimal total, CustomerDetails customerDetails);
}