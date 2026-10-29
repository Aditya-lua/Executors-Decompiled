package af;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f513a = b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
    public static final String b = b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f514c = b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f515d = b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f516e = b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f517f = b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f518g = b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f519h = b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ze.q0 f520i = ze.q0.a0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final ze.q0 f521j = ze.q0.a0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ze.q0 f522k = ze.q0.a0();

    static {
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        c();
    }

    public static String b(String str) {
        return str;
    }

    public static void c() throws GeneralSecurityException {
        g0.d();
        i0.d();
        g.e(true);
        p0.e(true);
        x0.e(true);
        if (se.a.a()) {
            return;
        }
        n.d(true);
    }
}
