package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28419a = b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
    public static final String b = b("type.googleapis.com/google.crypto.tink.AesGcmKey");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28420c = b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f28421d = b("type.googleapis.com/google.crypto.tink.AesEaxKey");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28422e = b("type.googleapis.com/google.crypto.tink.KmsAeadKey");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f28423f = b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f28424g = b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f28425h = b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final ze.q0 f28426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final ze.q0 f28427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final ze.q0 f28428k;

    static {
        ze.q0 q0VarA0 = ze.q0.a0();
        f28426i = q0VarA0;
        f28427j = q0VarA0;
        f28428k = q0VarA0;
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
        e.d();
        we.p.c();
        j.d(true);
        t.e(true);
        if (se.a.a()) {
            return;
        }
        o.e(true);
        y.e(true);
        d0.f(true);
        h0.f(true);
        l0.f(true);
        s1.f(true);
        n1.d(true);
    }
}
