package rule;
import tools.XmlTransformUtil;

/**
 * 对象转xml的默认实现类
 */

public class DefaultObj2XmlRule implements Obj2XmlRule {
    public String transformTypeToXml(Object object) {
        return XmlTransformUtil.object2Xml(object);
    }
}
