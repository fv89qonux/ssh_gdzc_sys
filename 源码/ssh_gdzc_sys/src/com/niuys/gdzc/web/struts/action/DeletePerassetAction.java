package com.niuys.gdzc.web.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DeletePerassetAction extends BaseAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String num=request.getParameter("repair_no");
		
		if(assetPerManagerImpl.deletePerAsset(Integer.parseInt(num))){
			return mapping.findForward("success");
		}
		else{
			return mapping.findForward("fail");
		}
		
	}
	
	

}
