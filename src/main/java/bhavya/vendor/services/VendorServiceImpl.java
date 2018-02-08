package bhavya.vendor.services;

import bhavya.vendor.api.v1.mapper.VendorMapper;
import bhavya.vendor.api.v1.model.VendorDTO;
import bhavya.vendor.controller.VendorController;
import bhavya.vendor.domain.Vendor;
import bhavya.vendor.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class VendorServiceImpl implements VendorService{
    VendorMapper vendorMapper;
    VendorRepository vendorRepository;

    @Autowired
    public VendorServiceImpl(VendorMapper vendorMapper, VendorRepository vendorRepository ) {
        this.vendorRepository = vendorRepository;
        this.vendorMapper = vendorMapper;

    }

    @Override
    public List<VendorDTO> getAllVendors(){
        System.out.println("BHAVYA");
        return vendorRepository
                .findAll()
                .stream()
                .map(vendor -> {
                        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);
                        vendorDTO.setVendorUrl(VendorController.BASE_URL + "/" +  vendor.getId());
                        return vendorDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public VendorDTO getVendorById(Long id){
        return vendorRepository.findById(id)
                .map(vendorMapper::vendorToVendorDTO)
                .map(vendorDTO ->{
                    vendorDTO.setVendorUrl("BHAVYA IS THE GREATEST GUY");
                    return vendorDTO;
                })
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public VendorDTO createVendor(Vendor vendor){
        Vendor savedVendor = vendorRepository.save(vendor);
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(savedVendor);
        vendorDTO.setVendorUrl("bhavya"+ savedVendor.getId());
        return vendorDTO;
    }

    @Override
    public VendorDTO updateVendor(Long id, Vendor vendor){
        return vendorRepository.findById(id).map(
                savedVendor -> {
                    if (vendor.getName() != null) {
                        savedVendor.setName(vendor.getName());
                    }
                    vendorRepository.save(savedVendor);
                    VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(savedVendor);
                    vendorDTO.setVendorUrl("bhavya");
                    return vendorDTO;
                }).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public VendorDTO putVendor(Long id, Vendor vendor){
        vendor.setId(id);
        vendorRepository.save(vendor);
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);
        vendorDTO.setVendorUrl("api/v1/customer/" + vendor.getId());
        return vendorDTO;
    }

    @Override
    public void deleteVendor(Long id){
        vendorRepository.deleteById(id);
    }
}
