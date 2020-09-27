package tools;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/**
 * 对象转xml工具类
 */

public class XmlTransformUtil {
    public static String object2Xml(Object object){
        String ret=null;
        if(object==null){
            return null;
        }

        ByteArrayOutputStream stream=new ByteArrayOutputStream();
        XMLEncoder encoder=new XMLEncoder(stream);
        encoder.writeObject(object);
        encoder.flush();
        encoder.close();

        try {
            ret=new String(stream.toByteArray(),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ret;

    }
}
