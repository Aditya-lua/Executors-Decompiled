package p514wd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p543xd.C12788i;

/* JADX INFO: renamed from: wd.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C12356h {

    /* JADX INFO: renamed from: a */
    public static final Map f44214a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f44214a = new HashMap();
        new C12788i("PlayCoreVersion");
    }

    /* JADX INFO: renamed from: a */
    public static synchronized Map m46222a() {
        Map map;
        map = f44214a;
        map.put("java", 20002);
        return map;
    }
}
