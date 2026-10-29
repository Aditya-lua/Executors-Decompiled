package ee;

import java.util.Set;

/* JADX INFO: renamed from: ee.t */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5095t extends AbstractC5087p implements Set {

    /* JADX INFO: renamed from: b */
    public transient AbstractC5093s f19909b;

    /* JADX INFO: renamed from: g */
    public static AbstractC5095t m23834g() {
        return C5099v.f19915f;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC5093s m23835e() {
        AbstractC5093s abstractC5093s = this.f19909b;
        if (abstractC5093s != null) {
            return abstractC5093s;
        }
        AbstractC5093s abstractC5093sMo23836f = mo23836f();
        this.f19909b = abstractC5093sMo23836f;
        return abstractC5093sMo23836f;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5095t) {
            ((AbstractC5095t) obj).mo23837h();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract AbstractC5093s mo23836f();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo23837h();
}
