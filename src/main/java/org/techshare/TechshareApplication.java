package org.techshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class TechshareApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechshareApplication.class, args);
	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		//方法一、プロパティファイルの頭「Message」を利用する
		//messageSource.setBasename("messages/Message");
		//方法二、個別のプロパティを指定する
		//messageSource.setBasename("messages/Validation_ja.properties");
		//方法三、複数なプロパティを指定する
		messageSource.setBasenames("messages/Message","messages/Validation");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
}

