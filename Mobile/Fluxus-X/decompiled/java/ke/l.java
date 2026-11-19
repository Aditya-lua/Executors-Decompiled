package ke;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class l<T> extends m0<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<T> f21385a;

    public l(Comparator<T> comparator) {
        this.f21385a = (Comparator) je.n.l(comparator);
    }

    @Override // ke.m0, java.util.Comparator
    public int compare(T t8, T t10) {
        return this.f21385a.compare(t8, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return this.f21385a.equals(((l) obj).f21385a);
        }
        return false;
    }

    public int hashCode() {
        return this.f21385a.hashCode();
    }

    public String toString() {
        return this.f21385a.toString();
    }
}
