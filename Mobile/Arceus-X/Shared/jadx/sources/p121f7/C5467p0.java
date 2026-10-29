package p121f7;

import java.util.Arrays;

/* JADX INFO: renamed from: f7.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5467p0<V> {

    /* JADX INFO: renamed from: a */
    public final V f21191a;

    /* JADX INFO: renamed from: b */
    public final Throwable f21192b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5467p0(V v5) {
        this.f21191a = v5;
        this.f21192b = null;
    }

    /* JADX INFO: renamed from: a */
    public Throwable m25071a() {
        return this.f21192b;
    }

    /* JADX INFO: renamed from: b */
    public V m25072b() {
        return this.f21191a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5467p0)) {
            return false;
        }
        C5467p0 c5467p0 = (C5467p0) obj;
        if (m25072b() != null && m25072b().equals(c5467p0.m25072b())) {
            return true;
        }
        if (m25071a() == null || c5467p0.m25071a() == null) {
            return false;
        }
        return m25071a().toString().equals(m25071a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m25072b(), m25071a()});
    }

    public C5467p0(Throwable th2) {
        this.f21192b = th2;
        this.f21191a = null;
    }
}
