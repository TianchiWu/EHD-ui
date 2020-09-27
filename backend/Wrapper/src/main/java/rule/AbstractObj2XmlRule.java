package rule;

import java.lang.reflect.Type;

/**
 * 对象转xml抽象类
 */
abstract public class AbstractObj2XmlRule {
    protected Type objType;

    public Type getObjType() {
        return objType;
    }

    public void setObjType(Type objType) {
        this.objType = objType;
    }

    public AbstractObj2XmlRule(Type objType) {
        this.objType = objType;
    }

    public AbstractObj2XmlRule(){}

    abstract public String transformObjToXml(Object object);
}
