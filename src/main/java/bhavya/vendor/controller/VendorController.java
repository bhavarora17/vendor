package bhavya.vendor.controller;

import bhavya.vendor.api.v1.model.VendorDTO;
import bhavya.vendor.api.v1.model.VendorListDTO;
import bhavya.vendor.domain.Vendor;
import bhavya.vendor.services.VendorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Api(description = "THIS IS Bhavya's APi's, Thankyou ")
@RestController
@RequestMapping(VendorController.BASE_URL)
public class VendorController {

    private final VendorService vendorService;
    public final static String BASE_URL="api/v1/vendors";

    @java.beans.ConstructorProperties({"vendorService"})
    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @ApiOperation(value = "bhavya bhai ji" , notes = "bhavya bhai")
    @GetMapping({"/bhavya/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public String getVendor(){
        System.out.println("BHAVYA IS GREAT");
        return "BHAVYA";
    }

    @GetMapping(value = {"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO getVendorById(@PathVariable Long id){
        return vendorService.getVendorById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public VendorListDTO getVendorList(){
        return new VendorListDTO(vendorService.getAllVendors());
    }

    @PutMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO putVendor(@PathVariable Long id, @RequestBody Vendor vendor){
        return vendorService.putVendor(id, vendor);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO postVendor(@RequestBody Vendor vendor){
        return vendorService.createVendor(vendor);
    }

    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO updateVendor(@PathVariable Long id, @RequestBody Vendor vendor){
        return vendorService.updateVendor(id, vendor);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Void deleteVendor(@PathVariable Long id){
        vendorService.deleteVendor(id);
        return null;
    }

}
