package fb;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements q0 {
    public static final q0 b = new q0() { // from class: fb.r0
        @Override // fb.q0
        public final Object zza() {
            throw null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile q0 f15859a;

    public s0(q0 q0Var) {
        this.f15859a = q0Var;
    }

    public final String toString() {
        Object obj = this.f15859a;
        if (obj == b) {
            obj = "<supplier that returned null>";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // fb.q0
    public final Object zza() {
        throw null;
    }
}
