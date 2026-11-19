package backtraceio.library.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CollectionUtils {
    public static <T> List<T> copyList(List<T> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public static <K, V> Map<K, V> copyMap(Map<K, V> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }
}
