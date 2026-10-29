package he;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c0<T> extends m0<Iterable<T>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<? super T> f19209a;

    public c0(Comparator<? super T> comparator) {
        this.f19209a = comparator;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f19209a.equals(((c0) obj).f19209a);
        }
        return false;
    }

    @Override // he.m0, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f19209a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    public int hashCode() {
        return this.f19209a.hashCode() ^ 2075626741;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f19209a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18);
        sb2.append(strValueOf);
        sb2.append(".lexicographical()");
        return sb2.toString();
    }
}
