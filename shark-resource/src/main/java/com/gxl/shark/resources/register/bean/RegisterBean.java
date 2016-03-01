/*
 * Copyright 2015-2101 gaoxianglong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gxl.shark.resources.register.bean;

import org.springframework.context.ApplicationContextAware;

import com.gxl.shark.resources.zookeeper.DataSourceBean;

/**
 * 动态向spring的ioc容器中注册bean实例
 * 
 * @author gaoxianglong
 */
public interface RegisterBean extends ApplicationContextAware {
	/**
	 * 注册bean
	 * 
	 * @author gaoxianglong
	 * 
	 * @param nodePathValue
	 *            zookeeper注册中心的节点value
	 * 
	 * @param dataSourceBean
	 *            数据源信息bean
	 */
	public void register(String nodePathValue, DataSourceBean dataSourceBean);
}