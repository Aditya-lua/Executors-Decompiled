package oe;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {
    public static p a(String str) throws GeneralSecurityException {
        try {
            return p.u(k.m(str));
        } catch (IOException unused) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
