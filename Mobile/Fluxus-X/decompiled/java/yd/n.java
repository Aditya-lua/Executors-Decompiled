package yd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f37727a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f37727a = new HashMap();
        new zd.i("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        map = f37727a;
        map.put("java", 20002);
        return map;
    }
}
