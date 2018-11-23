package annotation.myannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author fengww
 * @ClassName FileAnnotation
 * @Description TODO
 * @date 2018-11-23 10:20
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FileAnnotation {

    String fileName() default "";
}
