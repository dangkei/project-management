package com.bgp.report.interceptor;

import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 分页拦截器 需要拦截的接口类
 * type=org.apache.ibatis.executor.statement.StatementHandler.class 
 * 需要拦截的方法名称 method="prepare" 
 * 需要拦截的方法参数 args={Connection.class}
 */
//@Intercepts({@Signature(type=StatementHandler.class,method="prepare",args={Connection.class})})
@Intercepts({
		@Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class, Integer.class }) })
public class PageInterceptor implements Interceptor {

	private String test; //测试插件属性

	private static final Logger logger = LoggerFactory.getLogger(PageInterceptor.class);
	private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
	private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
	private static final ReflectorFactory DEFAULT_REFLECTOR_FACTORY = new DefaultReflectorFactory();
	private static String dialect = "mysql";

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();

		MetaObject metaObject = MetaObject.forObject(statementHandler, DEFAULT_OBJECT_FACTORY,
				DEFAULT_OBJECT_WRAPPER_FACTORY, DEFAULT_REFLECTOR_FACTORY);
		MappedStatement mappedStatement = (MappedStatement) metaObject.getValue("delegate.mappedStatement");
		String method = mappedStatement.getId();
		BoundSql boundSql = statementHandler.getBoundSql();

		// 原始的SQL语句
		String sql = boundSql.getSql();
		
		if(method.matches(".+ByPage$")){ //拦截分页读取数据 param1 page param2 每页条数
			Map<?,?> params = (Map<?,?>)boundSql.getParameterObject();
			int page = (Integer)params.get("param1");
			int limit = (Integer)params.get("param2");
			// 改造后带分页查询的SQL语句
			String pageSql = sql + " limit " + (page-1)*limit + "," + limit;
			metaObject.setValue("delegate.boundSql.sql", pageSql);
		}else if(method.matches("updateOne")){  //更新单条记录
			Object params = boundSql.getParameterObject();
			//Object obj = params.get("param1");
			Class<?>  cls = params.getClass();
			System.out.println(params.getClass());
		}
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		System.out.println("plugin"+this.test);
		// 当目标类是StatementHandler类型时，才包装目标类，否者直接返回目标本身,减少目标被代理的次数
		if (target instanceof StatementHandler) {
			return Plugin.wrap(target, this);
		} else {
			return target;
		}
	}

	@Override
	public void setProperties(Properties properties) {
		this.test = properties.getProperty("test");
		logger.info("plugs test = ");
		// TODO Auto-generated method stub

	}


}