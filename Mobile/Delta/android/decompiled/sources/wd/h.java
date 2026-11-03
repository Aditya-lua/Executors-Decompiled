package wd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import xd.i;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f34370a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f34370a = new HashMap();
        new i("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        map = f34370a;
        map.put("java", 20002);
        return map;
    }
}
