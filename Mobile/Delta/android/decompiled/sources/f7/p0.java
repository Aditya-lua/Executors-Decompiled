package f7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class p0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f16448a;
    public final Throwable b;

    public p0(V v5) {
        this.f16448a = v5;
        this.b = null;
    }

    public Throwable a() {
        return this.b;
    }

    public V b() {
        return this.f16448a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (b() != null && b().equals(p0Var.b())) {
            return true;
        }
        if (a() == null || p0Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public p0(Throwable th2) {
        this.b = th2;
        this.f16448a = null;
    }
}
