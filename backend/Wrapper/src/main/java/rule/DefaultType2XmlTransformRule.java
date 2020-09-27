package rule;
import tools.XmlTransformUtil;

public class DefaultType2XmlTransformRule<Object> implements rule.Type2XmlTransferRule<Object> {
    public String transformTypeToXml(Object object) {
        return XmlTransformUtil.object2Xml(object);
    }
}
