package ve;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f32980c = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f32981d = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentMap<String, oe.m<?>> f32982a = new ConcurrentHashMap();
    public ConcurrentMap<String, Boolean> b = new ConcurrentHashMap();

    public static l d() {
        return f32981d;
    }

    public <P> oe.m<P> a(String str, Class<P> cls) throws GeneralSecurityException {
        oe.m<P> mVar = (oe.m<P>) b(str);
        if (mVar.a().equals(cls)) {
            return mVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + mVar.getClass() + ", which only supports: " + mVar.a());
    }

    public final synchronized oe.m<?> b(String str) {
        if (!this.f32982a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f32982a.get(str);
    }

    public oe.m<?> c(String str) {
        return b(str);
    }

    public final synchronized void e(oe.m<?> mVar, boolean z10, boolean z11) {
        try {
            String strC = mVar.c();
            if (z11 && this.b.containsKey(strC) && !this.b.get(strC).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strC);
            }
            oe.m<?> mVar2 = this.f32982a.get(strC);
            if (mVar2 != null && !mVar2.getClass().equals(mVar.getClass())) {
                f32980c.warning("Attempted overwrite of a registered key manager for key type " + strC);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strC, mVar2.getClass().getName(), mVar.getClass().getName()));
            }
            if (z10) {
                this.f32982a.put(strC, mVar);
            } else {
                this.f32982a.putIfAbsent(strC, mVar);
            }
            this.b.put(strC, Boolean.valueOf(z11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean f(String str) {
        return this.b.get(str).booleanValue();
    }

    public synchronized <P> void g(oe.m<P> mVar, boolean z10) {
        h(mVar, te.b.EnumC0569b.f31710a, z10);
    }

    public synchronized <P> void h(oe.m<P> mVar, te.b.EnumC0569b enumC0569b, boolean z10) {
        if (!enumC0569b.a()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(mVar, false, z10);
    }
}
