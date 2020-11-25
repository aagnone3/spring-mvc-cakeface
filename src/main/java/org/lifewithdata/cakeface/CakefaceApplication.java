package org.lifewithdata.cakeface;

import com.samskivert.mustache.Mustache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mustache.MustacheEnvironmentCollector;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CakefaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CakefaceApplication.class, args);
	}

	@Bean
	public Mustache.Compiler mustacheCompiler(Mustache.TemplateLoader templateLoader, Environment environment) {
		MustacheEnvironmentCollector collector = new MustacheEnvironmentCollector();
		collector.setEnvironment(environment);

		return Mustache.compiler()
			.defaultValue("Some default value")
			.withLoader(templateLoader)
			.withCollector(collector);
	}
}
