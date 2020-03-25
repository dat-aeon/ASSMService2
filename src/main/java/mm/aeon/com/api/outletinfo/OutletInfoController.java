package mm.aeon.com.api.outletinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mm.aeon.com.dto.outletinfo.OutletInfoDto;
import mm.aeon.com.dto.outletinfo.OutletInfoResDto;
import mm.aeon.com.services.outletinfo.OutletInfoService;

@RestController
@RequestMapping("/outlet-info")
public class OutletInfoController {

	@Autowired
	private OutletInfoService outletInfoService;

	@Value("${properties.outletLimitMetre}")
	private Double outletLimitMetre;

	@RequestMapping(value = "/outlet-info-list", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public OutletInfoResDto getOutletInfoList() throws Exception {
		OutletInfoResDto outletInfoResDto = new OutletInfoResDto();
		List<OutletInfoDto> outletInfoList = outletInfoService.getOutletInfoList();
		outletInfoResDto.setOutletLimitMetre(outletLimitMetre);
		outletInfoResDto.setOutletInfoList(outletInfoList);
		return outletInfoResDto;

	}

}
