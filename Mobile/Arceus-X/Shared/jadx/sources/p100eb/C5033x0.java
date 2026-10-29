package p100eb;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: eb.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5033x0 extends AbstractC5004s1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Comparator f19837a;

    public C5033x0(Comparator comparator) {
        comparator.getClass();
        this.f19837a = comparator;
    }

    @Override // p100eb.AbstractC5004s1, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f19837a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5033x0) {
            return this.f19837a.equals(((C5033x0) obj).f19837a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19837a.hashCode();
    }

    public final String toString() {
        return this.f19837a.toString();
    }
}
