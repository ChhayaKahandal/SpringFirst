package com.mypack.SpringSecondApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("appContext.xml");
        
        Mango obj1=context.getBean(Mango.class);
        obj1.eatMango();
        
        Apple obj2=context.getBean(Apple.class);
        obj2.eatApple();
        
        /*
         Ya program mdhe apan 2 class ghetoy mhnun apan ithe 2nhi class che reference banvle ahet.
         Ani container(appContext.xml) mdhe aplyala donhi class sathi bean create karave lagtil.
         mhnje tya container la sangav lagel ki 2 object create krun de.
         
         <bean id="apple" class="com.mypack.SpringSecondApp.Apple"></bean>
	     <bean id="mango" class="com.mypack.SpringSecondApp.Mango"></bean>
	     */
    }
}
