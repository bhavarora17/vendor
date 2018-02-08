package bhavya.vendor.api.v1.model;

import java.util.List;

public class VendorListDTO {
    List<VendorDTO> vendorListDTO;

    @java.beans.ConstructorProperties({"vendorListDTO"})
    public VendorListDTO(List<VendorDTO> vendorListDTO) {
        this.vendorListDTO = vendorListDTO;
    }

    public VendorListDTO() {
    }

    public List<VendorDTO> getVendorListDTO() {
        return this.vendorListDTO;
    }

    public void setVendorListDTO(List<VendorDTO> vendorListDTO) {
        this.vendorListDTO = vendorListDTO;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof VendorListDTO)) return false;
        final VendorListDTO other = (VendorListDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$vendorListDTO = this.getVendorListDTO();
        final Object other$vendorListDTO = other.getVendorListDTO();
        if (this$vendorListDTO == null ? other$vendorListDTO != null : !this$vendorListDTO.equals(other$vendorListDTO))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $vendorListDTO = this.getVendorListDTO();
        result = result * PRIME + ($vendorListDTO == null ? 43 : $vendorListDTO.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof VendorListDTO;
    }

    public String toString() {
        return "VendorListDTO(vendorListDTO=" + this.getVendorListDTO() + ")";
    }
}
