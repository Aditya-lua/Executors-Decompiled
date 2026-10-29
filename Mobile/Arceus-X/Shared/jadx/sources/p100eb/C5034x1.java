package p100eb;

import java.io.Serializable;

/* JADX INFO: renamed from: eb.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5034x1 extends AbstractC5004s1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final AbstractC5004s1 f19838a;

    public C5034x1(AbstractC5004s1 abstractC5004s1) {
        this.f19838a = abstractC5004s1;
    }

    @Override // p100eb.AbstractC5004s1
    /* JADX INFO: renamed from: a */
    public final AbstractC5004s1 mo23692a() {
        return this.f19838a;
    }

    @Override // p100eb.AbstractC5004s1, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f19838a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5034x1) {
            return this.f19838a.equals(((C5034x1) obj).f19838a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f19838a.hashCode();
    }

    public final String toString() {
        return this.f19838a.toString().concat(".reverse()");
    }
}
