package p100eb;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: eb.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5009t0 implements Serializable, InterfaceC4991q0 {

    /* JADX INFO: renamed from: a */
    public final Object f19808a;

    public C5009t0(Object obj) {
        this.f19808a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5009t0) {
            return C4961l0.m23651a(this.f19808a, ((C5009t0) obj).f19808a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19808a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f19808a.toString() + ")";
    }

    @Override // p100eb.InterfaceC4991q0
    public final Object zza() {
        return this.f19808a;
    }
}
