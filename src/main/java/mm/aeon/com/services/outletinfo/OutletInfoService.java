package mm.aeon.com.services.outletinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mm.aeon.com.dao.outletinfo.OutletInfoDao;
import mm.aeon.com.dto.outletinfo.OutletInfoDto;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class OutletInfoService {

	@Autowired
	private OutletInfoDao outletInfoDao;

	public List<OutletInfoDto> getOutletInfoList() {
		return outletInfoDao.getOutletInfoList();
	}

}
