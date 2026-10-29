package pe;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: pe.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10222f0 {
    /* JADX INFO: renamed from: a */
    public static C10235p m39312a(String str) throws GeneralSecurityException {
        try {
            return C10235p.m39360u(C10230k.m39330m(str));
        } catch (IOException unused) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
