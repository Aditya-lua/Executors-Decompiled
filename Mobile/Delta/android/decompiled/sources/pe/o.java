package pe;

import java.security.GeneralSecurityException;
import we.m0;
import we.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af.h0 f28680a = null;
    public final x b;

    public o(x xVar) {
        this.b = xVar;
    }

    public static o a(x xVar) {
        return new o(xVar);
    }

    public af.h0 b() {
        try {
            return c();
        } catch (GeneralSecurityException e10) {
            throw new r0("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + this.b, e10);
        }
    }

    public af.h0 c() {
        af.h0 h0Var = this.f28680a;
        if (h0Var != null) {
            return h0Var;
        }
        x xVar = this.b;
        return xVar instanceof we.q ? ((we.q) xVar).b().d() : ((m0) we.d0.c().o(this.b, m0.class)).d();
    }

    public x d() {
        x xVar = this.b;
        return xVar != null ? xVar : h0.a(b().n());
    }
}
