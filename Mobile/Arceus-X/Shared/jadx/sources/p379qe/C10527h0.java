package p379qe;

import af.C0218f0;
import af.C0230l0;
import java.security.GeneralSecurityException;
import p465ue.C11844b;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12379l;
import p515we.C12385o;
import p515we.C12398w;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10240u;
import pe.InterfaceC10211a;
import pe.InterfaceC10232m;
import re.C10835j0;

/* JADX INFO: renamed from: qe.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10527h0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C10542m0, InterfaceC10211a> f37761a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: qe.f0
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C10527h0.m40365c((C10542m0) abstractC10231l);
        }
    }, C10542m0.class, InterfaceC10211a.class);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10232m<InterfaceC10211a> f37762b = C12385o.m46414e(m40366d(), InterfaceC10211a.class, C0218f0.c.REMOTE, C0230l0.m872f0());

    /* JADX INFO: renamed from: c */
    public static final C12398w.a<C10545n0> f37763c = new C12398w.a() { // from class: qe.g0
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C10527h0.m40367e((C10545n0) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m40365c(C10542m0 c10542m0) {
        return C10835j0.m41245c(C10240u.m39399a(c10542m0.m40425d().m40427c()).mo39398b(c10542m0.m40425d().m40427c()), c10542m0.m40424c());
    }

    /* JADX INFO: renamed from: d */
    public static String m40366d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    /* JADX INFO: renamed from: e */
    public static C10542m0 m40367e(C10545n0 c10545n0, Integer num) {
        return C10542m0.m40423b(c10545n0, num);
    }

    /* JADX INFO: renamed from: f */
    public static void m40368f(boolean z10) throws GeneralSecurityException {
        if (!C11844b.b.f41601a.mo44243a()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        C10560s0.m40472g();
        C12358a0.m46226c().m46229d(f37761a);
        C12398w.m46468f().m46470b(f37763c, C10545n0.class);
        C12379l.m46383d().m46389g(f37762b, z10);
    }
}
