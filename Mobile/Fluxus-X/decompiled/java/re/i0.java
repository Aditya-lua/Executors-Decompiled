package re;

import cf.j0;
import cf.k0;
import cf.p0;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f30677a = Charset.forName("UTF-8");

    public static k0.c a(j0.c cVar) {
        return k0.c.e0().H(cVar.e0().f0()).G(cVar.h0()).F(cVar.g0()).D(cVar.f0()).build();
    }

    public static k0 b(j0 j0Var) {
        k0.b bVarF = k0.e0().F(j0Var.h0());
        Iterator<j0.c> it = j0Var.g0().iterator();
        while (it.hasNext()) {
            bVarF.D(a(it.next()));
        }
        return bVarF.build();
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Barcode.FORMAT_UPC_E];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static void d(j0.c cVar) throws GeneralSecurityException {
        if (!cVar.i0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.f0())));
        }
        if (cVar.g0() == p0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.f0())));
        }
        if (cVar.h0() == cf.g0.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.f0())));
        }
    }

    public static void e(j0 j0Var) {
        int iH0 = j0Var.h0();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (j0.c cVar : j0Var.g0()) {
            if (cVar.h0() == cf.g0.ENABLED) {
                d(cVar);
                if (cVar.f0() == iH0) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (cVar.e0().e0() != cf.f0.c.ASYMMETRIC_PUBLIC) {
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
