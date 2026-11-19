package re;

import java.security.GeneralSecurityException;
import ye.m0;
import ye.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf.h0 f30683a = null;
    public final x b;

    public o(x xVar) {
        this.b = xVar;
    }

    public static o a(x xVar) {
        return new o(xVar);
    }

    public cf.h0 b() {
        try {
            return c();
        } catch (GeneralSecurityException e10) {
            throw new r0("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + this.b, e10);
        }
    }

    public cf.h0 c() {
        cf.h0 h0Var = this.f30683a;
        if (h0Var != null) {
            return h0Var;
        }
        x xVar = this.b;
        return xVar instanceof ye.q ? ((ye.q) xVar).b().d() : ((m0) ye.d0.c().o(this.b, m0.class)).d();
    }

    public x d() {
        x xVar = this.b;
        return xVar != null ? xVar : h0.a(b().n());
    }
}
