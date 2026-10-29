package p544xe;

import af.C0203a;
import af.C0218f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p076df.C4598t;
import p102ef.C5111c;
import p465ue.C11844b;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12379l;
import p515we.C12385o;
import p515we.C12398w;
import p515we.C12401z;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.InterfaceC10232m;
import pe.InterfaceC10242w;
import ye.C13177e;
import ye.C13179g;

/* JADX INFO: renamed from: xe.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C12807e {

    /* JADX INFO: renamed from: a */
    public static final C12398w.a<C12808f> f45554a = new C12398w.a() { // from class: xe.b
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C12807e.m47693d((C12808f) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C12803a, InterfaceC12809g> f45555b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: xe.c
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C12807e.m47694e((C12803a) abstractC10231l);
        }
    }, C12803a.class, InterfaceC12809g.class);

    /* JADX INFO: renamed from: c */
    public static final AbstractC12372h0<C12803a, InterfaceC10242w> f45556c = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: xe.d
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C12807e.m47695f((C12803a) abstractC10231l);
        }
    }, C12803a.class, InterfaceC10242w.class);

    /* JADX INFO: renamed from: d */
    public static final InterfaceC10232m<InterfaceC10242w> f45557d = C12385o.m46414e("type.googleapis.com/google.crypto.tink.AesCmacKey", InterfaceC10242w.class, C0218f0.c.SYMMETRIC, C0203a.m563h0());

    /* JADX INFO: renamed from: d */
    public static C12803a m47693d(C12808f c12808f, Integer num) throws GeneralSecurityException {
        m47698i(c12808f);
        return C12803a.m47681b().m47689e(c12808f).m47687c(C5111c.m23854b(c12808f.m47701d())).m47688d(num).m47685a();
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC12809g m47694e(C12803a c12803a) throws GeneralSecurityException {
        m47698i(c12803a.m47684e());
        return new C13179g(c12803a);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC10242w m47695f(C12803a c12803a) throws GeneralSecurityException {
        m47698i(c12803a.m47684e());
        return C4598t.m22720c(c12803a);
    }

    /* JADX INFO: renamed from: g */
    public static Map<String, AbstractC10243x> m47696g() {
        HashMap map = new HashMap();
        C12808f c12808f = C12828z.f45616e;
        map.put("AES_CMAC", c12808f);
        map.put("AES256_CMAC", c12808f);
        map.put("AES256_CMAC_RAW", C12808f.m47699b().m47705b(32).m47706c(16).m47707d(C12808f.c.f45567e).m47704a());
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: h */
    public static void m47697h(boolean z10) {
        if (!C11844b.b.f41601a.mo44243a()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        C13177e.m48783h();
        C12398w.m46468f().m46470b(f45554a, C12808f.class);
        C12358a0.m46226c().m46229d(f45555b);
        C12358a0.m46226c().m46229d(f45556c);
        C12401z.m46477a().m46479c(m47696g());
        C12379l.m46383d().m46389g(f45557d, z10);
    }

    /* JADX INFO: renamed from: i */
    public static void m47698i(C12808f c12808f) throws GeneralSecurityException {
        if (c12808f.m47701d() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
