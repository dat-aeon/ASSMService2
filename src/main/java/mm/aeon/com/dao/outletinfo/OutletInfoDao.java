package mm.aeon.com.dao.outletinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mm.aeon.com.custommapper.outletinfo.OutletInfoCustomMapper;
import mm.aeon.com.dto.outletinfo.OutletInfoDto;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class OutletInfoDao {

	@Autowired
	private OutletInfoCustomMapper outletInfoCustomMapper;

	public List<OutletInfoDto> getOutletInfoList() {
		List<OutletInfoDto> outletInfoList;
		outletInfoList = outletInfoCustomMapper.getOutletInfoList();
		return outletInfoList;
	}

}
