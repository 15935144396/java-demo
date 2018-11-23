package annotation.myannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author fengww
 * @ClassName ParamAnnotation
 * @Description TODO
 * @date 2018-11-23 10:19
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface ParamAnnotation {
    String parameterName();
}
