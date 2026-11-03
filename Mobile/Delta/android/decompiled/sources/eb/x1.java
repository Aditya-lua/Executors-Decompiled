package eb;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends s1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f16037a;

    public x1(s1 s1Var) {
        this.f16037a = s1Var;
    }

    @Override // eb.s1
    public final s1 a() {
        return this.f16037a;
    }

    @Override // eb.s1, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f16037a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            return this.f16037a.equals(((x1) obj).f16037a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f16037a.hashCode();
    }

    public final String toString() {
        return this.f16037a.toString().concat(".reverse()");
    }
}
