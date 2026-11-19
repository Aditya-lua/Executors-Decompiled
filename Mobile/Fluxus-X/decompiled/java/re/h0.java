package re;

import java.io.IOException;
import java.security.GeneralSecurityException;
import ye.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {
    public static x a(byte[] bArr) throws GeneralSecurityException {
        try {
            return ye.d0.c().i(m0.b(cf.h0.j0(bArr, com.google.crypto.tink.shaded.protobuf.p.b())));
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] b(x xVar) {
        return xVar instanceof ye.q ? ((ye.q) xVar).b().d().n() : ((m0) ye.d0.c().o(xVar, m0.class)).d().n();
    }
}
