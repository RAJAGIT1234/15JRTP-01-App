/**
 * 
 */
package in.ashokit.model;

import java.util.Date;

import lombok.Data;

/**
 * @author vinay
 *
 */
@Data
public class CoBatchRunDetailsModel {
	private Integer runSeq;
	private String batchName;
	private Date startDate;
	private Date endDate;
	private String batchRunStatus;
	private Integer instanceNum;
}// CoBatchRunDetailsModel
