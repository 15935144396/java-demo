package annotation.myannotation;

/**
 * @author fengww
 * @ClassName AnnotationEntity
 * @Description TODO
 * @date 2018-11-23 10:26
 */
@ClassAnnotation(className = "entity")
public class AnnotationEntity {


    @FileAnnotation(fileName =  "name")
    private String name;

    @MethodAnnotation(methodName = "ggete")
    public String getName(@ParamAnnotation(parameterName =  "hehe ") String gg){
        return "";
    }


}
