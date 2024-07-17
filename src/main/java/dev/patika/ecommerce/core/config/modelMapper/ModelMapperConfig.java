package dev.patika.ecommerce.core.config.modelMapper;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean        // program başladığında bu bean objesi ıos container içerisine nesneyi atıcak !
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
