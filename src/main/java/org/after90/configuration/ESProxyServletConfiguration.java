package org.after90.configuration;

import lombok.extern.slf4j.Slf4j;
import org.mitre.dsmiley.httpproxy.ProxyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@Slf4j
public class ESProxyServletConfiguration {

  private String servlet_url = "/es/*";
  private String target_url = "http://172.16.43.17:9200";

  @Bean
  public ServletRegistrationBean servletRegistrationBean() {
    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(
        new ProxyServlet(), servlet_url);
    servletRegistrationBean
        .addInitParameter("targetUri", target_url);
    servletRegistrationBean.addInitParameter(ProxyServlet.P_LOG,
        "true");
    log.info("servlet_url:{}", servlet_url);
    log.info("target_url:{}", target_url);
    return servletRegistrationBean;
  }

}
