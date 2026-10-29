package p544xe;

import af.C0240q0;
import java.security.GeneralSecurityException;
import p447te.C11636a;

/* JADX INFO: renamed from: xe.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C12818p {

    /* JADX INFO: renamed from: a */
    public static final String f45603a = m47737b("type.googleapis.com/google.crypto.tink.HmacKey");

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final C0240q0 f45604b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final C0240q0 f45605c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final C0240q0 f45606d;

    static {
        C0240q0 c0240q0M946a0 = C0240q0.m946a0();
        f45604b = c0240q0M946a0;
        f45605c = c0240q0M946a0;
        f45606d = c0240q0M946a0;
        try {
            m47736a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m47736a() throws GeneralSecurityException {
        m47738c();
    }

    /* JADX INFO: renamed from: b */
    public static String m47737b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static void m47738c() throws GeneralSecurityException {
        C12822t.m47739d();
        C12810h.m47708d();
        C12816n.m47723e(true);
        if (C11636a.m43289a()) {
            return;
        }
        C12807e.m47697h(true);
    }
}
