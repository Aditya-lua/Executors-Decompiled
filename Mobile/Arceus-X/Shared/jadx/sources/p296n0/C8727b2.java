package p296n0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: n0.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8727b2 {

    /* JADX INFO: renamed from: a */
    public static final Object f31769a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Map<Object, InterfaceC8773j0> f31770b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static InterfaceC8773j0 m35008a(Object obj) {
        InterfaceC8773j0 interfaceC8773j0;
        synchronized (f31769a) {
            interfaceC8773j0 = f31770b.get(obj);
        }
        return interfaceC8773j0 == null ? InterfaceC8773j0.f31915a : interfaceC8773j0;
    }
}
