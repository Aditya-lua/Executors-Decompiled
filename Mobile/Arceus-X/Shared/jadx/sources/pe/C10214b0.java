package pe;

import af.C0218f0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import p515we.C12358a0;
import p515we.C12376j0;
import p515we.C12379l;
import p602ze.InterfaceC13793a;

/* JADX INFO: renamed from: pe.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10214b0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f36822a = Logger.getLogger(C10214b0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMap<String, Object> f36823b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final Set<Class<?>> f36824c = Collections.unmodifiableSet(m39298a());

    /* JADX INFO: renamed from: a */
    public static Set<Class<?>> m39298a() {
        HashSet hashSet = new HashSet();
        hashSet.add(InterfaceC10211a.class);
        hashSet.add(InterfaceC10223g.class);
        hashSet.add(InterfaceC10220e0.class);
        hashSet.add(InterfaceC10227i.class);
        hashSet.add(InterfaceC10225h.class);
        hashSet.add(InterfaceC10242w.class);
        hashSet.add(InterfaceC13793a.class);
        hashSet.add(InterfaceC10245z.class);
        hashSet.add(InterfaceC10212a0.class);
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public static Class<?> m39299b(Class<?> cls) {
        try {
            return C12358a0.m46226c().m46227a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static <P> P m39300c(C0218f0 c0218f0, Class<P> cls) {
        return (P) m39301d(c0218f0.m722f0(), c0218f0.m723g0(), cls);
    }

    /* JADX INFO: renamed from: d */
    public static <P> P m39301d(String str, AbstractC2920h abstractC2920h, Class<P> cls) {
        return C12379l.m46383d().m46384a(str, cls).mo39338d(abstractC2920h);
    }

    /* JADX INFO: renamed from: e */
    public static <B, P> P m39302e(C12376j0<B> c12376j0, Class<P> cls) {
        return (P) C12358a0.m46226c().m46231f(c12376j0, cls);
    }
}
