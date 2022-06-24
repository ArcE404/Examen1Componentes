package main;

import converter.BinaryConverter;
import converter.ConvertInterface;
import converter.HexConverter;
import manager.ConverterManager;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:META-INF/beans.xml");
        BeanFactory factory = context;
        ConverterManager converterManager = (ConverterManager) factory
                .getBean("converterManager");
        converterManager.run();

    }
}
