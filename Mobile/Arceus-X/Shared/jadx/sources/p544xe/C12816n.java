package p544xe;

import af.C0210c0;
import af.C0218f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p076df.C4598t;
import p102ef.C5111c;
import p379qe.C10526h;
import p465ue.C11844b;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12379l;
import p515we.C12385o;
import p515we.C12392r0;
import p515we.C12398w;
import p515we.C12399x;
import p515we.C12401z;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10234o;
import pe.InterfaceC10232m;
import pe.InterfaceC10242w;
import ye.C13180h;
import ye.C13185m;

/* JADX INFO: renamed from: xe.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C12816n {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C12811i, InterfaceC12809g> f45578a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: xe.j
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return new C13180h((C12811i) abstractC10231l);
        }
    }, C12811i.class, InterfaceC12809g.class);

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C12811i, InterfaceC10242w> f45579b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: xe.k
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4598t.m22721d((C12811i) abstractC10231l);
        }
    }, C12811i.class, InterfaceC10242w.class);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10232m<InterfaceC10242w> f45580c = C12385o.m46414e("type.googleapis.com/google.crypto.tink.HmacKey", InterfaceC10242w.class, C0218f0.c.SYMMETRIC, C0210c0.m634i0());

    /* JADX INFO: renamed from: d */
    public static final C12399x.a<C12817o> f45581d = new C10526h();

    /* JADX INFO: renamed from: e */
    public static final C12398w.a<C12817o> f45582e = new C12398w.a() { // from class: xe.l
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C12816n.m47720b((C12817o) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final C11844b.b f45583f = C11844b.b.f41602b;

    /* JADX INFO: renamed from: b */
    public static C12811i m47720b(C12817o c12817o, Integer num) {
        return C12811i.m47710b().m47718e(c12817o).m47717d(C5111c.m23854b(c12817o.m47727e())).m47716c(num).m47714a();
    }

    /* JADX INFO: renamed from: c */
    public static final C10234o m47721c() {
        return (C10234o) C12392r0.m46444a(new C12392r0.a() { // from class: xe.m
            @Override // p515we.C12392r0.a
            public final Object get() {
                return C10234o.m39339a(C12817o.m47724b().m47733c(32).m47734d(16).m47732b(C12817o.c.f45594d).m47735e(C12817o.d.f45598b).m47731a());
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, AbstractC10243x> m47722d() {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", C12828z.f45612a);
        C12817o.b bVarM47734d = C12817o.m47724b().m47733c(32).m47734d(16);
        C12817o.d dVar = C12817o.d.f45601e;
        C12817o.b bVarM47735e = bVarM47734d.m47735e(dVar);
        C12817o.c cVar = C12817o.c.f45594d;
        map.put("HMAC_SHA256_128BITTAG_RAW", bVarM47735e.m47732b(cVar).m47731a());
        C12817o.b bVarM47734d2 = C12817o.m47724b().m47733c(32).m47734d(32);
        C12817o.d dVar2 = C12817o.d.f45598b;
        map.put("HMAC_SHA256_256BITTAG", bVarM47734d2.m47735e(dVar2).m47732b(cVar).m47731a());
        map.put("HMAC_SHA256_256BITTAG_RAW", C12817o.m47724b().m47733c(32).m47734d(32).m47735e(dVar).m47732b(cVar).m47731a());
        C12817o.b bVarM47735e2 = C12817o.m47724b().m47733c(64).m47734d(16).m47735e(dVar2);
        C12817o.c cVar2 = C12817o.c.f45596f;
        map.put("HMAC_SHA512_128BITTAG", bVarM47735e2.m47732b(cVar2).m47731a());
        map.put("HMAC_SHA512_128BITTAG_RAW", C12817o.m47724b().m47733c(64).m47734d(16).m47735e(dVar).m47732b(cVar2).m47731a());
        map.put("HMAC_SHA512_256BITTAG", C12817o.m47724b().m47733c(64).m47734d(32).m47735e(dVar2).m47732b(cVar2).m47731a());
        map.put("HMAC_SHA512_256BITTAG_RAW", C12817o.m47724b().m47733c(64).m47734d(32).m47735e(dVar).m47732b(cVar2).m47731a());
        map.put("HMAC_SHA512_512BITTAG", C12828z.f45615d);
        map.put("HMAC_SHA512_512BITTAG_RAW", C12817o.m47724b().m47733c(64).m47734d(64).m47735e(dVar).m47732b(cVar2).m47731a());
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: e */
    public static void m47723e(boolean z10) throws GeneralSecurityException {
        C11844b.b bVar = f45583f;
        if (!bVar.mo44243a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C13185m.m48798h();
        C12358a0.m46226c().m46229d(f45578a);
        C12358a0.m46226c().m46229d(f45579b);
        C12401z.m46477a().m46479c(m47722d());
        C12398w.m46468f().m46470b(f45582e, C12817o.class);
        C12399x.m46473b().m46474a(f45581d, C12817o.class);
        C12379l.m46383d().m46390h(f45580c, bVar, z10);
    }
}
