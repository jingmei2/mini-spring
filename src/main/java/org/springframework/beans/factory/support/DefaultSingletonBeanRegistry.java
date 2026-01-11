package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例bean注册表实现类，用于注册和获取单例bean
 * @author derekyi
 * @date 2020/11/22
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
	/**
	 * 单例bean缓存，key为beanName，value为bean实例
	 */
	private Map<String, Object> singletonObjects = new HashMap<>();
	/**
	 * 从单例缓存中获取bean实例
	 * @param beanName bean名称
	 * @return bean实例
	 */
	@Override
	public Object getSingleton(String beanName) {
		return singletonObjects.get(beanName);
	}

	protected void addSingleton(String beanName, Object singletonObject) {
		singletonObjects.put(beanName, singletonObject);
	}
}
