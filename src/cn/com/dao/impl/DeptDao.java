package cn.com.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import cn.com.common.Log;
import cn.com.dao.IDeptDao;
import cn.com.model.Dept;
/**
 * title:dept�Ĵ�����
 * @author ����
 *
 */
public class DeptDao implements IDeptDao{
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		Log.log(this, "DeptDao-----setע��HibernateTemplate");
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int saveDept(Dept dept) {
		try{
			hibernateTemplate.save(dept);
		}catch(Exception e){
			Log.log(this, "saveDept------"+e.getMessage());
			return 0;
		}
		return 1;
	}

}
