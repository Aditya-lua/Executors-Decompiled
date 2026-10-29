package pe;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve.h0<v, oe.a> f28571a = ve.h0.b(new ve.h0.b() { // from class: pe.w
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return re.a.d((v) lVar);
        }
    }, v.class, oe.a.class);
    public static final ve.w.a<z> b = new ve.w.a() { // from class: pe.x
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return y.c((z) xVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.x.a<z> f28572c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oe.m<oe.a> f28573d = ve.o.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey", oe.a.class, ze.f0.c.SYMMETRIC, ze.n.f0());

    public static boolean b() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static v c(z zVar, Integer num) {
        return v.b().e(zVar).c(num).d(df.c.b(zVar.c())).a();
    }

    public static Map<String, oe.x> d() throws InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        z.b bVarB = z.b().b(16);
        z.c cVar = z.c.b;
        map.put("AES128_GCM_SIV", bVarB.c(cVar).a());
        z.b bVarB2 = z.b().b(16);
        z.c cVar2 = z.c.f28577d;
        map.put("AES128_GCM_SIV_RAW", bVarB2.c(cVar2).a());
        map.put("AES256_GCM_SIV", z.b().b(32).c(cVar).a());
        map.put("AES256_GCM_SIV_RAW", z.b().b(32).c(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!te.b.EnumC0569b.f31710a.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        qe.u.g();
        if (b()) {
            ve.a0.c().d(f28571a);
            ve.z.a().c(d());
            ve.x.b().a(f28572c, z.class);
            ve.w.f().b(b, z.class);
            ve.l.d().g(f28573d, z10);
        }
    }
}
