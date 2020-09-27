package rule;
import tools.XmlTransformUtil;

public class DefaultObj2XmlRule<Object> implements Obj2XmlRule<Object> {
    public String transformTypeToXml(Object object) {
        return XmlTransformUtil.object2Xml(object);
    }
}
