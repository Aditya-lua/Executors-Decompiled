package pe;

import af.C0218f0;
import af.C0226j0;
import af.C0228k0;
import af.EnumC0220g0;
import af.EnumC0238p0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: renamed from: pe.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10228i0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f36829a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static C0228k0.c m39317a(C0226j0.c cVar) {
        return C0228k0.c.m850e0().m858G(cVar.m816e0().m722f0()).m857E(cVar.m819h0()).m856D(cVar.m818g0()).m855C(cVar.m817f0()).build();
    }

    /* JADX INFO: renamed from: b */
    public static C0228k0 m39318b(C0226j0 c0226j0) {
        C0228k0.b bVarM844D = C0228k0.m839e0().m844D(c0226j0.m805h0());
        Iterator<C0226j0.c> it = c0226j0.m804g0().iterator();
        while (it.hasNext()) {
            bVarM844D.m843C(m39317a(it.next()));
        }
        return bVarM844D.build();
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m39319c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m39320d(C0226j0.c cVar) throws GeneralSecurityException {
        if (!cVar.m820i0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.m817f0())));
        }
        if (cVar.m818g0() == EnumC0238p0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.m817f0())));
        }
        if (cVar.m819h0() == EnumC0220g0.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.m817f0())));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m39321e(C0226j0 c0226j0) {
        int iM805h0 = c0226j0.m805h0();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (C0226j0.c cVar : c0226j0.m804g0()) {
            if (cVar.m819h0() == EnumC0220g0.ENABLED) {
                m39320d(cVar);
                if (cVar.m817f0() == iM805h0) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (cVar.m816e0().m721e0() != C0218f0.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
