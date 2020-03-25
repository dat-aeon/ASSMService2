package mm.aeon.com.dto.outletinfo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OutletInfoResDto implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = -2190451274159363744L;
	private Double outletLimitMetre;
	private List<OutletInfoDto> outletInfoList;

}
