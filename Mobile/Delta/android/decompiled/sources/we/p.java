package we;

import java.security.GeneralSecurityException;
import ze.q0;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f34231a = b("type.googleapis.com/google.crypto.tink.HmacKey");

    @Deprecated
    public static final q0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final q0 f34232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final q0 f34233d;

    static {
        q0 q0VarA0 = q0.a0();
        b = q0VarA0;
        f34232c = q0VarA0;
        f34233d = q0VarA0;
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
        if (se.a.a()) {
            return;
        }
        e.h(true);
    }
}
