package se;

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
    public static final ye.h0<v, re.a> f31450a = ye.h0.b(new ye.h0.b() { // from class: se.w
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ue.a.d((v) lVar);
        }
    }, v.class, re.a.class);
    public static final ye.w.a<z> b = new ye.w.a() { // from class: se.x
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return y.c((z) xVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.x.a<z> f31451c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final re.m<re.a> f31452d = ye.o.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey", re.a.class, cf.f0.c.SYMMETRIC, cf.n.f0());

    public static boolean b() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static v c(z zVar, Integer num) {
        return v.b().e(zVar).c(num).d(gf.c.b(zVar.c())).a();
    }

    public static Map<String, re.x> d() throws InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        z.b bVarB = z.b().b(16);
        z.c cVar = z.c.b;
        map.put("AES128_GCM_SIV", bVarB.c(cVar).a());
        z.b bVarB2 = z.b().b(16);
        z.c cVar2 = z.c.f31456d;
        map.put("AES128_GCM_SIV_RAW", bVarB2.c(cVar2).a());
        map.put("AES256_GCM_SIV", z.b().b(32).c(cVar).a());
        map.put("AES256_GCM_SIV_RAW", z.b().b(32).c(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!we.b.EnumC0736b.f35740a.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        te.u.g();
        if (b()) {
            ye.a0.c().d(f31450a);
            ye.z.a().c(d());
            ye.x.b().a(f31451c, z.class);
            ye.w.f().b(b, z.class);
            ye.l.d().g(f31452d, z10);
        }
    }
}
