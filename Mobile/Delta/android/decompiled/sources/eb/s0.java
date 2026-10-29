package eb;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements q0 {
    public static final q0 b = new q0() { // from class: eb.r0
        @Override // eb.q0
        public final Object zza() {
            throw null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile q0 f15389a;

    public s0(q0 q0Var) {
        this.f15389a = q0Var;
    }

    public final String toString() {
        Object obj = this.f15389a;
        if (obj == b) {
            obj = "<supplier that returned null>";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // eb.q0
    public final Object zza() {
        throw null;
    }
}
