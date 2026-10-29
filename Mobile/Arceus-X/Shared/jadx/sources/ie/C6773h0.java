package ie;

/* JADX INFO: renamed from: ie.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6773h0 {
    /* JADX INFO: renamed from: a */
    public static boolean m28910a(InterfaceC6771g0<?, ?> interfaceC6771g0, Object obj) {
        if (obj == interfaceC6771g0) {
            return true;
        }
        if (obj instanceof InterfaceC6771g0) {
            return interfaceC6771g0.mo28888a().equals(((InterfaceC6771g0) obj).mo28888a());
        }
        return false;
    }
}
