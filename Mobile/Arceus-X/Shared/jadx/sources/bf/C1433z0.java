package bf;

import af.C0240q0;
import java.security.GeneralSecurityException;
import p447te.C11636a;

/* JADX INFO: renamed from: bf.z0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1433z0 {

    /* JADX INFO: renamed from: a */
    public static final String f5596a = m7392b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");

    /* JADX INFO: renamed from: b */
    public static final String f5597b = m7392b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");

    /* JADX INFO: renamed from: c */
    public static final String f5598c = m7392b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");

    /* JADX INFO: renamed from: d */
    public static final String f5599d = m7392b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");

    /* JADX INFO: renamed from: e */
    public static final String f5600e = m7392b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");

    /* JADX INFO: renamed from: f */
    public static final String f5601f = m7392b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");

    /* JADX INFO: renamed from: g */
    public static final String f5602g = m7392b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");

    /* JADX INFO: renamed from: h */
    public static final String f5603h = m7392b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");

    /* JADX INFO: renamed from: i */
    @Deprecated
    public static final C0240q0 f5604i = C0240q0.m946a0();

    /* JADX INFO: renamed from: j */
    @Deprecated
    public static final C0240q0 f5605j = C0240q0.m946a0();

    /* JADX INFO: renamed from: k */
    @Deprecated
    public static final C0240q0 f5606k = C0240q0.m946a0();

    static {
        try {
            m7391a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m7391a() throws GeneralSecurityException {
        m7393c();
    }

    /* JADX INFO: renamed from: b */
    public static String m7392b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static void m7393c() throws GeneralSecurityException {
        C1395g0.m7282d();
        C1399i0.m7291d();
        C1394g.m7281e(true);
        C1413p0.m7345e(true);
        C1429x0.m7389e(true);
        if (C11636a.m43289a()) {
            return;
        }
        C1408n.m7335d(true);
    }
}
