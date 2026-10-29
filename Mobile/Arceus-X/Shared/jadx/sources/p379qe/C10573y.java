package p379qe;

import af.C0218f0;
import af.C0233n;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p102ef.C5111c;
import p465ue.C11844b;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12379l;
import p515we.C12385o;
import p515we.C12398w;
import p515we.C12399x;
import p515we.C12401z;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.InterfaceC10211a;
import pe.InterfaceC10232m;
import re.C10856u;
import se.C11290a;

/* JADX INFO: renamed from: qe.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C10573y {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C10567v, InterfaceC10211a> f37923a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: qe.w
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C11290a.m42373d((C10567v) abstractC10231l);
        }
    }, C10567v.class, InterfaceC10211a.class);

    /* JADX INFO: renamed from: b */
    public static final C12398w.a<C10575z> f37924b = new C12398w.a() { // from class: qe.x
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C10573y.m40526c((C10575z) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final C12399x.a<C10575z> f37925c = new C10526h();

    /* JADX INFO: renamed from: d */
    public static final InterfaceC10232m<InterfaceC10211a> f37926d = C12385o.m46414e("type.googleapis.com/google.crypto.tink.AesGcmSivKey", InterfaceC10211a.class, C0218f0.c.SYMMETRIC, C0233n.m897f0());

    /* JADX INFO: renamed from: b */
    public static boolean m40525b() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C10567v m40526c(C10575z c10575z, Integer num) {
        return C10567v.m40515b().m40523e(c10575z).m40521c(num).m40522d(C5111c.m23854b(c10575z.m40530c())).m40519a();
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, AbstractC10243x> m40527d() throws InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        C10575z.b bVarM40533b = C10575z.m40529b().m40533b(16);
        C10575z.c cVar = C10575z.c.f37931b;
        map.put("AES128_GCM_SIV", bVarM40533b.m40534c(cVar).m40532a());
        C10575z.b bVarM40533b2 = C10575z.m40529b().m40533b(16);
        C10575z.c cVar2 = C10575z.c.f37933d;
        map.put("AES128_GCM_SIV_RAW", bVarM40533b2.m40534c(cVar2).m40532a());
        map.put("AES256_GCM_SIV", C10575z.m40529b().m40533b(32).m40534c(cVar).m40532a());
        map.put("AES256_GCM_SIV_RAW", C10575z.m40529b().m40533b(32).m40534c(cVar2).m40532a());
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: e */
    public static void m40528e(boolean z10) throws GeneralSecurityException {
        if (!C11844b.b.f41601a.mo44243a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        C10856u.m41294g();
        if (m40525b()) {
            C12358a0.m46226c().m46229d(f37923a);
            C12401z.m46477a().m46479c(m40527d());
            C12399x.m46473b().m46474a(f37925c, C10575z.class);
            C12398w.m46468f().m46470b(f37924b, C10575z.class);
            C12379l.m46383d().m46389g(f37926d, z10);
        }
    }
}
