package bhavya.vendor.services;

import bhavya.vendor.api.v1.model.VendorDTO;
import bhavya.vendor.domain.Vendor;

import java.util.List;

public interface VendorService {

    List<VendorDTO> getAllVendors();
    VendorDTO getVendorById(Long id);
    VendorDTO createVendor(Vendor vendor);
    VendorDTO updateVendor(Long id, Vendor vendor);
    VendorDTO putVendor(Long id, Vendor vendor);
    void deleteVendor(Long id);
}
