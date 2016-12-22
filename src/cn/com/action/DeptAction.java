package cn.com.action;

import cn.com.common.Log;
import cn.com.service.IDeptService;
import cn.com.service.impl.DeptService;
import cn.com.vo.DeptVo;

public class DeptAction {
	
	private IDeptService deptService;
	private DeptVo deptVo;
	
	public DeptVo getDeptVo() {
		return deptVo;
	}

	public void setDeptVo(DeptVo deptVo) {
		this.deptVo = deptVo;
	}

	
	public void setDeptService(IDeptService deptService) {
		Log.log(this, "DeptAction-------set×¢ÈëDeptService");
		this.deptService = deptService;
	}

	public String save(){
		Log.log(this, "DeptAction----save----deptVo.dname"+deptVo.getDname()+"deptVo.loc"+deptVo.getLoc());
		deptService.saveDept(deptVo);
		return "success";
	}
}
