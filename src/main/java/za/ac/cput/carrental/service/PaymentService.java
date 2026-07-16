package za.ac.cput.carrental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.carrental.domain.Payment;
import za.ac.cput.carrental.repository.PaymentRepository;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private PaymentRepository paymentRepository;



    @Override
    public String create(String payment) {
        return this.paymentRepository.save(payment);
    }

    @Override
    public String read(Payment payment) {
        return this.paymentRepository.save(payment);
    }

    @Override
    public String update(String string) {
        return "";
    }

    @Override
    public boolean delete(Payment payment) {
        return false;
    }
}
