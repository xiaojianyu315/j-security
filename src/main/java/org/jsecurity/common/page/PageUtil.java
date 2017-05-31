package org.jsecurity.common.page;

public class PageUtil {


	/**
	 * 根据页码和每页条数计算起始条数
	 * @param pageNo
	 * @param pageSize
     * @return
     */
	public static int getStartRow(int pageNo,int pageSize){
		int tempPageNo = pageNo <= 0 ? 1 : pageNo;
		int tempPageSize = pageSize <= 0 ? 1 : pageSize;
		int	start = tempPageSize * (tempPageNo - 1);
		return start;
	}

}
