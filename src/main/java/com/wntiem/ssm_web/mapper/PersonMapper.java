package com.wntiem.ssm_web.mapper;

import java.util.List;


import com.wntiem.ssm_web.bean.Person;



public interface PersonMapper {
	
	/**
     * 插入一条记录
     * @param person
     */
    void insert(Person person);
    
    /**
     * 查询所有
     * @return
     */
    List<Person> queryAll();

}
