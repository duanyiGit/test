package cn.com.service.impl;

import org.springframework.beans.BeanUtils;

import cn.com.common.Log;
import cn.com.dao.IDeptDao;
import cn.com.model.Dept;
import cn.com.service.IDeptService;
import cn.com.vo.DeptVo;

public class DeptService implements IDeptService{
	private IDeptDao deptDao;

	public void setDeptDao(IDeptDao deptDao) {
		Log.log(this, "DeptService-----set×¢ÈëDeptDao");
		this.deptDao = deptDao;
	}

	@Override
	public int saveDept(DeptVo deptVo) {
		// TODO Auto-generated method stub
		Dept dept=new Dept();
		BeanUtils.copyProperties(deptVo, dept);
		return deptDao.saveDept(dept);
	}
	
}
