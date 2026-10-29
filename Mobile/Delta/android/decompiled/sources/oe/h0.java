package oe;

import java.io.IOException;
import java.security.GeneralSecurityException;
import ve.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {
    public static x a(byte[] bArr) throws GeneralSecurityException {
        try {
            return ve.d0.c().i(m0.b(ze.h0.j0(bArr, com.google.crypto.tink.shaded.protobuf.p.b())));
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] b(x xVar) {
        return xVar instanceof ve.q ? ((ve.q) xVar).b().d().n() : ((m0) ve.d0.c().o(xVar, m0.class)).d().n();
    }
}
