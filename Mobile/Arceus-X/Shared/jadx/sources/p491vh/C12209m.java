package p491vh;

import java.util.HashMap;
import p151gk.C6124q;

/* JADX INFO: renamed from: vh.m */
/* JADX INFO: loaded from: classes2.dex */
public class C12209m {

    /* JADX INFO: renamed from: c */
    public static C12209m f43038c;

    /* JADX INFO: renamed from: b */
    public HashMap<String, Long> f43040b = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public long f43039a = 180000;

    /* JADX INFO: renamed from: b */
    public static C12209m m45193b() {
        C12209m c12209m = f43038c;
        if (c12209m != null) {
            return c12209m;
        }
        synchronized (C12209m.class) {
            try {
                if (f43038c == null) {
                    f43038c = new C12209m();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f43038c;
    }

    /* JADX INFO: renamed from: a */
    public boolean m45194a(String str) {
        C6124q.m27063h("WebFragmentRefreshHelper", "Checking is refresh is needed. url=" + str);
        boolean z10 = false;
        if (this.f43040b.containsKey(str)) {
            long jLongValue = this.f43040b.get(str).longValue();
            this.f43040b.put(str, Long.valueOf(System.currentTimeMillis()));
            z10 = System.currentTimeMillis() - jLongValue >= this.f43039a;
            C6124q.m27063h("WebFragmentRefreshHelper", "Needs refresh=" + z10);
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public void m45195c(String str) {
        this.f43040b.put(str, Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: d */
    public void m45196d(long j10) {
        this.f43039a = j10;
    }
}
