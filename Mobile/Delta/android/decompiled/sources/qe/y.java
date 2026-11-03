package qe;

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
    public static final we.h0<v, pe.a> f29819a = we.h0.b(new we.h0.b() { // from class: qe.w
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return se.a.d((v) lVar);
        }
    }, v.class, pe.a.class);
    public static final we.w.a<z> b = new we.w.a() { // from class: qe.x
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return y.c((z) xVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.x.a<z> f29820c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.a> f29821d = we.o.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey", pe.a.class, af.f0.c.SYMMETRIC, af.n.f0());

    public static boolean b() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static v c(z zVar, Integer num) {
        return v.b().e(zVar).c(num).d(ef.c.b(zVar.c())).a();
    }

    public static Map<String, pe.x> d() throws InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        z.b bVarB = z.b().b(16);
        z.c cVar = z.c.b;
        map.put("AES128_GCM_SIV", bVarB.c(cVar).a());
        z.b bVarB2 = z.b().b(16);
        z.c cVar2 = z.c.f29825d;
        map.put("AES128_GCM_SIV_RAW", bVarB2.c(cVar2).a());
        map.put("AES256_GCM_SIV", z.b().b(32).c(cVar).a());
        map.put("AES256_GCM_SIV_RAW", z.b().b(32).c(cVar2).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!ue.b.EnumC0590b.f32770a.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        re.u.g();
        if (b()) {
            we.a0.c().d(f29819a);
            we.z.a().c(d());
            we.x.b().a(f29820c, z.class);
            we.w.f().b(b, z.class);
            we.l.d().g(f29821d, z10);
        }
    }
}
