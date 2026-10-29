package we;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ve.a0;
import ve.h0;
import ve.r0;
import ze.c0;
import ze.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0<i, g> f34211a = h0.b(new h0.b() { // from class: we.j
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return new xe.h((i) lVar);
        }
    }, i.class, g.class);
    public static final h0<i, oe.w> b = h0.b(new h0.b() { // from class: we.k
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.t.d((i) lVar);
        }
    }, i.class, oe.w.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oe.m<oe.w> f34212c = ve.o.e("type.googleapis.com/google.crypto.tink.HmacKey", oe.w.class, f0.c.SYMMETRIC, c0.i0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.x.a<o> f34213d = new pe.h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.w.a<o> f34214e = new ve.w.a() { // from class: we.l
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return n.b((o) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final te.b.EnumC0569b f34215f = te.b.EnumC0569b.b;

    public static i b(o oVar, Integer num) {
        return i.b().e(oVar).d(df.c.b(oVar.e())).c(num).a();
    }

    public static final oe.o c() {
        return (oe.o) r0.a(new r0.a() { // from class: we.m
            @Override // ve.r0.a
            public final Object get() {
                return oe.o.a(o.b().c(32).d(16).b(o.c.f34223d).e(o.d.b).a());
            }
        });
    }

    public static Map<String, oe.x> d() {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", z.f34237a);
        o.b bVarD = o.b().c(32).d(16);
        o.d dVar = o.d.f34229e;
        o.b bVarE = bVarD.e(dVar);
        o.c cVar = o.c.f34223d;
        map.put("HMAC_SHA256_128BITTAG_RAW", bVarE.b(cVar).a());
        o.b bVarD2 = o.b().c(32).d(32);
        o.d dVar2 = o.d.b;
        map.put("HMAC_SHA256_256BITTAG", bVarD2.e(dVar2).b(cVar).a());
        map.put("HMAC_SHA256_256BITTAG_RAW", o.b().c(32).d(32).e(dVar).b(cVar).a());
        o.b bVarE2 = o.b().c(64).d(16).e(dVar2);
        o.c cVar2 = o.c.f34225f;
        map.put("HMAC_SHA512_128BITTAG", bVarE2.b(cVar2).a());
        map.put("HMAC_SHA512_128BITTAG_RAW", o.b().c(64).d(16).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG", o.b().c(64).d(32).e(dVar2).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG_RAW", o.b().c(64).d(32).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_512BITTAG", z.f34239d);
        map.put("HMAC_SHA512_512BITTAG_RAW", o.b().c(64).d(64).e(dVar).b(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        te.b.EnumC0569b enumC0569b = f34215f;
        if (!enumC0569b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        xe.m.h();
        a0.c().d(f34211a);
        a0.c().d(b);
        ve.z.a().c(d());
        ve.w.f().b(f34214e, o.class);
        ve.x.b().a(f34213d, o.class);
        ve.l.d().h(f34212c, enumC0569b, z10);
    }
}
