package fb;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends s1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f15892a;

    public x0(Comparator comparator) {
        comparator.getClass();
        this.f15892a = comparator;
    }

    @Override // fb.s1, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f15892a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            return this.f15892a.equals(((x0) obj).f15892a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15892a.hashCode();
    }

    public final String toString() {
        return this.f15892a.toString();
    }
}
