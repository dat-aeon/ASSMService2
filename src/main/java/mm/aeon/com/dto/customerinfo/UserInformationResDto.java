package mm.aeon.com.dto.customerinfo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInformationResDto implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 2631380250391523936L;
	private Integer customerId;
	private String customerNo;
	private String phoneNo;
	private Integer customerTypeId;
	private Integer userTypeId;
	private String name;
	private Date dateOfBirth;
	private String nrcNo;
	private String photoPath;
	private String memberNo;
	private boolean memberNoValid;
	private String hotlinePhone;

}
