package eb;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Serializable, q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16010a;

    public t0(Object obj) {
        this.f16010a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t0) {
            return l0.a(this.f16010a, ((t0) obj).f16010a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16010a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f16010a.toString() + ")";
    }

    @Override // eb.q0
    public final Object zza() {
        return this.f16010a;
    }
}
