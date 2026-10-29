package p379qe;

import af.C0240q0;
import java.security.GeneralSecurityException;
import p447te.C11636a;
import p544xe.C12818p;

/* JADX INFO: renamed from: qe.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10505a {

    /* JADX INFO: renamed from: a */
    public static final String f37724a = m40335b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");

    /* JADX INFO: renamed from: b */
    public static final String f37725b = m40335b("type.googleapis.com/google.crypto.tink.AesGcmKey");

    /* JADX INFO: renamed from: c */
    public static final String f37726c = m40335b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");

    /* JADX INFO: renamed from: d */
    public static final String f37727d = m40335b("type.googleapis.com/google.crypto.tink.AesEaxKey");

    /* JADX INFO: renamed from: e */
    public static final String f37728e = m40335b("type.googleapis.com/google.crypto.tink.KmsAeadKey");

    /* JADX INFO: renamed from: f */
    public static final String f37729f = m40335b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");

    /* JADX INFO: renamed from: g */
    public static final String f37730g = m40335b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");

    /* JADX INFO: renamed from: h */
    public static final String f37731h = m40335b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");

    /* JADX INFO: renamed from: i */
    @Deprecated
    public static final C0240q0 f37732i;

    /* JADX INFO: renamed from: j */
    @Deprecated
    public static final C0240q0 f37733j;

    /* JADX INFO: renamed from: k */
    @Deprecated
    public static final C0240q0 f37734k;

    static {
        C0240q0 c0240q0M946a0 = C0240q0.m946a0();
        f37732i = c0240q0M946a0;
        f37733j = c0240q0M946a0;
        f37734k = c0240q0M946a0;
        try {
            m40334a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m40334a() throws GeneralSecurityException {
        m40336c();
    }

    /* JADX INFO: renamed from: b */
    public static String m40335b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static void m40336c() throws GeneralSecurityException {
        C10517e.m40348d();
        C12818p.m47738c();
        C10532j.m40377d(true);
        C10562t.m40488e(true);
        if (C11636a.m43289a()) {
            return;
        }
        C10547o.m40437e(true);
        C10573y.m40528e(true);
        C10515d0.m40347f(true);
        C10527h0.m40368f(true);
        C10539l0.m40422f(true);
        C10561s1.m40483f(true);
        C10546n1.m40432d(true);
    }
}
