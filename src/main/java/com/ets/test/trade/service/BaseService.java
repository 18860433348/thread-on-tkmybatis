package com.ets.test.trade.service;


import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public class BaseService<M extends Mapper<T>, T> {

    @Autowired
    protected M mapper;

    /**
     * @Description: 根据实体类对象参数查询一条记录
     * @author JiC
     * @date 2019/6/27
    */
    public T selectOne(T entity) {
        return mapper.selectOne(entity);
    }

    /**
     * @Description: 实体类主键ID为查询条件
     * @author JiC
     * @date 2019/6/27
    */
    public T selectByPrimaryKey(Object id) {
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * @Description: 根据实体类对象参数查询list
     * @author JiC
     * @date 2019/6/29
    */
    public List<T> select(T entity) {
        return mapper.select(entity);
    }

    /**
     * @Description: 
     * @author JiC
     * @date 2019/7/2
    */
    public List<T> selectByExample(Object obj) {
        return mapper.selectByExample(obj);
    }

    /**
     * @Description: 根据实体类参数获取记录数
     * @author JiC
     * @date 2019/7/4
    */
    public int selectCount(T entity) {
        return mapper.selectCount(entity);
    }

    /**
     * @Description: 根据Example类条件获取记录数
     * @author JiC
     * @date 2019/7/4
    */
    public int selectCountByExample(Object obj) {
        return mapper.selectCountByExample(obj);
    }

    /**
     * @Description: 保存一个实体，null属性也会保存
     * @author JiC
     * @date 2019/6/29
    */
    public int insert(T entity) {
        return mapper.insert(entity);
    }

    /**
     * @Description: 保存一个实体，null属性不会保存
     * @author JiC
     * @date 2019/6/29
     */
    public int insertSelective(T entity) {
        return mapper.insertSelective(entity);
    }

    /**
     * @Description: 根据实体属性作为条件进行删除
     * @author JiC
     * @date 2019/6/29
    */
    public Integer delete(T entity) {
        return mapper.delete(entity);
    }

    /**
     * @Description: 根据主键ID 删除
     * @author JiC
     * @date 2019/7/4
    */
    public int deleteByPrimaryKey(Object id) {
        return mapper.deleteByPrimaryKey(id);
    }

    /**
     * @Description: 根据主键更新属性不为null的值
     * @author JiC
     * @date 2019/6/29
     */
    public Integer updateByPrimaryKeySelective(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    /**
     * @Description: 根据obj条件 更新t参数
     * @author JiC
     * @date 2019/7/3
    */
    public Integer updateByExampleSelective(T t, Object obj) {
        return mapper.updateByExampleSelective(t, obj);
    }
}
