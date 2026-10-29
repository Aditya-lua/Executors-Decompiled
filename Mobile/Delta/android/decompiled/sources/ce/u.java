package ce;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u {
    public abstract u a(int i10);

    public abstract u b(Map map);

    public abstract v c();

    public abstract Map d();

    public final v e() {
        b(Collections.unmodifiableMap(d()));
        return c();
    }
}
