package we;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f34434c = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f34435d = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentMap<String, pe.m<?>> f34436a = new ConcurrentHashMap();
    public ConcurrentMap<String, Boolean> b = new ConcurrentHashMap();

    public static l d() {
        return f34435d;
    }

    public <P> pe.m<P> a(String str, Class<P> cls) throws GeneralSecurityException {
        pe.m<P> mVar = (pe.m<P>) b(str);
        if (mVar.a().equals(cls)) {
            return mVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + mVar.getClass() + ", which only supports: " + mVar.a());
    }

    public final synchronized pe.m<?> b(String str) {
        if (!this.f34436a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f34436a.get(str);
    }

    public pe.m<?> c(String str) {
        return b(str);
    }

    public final synchronized void e(pe.m<?> mVar, boolean z10, boolean z11) {
        try {
            String strC = mVar.c();
            if (z11 && this.b.containsKey(strC) && !this.b.get(strC).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strC);
            }
            pe.m<?> mVar2 = this.f34436a.get(strC);
            if (mVar2 != null && !mVar2.getClass().equals(mVar.getClass())) {
                f34434c.warning("Attempted overwrite of a registered key manager for key type " + strC);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strC, mVar2.getClass().getName(), mVar.getClass().getName()));
            }
            if (z10) {
                this.f34436a.put(strC, mVar);
            } else {
                this.f34436a.putIfAbsent(strC, mVar);
            }
            this.b.put(strC, Boolean.valueOf(z11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean f(String str) {
        return this.b.get(str).booleanValue();
    }

    public synchronized <P> void g(pe.m<P> mVar, boolean z10) {
        h(mVar, ue.b.EnumC0590b.f32770a, z10);
    }

    public synchronized <P> void h(pe.m<P> mVar, ue.b.EnumC0590b enumC0590b, boolean z10) {
        if (!enumC0590b.a()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(mVar, false, z10);
    }
}
