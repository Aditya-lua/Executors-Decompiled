package di;

import java.util.HashMap;
import java.util.function.LongSupplier;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static m f12462d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LongSupplier f12464c = new LongSupplier() { // from class: di.l
        @Override // java.util.function.LongSupplier
        public final long getAsLong() {
            return System.currentTimeMillis();
        }
    };
    public HashMap<String, Long> b = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12463a = 180000;

    public static m b() {
        m mVar = f12462d;
        if (mVar != null) {
            return mVar;
        }
        synchronized (m.class) {
            try {
                if (f12462d == null) {
                    f12462d = new m();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f12462d;
    }

    public boolean a(String str) {
        q.h("WebFragmentRefreshHelper", "Checking is refresh is needed. url=" + str);
        boolean z10 = false;
        if (this.b.containsKey(str)) {
            long jLongValue = this.b.get(str).longValue();
            this.b.put(str, Long.valueOf(this.f12464c.getAsLong()));
            z10 = this.f12464c.getAsLong() - jLongValue >= this.f12463a;
            q.h("WebFragmentRefreshHelper", "Needs refresh=" + z10);
        }
        return z10;
    }

    public void c(String str) {
        this.b.put(str, Long.MAX_VALUE);
    }

    public void d(long j10) {
        this.f12463a = j10;
    }
}
