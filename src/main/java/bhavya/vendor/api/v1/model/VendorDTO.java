package bhavya.vendor.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

public class VendorDTO {

    @ApiModelProperty(value = "Name of the person")
    String name;

    @JsonProperty("vendor_url")
    String vendorUrl;

    @java.beans.ConstructorProperties({"name", "vendorUrl"})
    public VendorDTO(String name, String vendorUrl) {
        this.name = name;
        this.vendorUrl = vendorUrl;
    }

    public VendorDTO() {
    }

    public String getName() {
        return this.name;
    }

    public String getVendorUrl() {
        return this.vendorUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVendorUrl(String vendorUrl) {
        this.vendorUrl = vendorUrl;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof VendorDTO)) return false;
        final VendorDTO other = (VendorDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$vendorUrl = this.getVendorUrl();
        final Object other$vendorUrl = other.getVendorUrl();
        if (this$vendorUrl == null ? other$vendorUrl != null : !this$vendorUrl.equals(other$vendorUrl)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $vendorUrl = this.getVendorUrl();
        result = result * PRIME + ($vendorUrl == null ? 43 : $vendorUrl.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof VendorDTO;
    }

    public String toString() {
        return "VendorDTO(name=" + this.getName() + ", vendorUrl=" + this.getVendorUrl() + ")";
    }
}
