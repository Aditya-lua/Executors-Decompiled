package ie;

import java.io.Serializable;
import java.util.Comparator;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C6780l<T> extends AbstractC6783m0<T> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Comparator<T> f26671a;

    public C6780l(Comparator<T> comparator) {
        this.f26671a = (Comparator) C6384n.m27928l(comparator);
    }

    @Override // ie.AbstractC6783m0, java.util.Comparator
    public int compare(T t8, T t10) {
        return this.f26671a.compare(t8, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6780l) {
            return this.f26671a.equals(((C6780l) obj).f26671a);
        }
        return false;
    }

    public int hashCode() {
        return this.f26671a.hashCode();
    }

    public String toString() {
        return this.f26671a.toString();
    }
}
