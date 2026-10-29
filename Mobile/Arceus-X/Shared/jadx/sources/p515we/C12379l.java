package p515we;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import p465ue.C11844b;
import pe.InterfaceC10232m;

/* JADX INFO: renamed from: we.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C12379l {

    /* JADX INFO: renamed from: c */
    public static final Logger f44301c = Logger.getLogger(C12379l.class.getName());

    /* JADX INFO: renamed from: d */
    public static final C12379l f44302d = new C12379l();

    /* JADX INFO: renamed from: a */
    public ConcurrentMap<String, InterfaceC10232m<?>> f44303a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public ConcurrentMap<String, Boolean> f44304b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static C12379l m46383d() {
        return f44302d;
    }

    /* JADX INFO: renamed from: a */
    public <P> InterfaceC10232m<P> m46384a(String str, Class<P> cls) throws GeneralSecurityException {
        InterfaceC10232m<P> interfaceC10232m = (InterfaceC10232m<P>) m46385b(str);
        if (interfaceC10232m.mo39335a().equals(cls)) {
            return interfaceC10232m;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + interfaceC10232m.getClass() + ", which only supports: " + interfaceC10232m.mo39335a());
    }

    /* JADX INFO: renamed from: b */
    public final synchronized InterfaceC10232m<?> m46385b(String str) {
        if (!this.f44303a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f44303a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC10232m<?> m46386c(String str) {
        return m46385b(str);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m46387e(InterfaceC10232m<?> interfaceC10232m, boolean z10, boolean z11) {
        try {
            String strMo39337c = interfaceC10232m.mo39337c();
            if (z11 && this.f44304b.containsKey(strMo39337c) && !this.f44304b.get(strMo39337c).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strMo39337c);
            }
            InterfaceC10232m<?> interfaceC10232m2 = this.f44303a.get(strMo39337c);
            if (interfaceC10232m2 != null && !interfaceC10232m2.getClass().equals(interfaceC10232m.getClass())) {
                f44301c.warning("Attempted overwrite of a registered key manager for key type " + strMo39337c);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strMo39337c, interfaceC10232m2.getClass().getName(), interfaceC10232m.getClass().getName()));
            }
            if (z10) {
                this.f44303a.put(strMo39337c, interfaceC10232m);
            } else {
                this.f44303a.putIfAbsent(strMo39337c, interfaceC10232m);
            }
            this.f44304b.put(strMo39337c, Boolean.valueOf(z11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m46388f(String str) {
        return this.f44304b.get(str).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public synchronized <P> void m46389g(InterfaceC10232m<P> interfaceC10232m, boolean z10) {
        m46390h(interfaceC10232m, C11844b.b.f41601a, z10);
    }

    /* JADX INFO: renamed from: h */
    public synchronized <P> void m46390h(InterfaceC10232m<P> interfaceC10232m, C11844b.b bVar, boolean z10) {
        if (!bVar.mo44243a()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        m46387e(interfaceC10232m, false, z10);
    }
}
