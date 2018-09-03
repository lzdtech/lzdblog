package com.lzdtech.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * security配置类
 * 
 * @author 27901
 *
 */
@EnableWebSecurity // 启用WEB安全
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// inMemoryAuthentication 从内存中获取 其中使用PasswordEncoder的BCrypt加密方式进行加密 也可以使用
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("admin")
				.password(new BCryptPasswordEncoder().encode("1")).roles("ADMIN");

		// jdbcAuthentication从数据库中获取，但是默认是以security提供的表结构
		// usersByUsernameQuery 指定查询用户SQL
		// authoritiesByUsernameQuery 指定查询权限SQL
		// auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(query).authoritiesByUsernameQuery(query);

		// 注入userDetailsService，需要实现userDetailsService接口
		// auth.userDetailsService(userDetailsService);

	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests() // 定义哪些url需要保护，哪些url不需要保护
				// 定义不需要认证就可以访问
				.antMatchers("/*",  "/**/*.js", "/**/*.css", "/**/*.png", "/**/*.jpg").permitAll()
				.antMatchers("/admin/**").hasRole("ADMIN")
				// 定义当需要用户登录时候，转到的登录页面
				.anyRequest().authenticated().and().formLogin().loginPage("/admin/login")
				.permitAll().and().logout().permitAll();
		httpSecurity.csrf().disable();

	}

}
