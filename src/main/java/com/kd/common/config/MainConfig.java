package com.kd.common.config;

import org.beetl.ext.jfinal.BeetlRenderFactory;

import com.alibaba.druid.filter.stat.StatFilter;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.ext.route.AutoBindRoutes;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.kd.model.data._MappingKit;

public class MainConfig extends JFinalConfig {
	/**
	 * 配置JFinal常量
	 */
	private Routes routes;
	@Override
	public void configConstant(Constants me) {
		//读取数据库配置文件
		PropKit.use("config.properties");
		//设置当前是否为开发模式
		me.setDevMode(PropKit.getBoolean("devMode"));
		//设置默认上传文件保存路径 getFile等使用
		me.setBaseUploadPath("upload/temp/");
		//设置上传最大限制尺寸
		//me.setMaxPostSize(1024*1024*10);
		//设置默认下载文件路径 renderFile使用
		//me.setBaseDownloadPath("");
		//设置默认视图类型
		me.setViewType(ViewType.JSP);
		//设置404渲染视图
		//me.setError404View("404.html");
		me.setMainRenderFactory(new BeetlRenderFactory());

		me.setErrorView(401, "/login.html");
		me.setErrorView(403, "/forbidden.jsp");

	}

	private static StatFilter getStatFilter() {
        StatFilter statFilter = new StatFilter();
        statFilter.setLogSlowSql(true);
        statFilter.setMergeSql(true);
        return statFilter;
    }

    public static DruidPlugin getDataSource(){
    	String url = PropKit.use("config.properties").get("dbUrl");
    	return getDataSource(url);
    }

	public static DruidPlugin getDataSource(String url){
    	// mysql
        String username = PropKit.use("config.properties").get("user");
        String password = PropKit.use("config.properties").get("password");
        String driverClass = "com.mysql.jdbc.Driver";
        String filters = "stat,wall";

        // mysql 数据源
        DruidPlugin dsMysql = new DruidPlugin(url, username, password, driverClass, filters);
        dsMysql.addFilter(getStatFilter());
        dsMysql.setMaxActive(200);
        dsMysql.setValidationQuery(" SELECT 1 ");
        dsMysql.setTestOnBorrow(true);

        return dsMysql;
    }
	/**
	 * 配置JFinal路由映射
	 */
	@Override
	public void configRoute(Routes me) {
		AutoBindRoutes autoBindRoutes = new AutoBindRoutes();
        autoBindRoutes.includeAllJarsInLib(false);
        me.add(autoBindRoutes);
        this.routes = me;
	}
	/**
	 * 配置JFinal插件
	 * 数据库连接池
	 * ORM
	 * 缓存等插件
	 * 自定义插件
	 */
	@Override
	public void configPlugin(Plugins me) {

		//配置workflow数据库连接池插件
		DruidPlugin dsWf = getDataSource(PropKit.use("config.properties").get("dbUrl"));
        me.add(dsWf);

        ActiveRecordPlugin arpWf = new ActiveRecordPlugin("kd",dsWf);
        arpWf.setContainerFactory(new CaseInsensitiveContainerFactory(true));
        arpWf.setShowSql(true);
		// 所有表的映射配置在 MappingKit 中搞定
        _MappingKit.mapping(arpWf);
		me.add(arpWf);

	}
	/**
	 * 配置全局拦截器
	 */
	@Override
	public void configInterceptor(Interceptors me) {
//		me.addGlobalActionInterceptor(new ShiroInterceptor());
	}
	/**
	 * 配置全局处理器
	 */
	@Override
	public void configHandler(Handlers me) {
		me.add(new ContextPathHandler("base"));
	}
	/**
	 * JFinal启动后调用
	 */
	@Override
	public void afterJFinalStart() {

	}
	/**
	 * JFinal Stop之前调用
	 */
	@Override
	public void beforeJFinalStop() {

	}
	public static void main(String[] args) {
		JFinal.start("/src/main/webapp", 80, "/", 5);
	}


}
