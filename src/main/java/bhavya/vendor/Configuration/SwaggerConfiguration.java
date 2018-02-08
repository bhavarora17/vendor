package bhavya.vendor.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.ApiInfo;

import java.util.ArrayList;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(metaData());
    }

    /*private AppInfo meatData(){
        Contact contact = new Contact("Bhavya Arora", "", "bhavarora17@gmail.com");

        return new AppInfo(
                1,
                "Vendor API's",
                "Just an example",
                "1.0",
                "Terms of service : blah blah blah",
                contact,
                "Some License",
                "Some license url",
                new ArrayList<>()
        );
    }*/
    private ApiInfo metaData(){

        Contact contact = new Contact("Bhavya Arora", "bhavya's Home URL",
                "bhavarora17@gmail.com");

        return new ApiInfo(
                "Bhavya's API's",
                "Spring Framework 5",
                "1.0",
                "Terms of Service: blah",
                contact,
                "Bhavya's License",
                "Bhavya's License URL'",
                new ArrayList<>());
    }
}
