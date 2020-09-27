package rule;
import tools.XmlTransformUtil;

import java.lang.reflect.Type;

/**
 * 对象转xml的默认实现类
 */

public class DefaultObj2XmlRule extends AbstractObj2XmlRule {
    public DefaultObj2XmlRule(Type objType) {
        super(objType);
    }

    public DefaultObj2XmlRule(){}

    public String transformObjToXml(Object object) {
        return XmlTransformUtil.object2Xml(object);
    }
}
