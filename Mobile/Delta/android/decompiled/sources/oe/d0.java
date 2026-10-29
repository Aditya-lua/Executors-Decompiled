package oe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f27343a = new d0();

    public static d0 a() {
        return f27343a;
    }

    public static d0 b(d0 d0Var) throws GeneralSecurityException {
        if (d0Var != null) {
            return d0Var;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
