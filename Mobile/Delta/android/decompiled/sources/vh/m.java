package vh;

import gk.p;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static m f33236c;
    public HashMap<String, Long> b = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f33237a = 180000;

    public static m b() {
        m mVar = f33236c;
        if (mVar != null) {
            return mVar;
        }
        synchronized (m.class) {
            try {
                if (f33236c == null) {
                    f33236c = new m();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f33236c;
    }

    public boolean a(String str) {
        p.h("WebFragmentRefreshHelper", "Checking is refresh is needed. url=" + str);
        boolean z10 = false;
        if (this.b.containsKey(str)) {
            long jLongValue = this.b.get(str).longValue();
            this.b.put(str, Long.valueOf(System.currentTimeMillis()));
            z10 = System.currentTimeMillis() - jLongValue >= this.f33237a;
            p.h("WebFragmentRefreshHelper", "Needs refresh=" + z10);
        }
        return z10;
    }

    public void c(String str) {
        this.b.put(str, Long.MAX_VALUE);
    }

    public void d(long j10) {
        this.f33237a = j10;
    }
}
