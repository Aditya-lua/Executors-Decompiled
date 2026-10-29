package backtraceio.library.models.json;

import backtraceio.library.models.BacktraceAttributeConsts;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Annotations {
    public static Map<String, Object> getAnnotations(Object obj, Map<String, Object> map) {
        HashMap map2 = new HashMap();
        map2.put("Environment Variables", System.getenv());
        if (map != null) {
            map2.putAll(map);
        }
        map2.put(BacktraceAttributeConsts.HandledExceptionAttributeType, new AnnotationException(obj));
        return map2;
    }
}
