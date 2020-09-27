import rule.DefaultObj2XmlRule;
import rule.Obj2XmlRule;

import java.lang.reflect.Type;
import java.util.HashMap;

public class Wrapper<T> {
    private Obj2XmlRule rule;
    private final T obj;

    private static final HashMap<Type,Obj2XmlRule> reflection=new HashMap<Type, Obj2XmlRule>(){
        {
            reflection.put(Object.class,new DefaultObj2XmlRule());
        }
    };
    private static final DefaultObj2XmlRule defaultRule=new DefaultObj2XmlRule();

    public Wrapper(T obj) {
        this.obj=obj;
    }

    public String wrapToXml(){
        for(Type type:reflection.keySet()){
            if(type.equals(obj.getClass())){
                return reflection.get(type).transformTypeToXml(obj);
            }
        }
        return defaultRule.transformTypeToXml(obj);
    }
}
