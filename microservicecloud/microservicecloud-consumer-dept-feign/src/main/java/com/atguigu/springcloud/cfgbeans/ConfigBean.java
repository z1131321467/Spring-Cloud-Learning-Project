package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RandomRule;

//boot --> spring applicationContext.xml --- @Configuration配置 ConfigBean = applicationContext.xml
@Configuration
public class ConfigBean {
	 
	@Bean
	@LoadBalanced       //spring cloud Ribbon是基于Netflix Ribbon实现的一套客户端   负载均衡的工具
    public RestTemplate getRestTemplate()
    {
         return new RestTemplate();
    }

	//@Bean
	//public IRule myIRule() {
		
	//	return new RandomRule();	//达到的目的，用我们重新选择的随机算法替代轮询算法
	//}
}
