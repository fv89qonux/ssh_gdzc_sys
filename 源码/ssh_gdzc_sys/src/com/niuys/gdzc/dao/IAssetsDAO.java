package com.niuys.gdzc.dao;

import java.util.List;

import com.niuys.gdzc.model.ZcInfo;

public interface IAssetsDAO {

	public List showAllAssets();
	
	public List findPageAssets(int pageStartRow, int pageCount);
	
	public boolean checkZCID(String zc_id);

	public boolean addAssets(ZcInfo zcinfo);
	
	public ZcInfo getOneZc(String id);
	
	public void saveUpdate(ZcInfo zcinfo);
	
	public boolean deleteAsset(String zc_id);
	
	public List checkZC(String zcId,
							String zcFactory,
							String zcNo,
							String zcName,
							String zcType,
							String zcStatus,
							String zcBuyer);
}
