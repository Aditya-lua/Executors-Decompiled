package p515we;

import af.C0218f0;
import af.C0222h0;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10229j;
import pe.InterfaceC10232m;

/* JADX INFO: renamed from: we.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C12398w {

    /* JADX INFO: renamed from: b */
    public static final a<C12389q> f44358b = new a() { // from class: we.v
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C12398w.m46467e((C12389q) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final C12398w f44359c = m46469g();

    /* JADX INFO: renamed from: a */
    public final Map<Class<? extends AbstractC10243x>, a<? extends AbstractC10243x>> f44360a = new HashMap();

    /* JADX INFO: renamed from: we.w$a */
    public interface a<ParametersT extends AbstractC10243x> {
        /* JADX INFO: renamed from: a */
        AbstractC10231l mo7276a(ParametersT parameterst, Integer num);
    }

    /* JADX INFO: renamed from: e */
    public static C12387p m46467e(C12389q c12389q, Integer num) throws GeneralSecurityException {
        C0222h0 c0222h0M46404d = c12389q.m46421b().m46404d();
        InterfaceC10232m<?> interfaceC10232mM46386c = C12379l.m46383d().m46386c(c0222h0M46404d.m763f0());
        if (!C12379l.m46383d().m46388f(c0222h0M46404d.m763f0())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        C0218f0 c0218f0Mo39336b = interfaceC10232mM46386c.mo39336b(c0222h0M46404d.m764g0());
        return new C12387p(C12380l0.m46391b(c0218f0Mo39336b.m722f0(), c0218f0Mo39336b.m723g0(), c0218f0Mo39336b.m721e0(), c0222h0M46404d.m762e0(), num), C10229j.m39322a());
    }

    /* JADX INFO: renamed from: f */
    public static C12398w m46468f() {
        return f44359c;
    }

    /* JADX INFO: renamed from: g */
    public static C12398w m46469g() {
        C12398w c12398w = new C12398w();
        try {
            c12398w.m46470b(f44358b, C12389q.class);
            return c12398w;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized <ParametersT extends AbstractC10243x> void m46470b(a<ParametersT> aVar, Class<ParametersT> cls) {
        try {
            a<? extends AbstractC10243x> aVar2 = this.f44360a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f44360a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public AbstractC10231l m46471c(AbstractC10243x abstractC10243x, Integer num) {
        return m46472d(abstractC10243x, num);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized <ParametersT extends AbstractC10243x> AbstractC10231l m46472d(ParametersT parameterst, Integer num) {
        a<? extends AbstractC10243x> aVar;
        aVar = this.f44360a.get(parameterst.getClass());
        if (aVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + parameterst + ": no key creator for this class was registered.");
        }
        return aVar.mo7276a(parameterst, num);
    }
}
