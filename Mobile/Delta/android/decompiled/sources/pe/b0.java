package pe;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import we.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f28668a = Logger.getLogger(b0.class.getName());
    public static final ConcurrentMap<String, Object> b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<Class<?>> f28669c = Collections.unmodifiableSet(a());

    public static Set<Class<?>> a() {
        HashSet hashSet = new HashSet();
        hashSet.add(a.class);
        hashSet.add(g.class);
        hashSet.add(e0.class);
        hashSet.add(i.class);
        hashSet.add(h.class);
        hashSet.add(w.class);
        hashSet.add(ze.a.class);
        hashSet.add(z.class);
        hashSet.add(a0.class);
        return hashSet;
    }

    public static Class<?> b(Class<?> cls) {
        try {
            return we.a0.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P c(af.f0 f0Var, Class<P> cls) {
        return (P) d(f0Var.f0(), f0Var.g0(), cls);
    }

    public static <P> P d(String str, com.google.crypto.tink.shaded.protobuf.h hVar, Class<P> cls) {
        return we.l.d().a(str, cls).d(hVar);
    }

    public static <B, P> P e(j0<B> j0Var, Class<P> cls) {
        return (P) we.a0.c().f(j0Var, cls);
    }
}
