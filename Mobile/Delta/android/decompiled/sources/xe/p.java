package xe;

import af.q0;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f35730a = b("type.googleapis.com/google.crypto.tink.HmacKey");

    @Deprecated
    public static final q0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final q0 f35731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final q0 f35732d;

    static {
        q0 q0VarA0 = q0.a0();
        b = q0VarA0;
        f35731c = q0VarA0;
        f35732d = q0VarA0;
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
        t.d();
        h.d();
        n.e(true);
        if (te.a.a()) {
            return;
        }
        e.h(true);
    }
}
