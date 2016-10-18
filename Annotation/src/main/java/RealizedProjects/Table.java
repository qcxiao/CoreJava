package RealizedProjects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})//只适用于类或接口
@Retention(RetentionPolicy.RUNTIME)//在编译、运行时都有作用
public @interface Table {
	public String value();
}
