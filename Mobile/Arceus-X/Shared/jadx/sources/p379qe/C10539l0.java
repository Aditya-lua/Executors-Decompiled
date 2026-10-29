package p379qe;

import af.C0218f0;
import af.C0234n0;
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

/* JADX INFO: renamed from: qe.l0 */
/* JADX INFO: loaded from: classes2.dex */
public class C10539l0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC10232m<InterfaceC10211a> f37819a = C12385o.m46414e(m40420d(), InterfaceC10211a.class, C0218f0.c.SYMMETRIC, C0234n0.m906f0());

    /* JADX INFO: renamed from: b */
    public static final C12398w.a<C10566u0> f37820b = new C12398w.a() { // from class: qe.j0
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C10539l0.m40421e((C10566u0) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final AbstractC12372h0<C10563t0, InterfaceC10211a> f37821c = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: qe.k0
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C10539l0.m40419c((C10563t0) abstractC10231l);
        }
    }, C10563t0.class, InterfaceC10211a.class);

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m40419c(C10563t0 c10563t0) {
        String strM40507d = c10563t0.m40492d().m40507d();
        return C10835j0.m41245c(C10530i0.m40369d(c10563t0.m40492d().m40506c(), C10240u.m39399a(strM40507d).mo39398b(strM40507d)), c10563t0.m40491c());
    }

    /* JADX INFO: renamed from: d */
    public static String m40420d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    /* JADX INFO: renamed from: e */
    public static C10563t0 m40421e(C10566u0 c10566u0, Integer num) {
        return C10563t0.m40490b(c10566u0, num);
    }

    /* JADX INFO: renamed from: f */
    public static void m40422f(boolean z10) throws GeneralSecurityException {
        if (!C11844b.b.f41601a.mo44243a()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        C10576z0.m40542h();
        C12398w.m46468f().m46470b(f37820b, C10566u0.class);
        C12358a0.m46226c().m46229d(f37821c);
        C12379l.m46383d().m46389g(f37819a, z10);
    }
}
