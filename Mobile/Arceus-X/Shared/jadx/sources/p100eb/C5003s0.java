package p100eb;

/* JADX INFO: renamed from: eb.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5003s0 implements InterfaceC4991q0 {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4991q0 f19799b = new InterfaceC4991q0() { // from class: eb.r0
        @Override // p100eb.InterfaceC4991q0
        public final Object zza() {
            throw null;
        }
    };

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC4991q0 f19800a;

    public C5003s0(InterfaceC4991q0 interfaceC4991q0) {
        this.f19800a = interfaceC4991q0;
    }

    public final String toString() {
        Object obj = this.f19800a;
        if (obj == f19799b) {
            obj = "<supplier that returned null>";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // p100eb.InterfaceC4991q0
    public final Object zza() {
        throw null;
    }
}
