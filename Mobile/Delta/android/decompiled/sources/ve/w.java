package ve;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w {
    public static final a<q> b = new a() { // from class: ve.v
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return w.e((q) xVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f33022c = g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends oe.x>, a<? extends oe.x>> f33023a = new HashMap();

    public interface a<ParametersT extends oe.x> {
        oe.l a(ParametersT parameterst, Integer num);
    }

    public static p e(q qVar, Integer num) throws GeneralSecurityException {
        ze.h0 h0VarD = qVar.b().d();
        oe.m<?> mVarC = l.d().c(h0VarD.f0());
        if (!l.d().f(h0VarD.f0())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        ze.f0 f0VarB = mVarC.b(h0VarD.g0());
        return new p(l0.b(f0VarB.f0(), f0VarB.g0(), f0VarB.e0(), h0VarD.e0(), num), oe.j.a());
    }

    public static w f() {
        return f33022c;
    }

    public static w g() {
        w wVar = new w();
        try {
            wVar.b(b, q.class);
            return wVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    public synchronized <ParametersT extends oe.x> void b(a<ParametersT> aVar, Class<ParametersT> cls) {
        try {
            a<? extends oe.x> aVar2 = this.f33023a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f33023a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public oe.l c(oe.x xVar, Integer num) {
        return d(xVar, num);
    }

    public final synchronized <ParametersT extends oe.x> oe.l d(ParametersT parameterst, Integer num) {
        a<? extends oe.x> aVar;
        aVar = this.f33023a.get(parameterst.getClass());
        if (aVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + parameterst + ": no key creator for this class was registered.");
        }
        return aVar.a(parameterst, num);
    }
}
