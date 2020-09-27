package rule;

public interface Obj2XmlRule<T> {
    String transformTypeToXml(T object);
}
