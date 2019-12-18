package org.after90.configuration;

import lombok.extern.slf4j.Slf4j;
import org.mitre.dsmiley.httpproxy.ProxyServlet;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@Slf4j
public class ESProxyServletConfiguration implements EnvironmentAware {

  @Bean
  public ServletRegistrationBean servletRegistrationBean() {
    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(
        new ProxyServlet(), propertyResolver.getProperty("servlet_url"));
    servletRegistrationBean
        .addInitParameter("targetUri", propertyResolver.getProperty("target_url"));
    servletRegistrationBean.addInitParameter(ProxyServlet.P_LOG,
        propertyResolver.getProperty("logging_enabled", "false"));
    log.info("servlet_url:{}", this.propertyResolver.getProperty("servlet_url"));
    log.info("target_url:{}", this.propertyResolver.getProperty("target_url"));
    return servletRegistrationBean;
  }

  private RelaxedPropertyResolver propertyResolver;

  @Override
  public void setEnvironment(Environment environment) {
    this.propertyResolver = new RelaxedPropertyResolver(environment, "proxy.es.");
    log.info("servlet_url:{}", this.propertyResolver.getProperty("servlet_url"));
    log.info("target_url:{}", this.propertyResolver.getProperty("target_url"));
  }
}
