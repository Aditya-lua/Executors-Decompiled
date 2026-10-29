package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: pe.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10218d0 {

    /* JADX INFO: renamed from: a */
    public static final C10218d0 f36826a = new C10218d0();

    /* JADX INFO: renamed from: a */
    public static C10218d0 m39309a() {
        return f36826a;
    }

    /* JADX INFO: renamed from: b */
    public static C10218d0 m39310b(C10218d0 c10218d0) throws GeneralSecurityException {
        if (c10218d0 != null) {
            return c10218d0;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
