package pe;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: pe.g0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10224g0 {
    /* JADX INFO: renamed from: a */
    public static C10235p m39313a(byte[] bArr, C10218d0 c10218d0) throws GeneralSecurityException {
        if (c10218d0 == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        try {
            return C10217d.m39307a(C10213b.m39296b(bArr));
        } catch (IOException unused) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m39314b(C10235p c10235p, C10218d0 c10218d0) throws GeneralSecurityException {
        if (c10218d0 == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C10217d.m39308b(c10235p, C10215c.m39303c(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new GeneralSecurityException("Serialize keyset failed");
        }
    }
}
