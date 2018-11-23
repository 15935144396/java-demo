package annotation.myannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author fengww
 * @ClassName AnnotationTest
 * @Description TODO
 * @date 2018-11-23 10:25
 */
public class AnnotationTest {


    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {

        Class<AnnotationEntity> annotationEntityClass = AnnotationEntity.class;
        Method getName = annotationEntityClass.getMethod("getName", String.class);
        Field name = annotationEntityClass.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println("属性的注解："+ name.getAnnotation(FileAnnotation.class).fileName());
        System.out.println("方法的注解:"+ getName.getAnnotation(MethodAnnotation.class).methodName());
        System.out.println("类的注解："+annotationEntityClass.getAnnotation(ClassAnnotation.class).className());
        Annotation[][] parameterAnnotations = getName.getParameterAnnotations();
        Parameter[] parameters = getName.getParameters();
        int i =0;
        for (Annotation[] parameterAnnotation : parameterAnnotations) {
            Parameter parameter = parameters[i++];
            ParamAnnotation annotation1 = parameter.getAnnotation(ParamAnnotation.class);
            for (Annotation annotation : parameterAnnotation) {
                if(annotation instanceof  ParamAnnotation){
                    System.out.println("参数的注解："+ ((ParamAnnotation) annotation).parameterName());
                    System.out.println(parameter.getName());
                }
            }

        }
    }


}
