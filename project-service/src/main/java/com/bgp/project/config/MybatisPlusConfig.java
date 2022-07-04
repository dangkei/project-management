/**
 * 
 */
package com.bgp.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;

/**
 * @author Administrator
 *
 */
@Configuration
public class MybatisPlusConfig {
	
	@Bean
	public MybatisPlusInterceptor paginationIntercepor() {
		MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor ();
		interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
		return interceptor;
	}

}
