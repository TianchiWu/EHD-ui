import rule.AbstractObj2XmlRule;
import rule.DefaultObj2XmlRule;

import java.lang.reflect.Type;
import java.util.HashMap;

public class Wrapper<T> {
    private AbstractObj2XmlRule rule;
    private final T obj;

    private static final HashMap<Type, AbstractObj2XmlRule> reflection= new HashMap<Type, AbstractObj2XmlRule>() {
        {
            reflection.put(Object.class,new DefaultObj2XmlRule());
        }
    };
    private static final AbstractObj2XmlRule defaultRule=new DefaultObj2XmlRule();

    public Wrapper(T obj) {
        this.obj=obj;
    }

    public String wrapToXml(Boolean useRule){
        if(useRule){
            for(Type type:reflection.keySet()){
                if(type.equals(obj.getClass())){
                    return reflection.get(type).transformObjToXml(obj);
                }
            }
        }
        return defaultRule.transformObjToXml(obj);
    }

    public String wrapToXml(AbstractObj2XmlRule rule) throws Exception {
        if(rule.getObjType()==null){
            throw new Exception("method inner type must be assigned");
        }
        if(!rule.getObjType().equals(obj.getClass())){
            throw new Exception("method from object to xml cannot accept type "+obj.getClass().toString());
        }
        return rule.transformObjToXml(obj);
    }
}
