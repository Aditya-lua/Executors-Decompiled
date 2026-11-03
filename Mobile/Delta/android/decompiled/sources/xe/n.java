package xe;

import af.c0;
import af.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import we.a0;
import we.h0;
import we.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0<i, g> f35710a = h0.b(new h0.b() { // from class: xe.j
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return new ye.h((i) lVar);
        }
    }, i.class, g.class);
    public static final h0<i, pe.w> b = h0.b(new h0.b() { // from class: xe.k
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.t.d((i) lVar);
        }
    }, i.class, pe.w.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pe.m<pe.w> f35711c = we.o.e("type.googleapis.com/google.crypto.tink.HmacKey", pe.w.class, f0.c.SYMMETRIC, c0.i0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.x.a<o> f35712d = new qe.h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.w.a<o> f35713e = new we.w.a() { // from class: xe.l
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return n.b((o) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ue.b.EnumC0590b f35714f = ue.b.EnumC0590b.b;

    public static i b(o oVar, Integer num) {
        return i.b().e(oVar).d(ef.c.b(oVar.e())).c(num).a();
    }

    public static final pe.o c() {
        return (pe.o) r0.a(new r0.a() { // from class: xe.m
            @Override // we.r0.a
            public final Object get() {
                return pe.o.a(o.b().c(32).d(16).b(o.c.f35722d).e(o.d.b).a());
            }
        });
    }

    public static Map<String, pe.x> d() {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", z.f35736a);
        o.b bVarD = o.b().c(32).d(16);
        o.d dVar = o.d.f35728e;
        o.b bVarE = bVarD.e(dVar);
        o.c cVar = o.c.f35722d;
        map.put("HMAC_SHA256_128BITTAG_RAW", bVarE.b(cVar).a());
        o.b bVarD2 = o.b().c(32).d(32);
        o.d dVar2 = o.d.b;
        map.put("HMAC_SHA256_256BITTAG", bVarD2.e(dVar2).b(cVar).a());
        map.put("HMAC_SHA256_256BITTAG_RAW", o.b().c(32).d(32).e(dVar).b(cVar).a());
        o.b bVarE2 = o.b().c(64).d(16).e(dVar2);
        o.c cVar2 = o.c.f35724f;
        map.put("HMAC_SHA512_128BITTAG", bVarE2.b(cVar2).a());
        map.put("HMAC_SHA512_128BITTAG_RAW", o.b().c(64).d(16).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG", o.b().c(64).d(32).e(dVar2).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG_RAW", o.b().c(64).d(32).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_512BITTAG", z.f35738d);
        map.put("HMAC_SHA512_512BITTAG_RAW", o.b().c(64).d(64).e(dVar).b(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        ue.b.EnumC0590b enumC0590b = f35714f;
        if (!enumC0590b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        ye.m.h();
        a0.c().d(f35710a);
        a0.c().d(b);
        we.z.a().c(d());
        we.w.f().b(f35713e, o.class);
        we.x.b().a(f35712d, o.class);
        we.l.d().h(f35711c, enumC0590b, z10);
    }
}
