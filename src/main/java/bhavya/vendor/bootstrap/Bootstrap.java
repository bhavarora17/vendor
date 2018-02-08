package bhavya.vendor.bootstrap;

import bhavya.vendor.domain.Vendor;
import bhavya.vendor.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner{

    VendorRepository vendorRepository;

    @Autowired
    public Bootstrap(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) {
        loadVendors();
    }

    public void loadVendors(){

        Vendor vendor1 = new Vendor();
        vendor1.setName("vendor 1");
        vendorRepository.save(vendor1);

        Vendor vendor2 = new Vendor();
        vendor2.setName("vendor 2");
        vendorRepository.save(vendor2);

    }
}
