package ie;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: ie.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6763c0<T> extends AbstractC6783m0<Iterable<T>> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Comparator<? super T> f26632a;

    public C6763c0(Comparator<? super T> comparator) {
        this.f26632a = comparator;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6763c0) {
            return this.f26632a.equals(((C6763c0) obj).f26632a);
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // ie.AbstractC6783m0, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f26632a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    public int hashCode() {
        return this.f26632a.hashCode() ^ 2075626741;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f26632a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18);
        sb2.append(strValueOf);
        sb2.append(".lexicographical()");
        return sb2.toString();
    }
}
