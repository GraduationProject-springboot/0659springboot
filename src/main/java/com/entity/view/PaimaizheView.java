package com.entity.view;

import com.entity.PaimaizheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 拍卖者
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-22 11:53:02
 */
@TableName("paimaizhe")
public class PaimaizheView  extends PaimaizheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PaimaizheView(){
	}
 
 	public PaimaizheView(PaimaizheEntity paimaizheEntity){
 	try {
			BeanUtils.copyProperties(this, paimaizheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
