package ze;

import cf.c0;
import cf.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ye.a0;
import ye.h0;
import ye.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0<i, g> f39261a = h0.b(new h0.b() { // from class: ze.j
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return new af.h((i) lVar);
        }
    }, i.class, g.class);
    public static final h0<i, re.w> b = h0.b(new h0.b() { // from class: ze.k
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.t.d((i) lVar);
        }
    }, i.class, re.w.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final re.m<re.w> f39262c = ye.o.e("type.googleapis.com/google.crypto.tink.HmacKey", re.w.class, f0.c.SYMMETRIC, c0.i0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.x.a<o> f39263d = new se.h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.w.a<o> f39264e = new ye.w.a() { // from class: ze.l
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return n.b((o) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.b.EnumC0736b f39265f = we.b.EnumC0736b.b;

    public static i b(o oVar, Integer num) {
        return i.b().e(oVar).d(gf.c.b(oVar.e())).c(num).a();
    }

    public static final re.o c() {
        return (re.o) r0.a(new r0.a() { // from class: ze.m
            @Override // ye.r0.a
            public final Object get() {
                return re.o.a(o.b().c(32).d(16).b(o.c.f39273d).e(o.d.b).a());
            }
        });
    }

    public static Map<String, re.x> d() {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", z.f39287a);
        o.b bVarD = o.b().c(32).d(16);
        o.d dVar = o.d.f39279e;
        o.b bVarE = bVarD.e(dVar);
        o.c cVar = o.c.f39273d;
        map.put("HMAC_SHA256_128BITTAG_RAW", bVarE.b(cVar).a());
        o.b bVarD2 = o.b().c(32).d(32);
        o.d dVar2 = o.d.b;
        map.put("HMAC_SHA256_256BITTAG", bVarD2.e(dVar2).b(cVar).a());
        map.put("HMAC_SHA256_256BITTAG_RAW", o.b().c(32).d(32).e(dVar).b(cVar).a());
        o.b bVarE2 = o.b().c(64).d(16).e(dVar2);
        o.c cVar2 = o.c.f39275f;
        map.put("HMAC_SHA512_128BITTAG", bVarE2.b(cVar2).a());
        map.put("HMAC_SHA512_128BITTAG_RAW", o.b().c(64).d(16).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG", o.b().c(64).d(32).e(dVar2).b(cVar2).a());
        map.put("HMAC_SHA512_256BITTAG_RAW", o.b().c(64).d(32).e(dVar).b(cVar2).a());
        map.put("HMAC_SHA512_512BITTAG", z.f39289d);
        map.put("HMAC_SHA512_512BITTAG_RAW", o.b().c(64).d(64).e(dVar).b(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        we.b.EnumC0736b enumC0736b = f39265f;
        if (!enumC0736b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        af.m.h();
        a0.c().d(f39261a);
        a0.c().d(b);
        ye.z.a().c(d());
        ye.w.f().b(f39264e, o.class);
        ye.x.b().a(f39263d, o.class);
        ye.l.d().h(f39262c, enumC0736b, z10);
    }
}
