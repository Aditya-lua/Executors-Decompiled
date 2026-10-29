package he;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class l<T> extends m0<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<T> f19241a;

    public l(Comparator<T> comparator) {
        this.f19241a = (Comparator) ge.n.l(comparator);
    }

    @Override // he.m0, java.util.Comparator
    public int compare(T t8, T t10) {
        return this.f19241a.compare(t8, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return this.f19241a.equals(((l) obj).f19241a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19241a.hashCode();
    }

    public String toString() {
        return this.f19241a.toString();
    }
}
