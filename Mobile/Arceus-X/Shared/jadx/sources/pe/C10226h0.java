package pe;

import af.C0222h0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.io.IOException;
import java.security.GeneralSecurityException;
import p515we.C12364d0;
import p515we.C12382m0;
import p515we.C12389q;

/* JADX INFO: renamed from: pe.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10226h0 {
    /* JADX INFO: renamed from: a */
    public static AbstractC10243x m39315a(byte[] bArr) throws GeneralSecurityException {
        try {
            return C12364d0.m46238c().m46244i(C12382m0.m46402b(C0222h0.m759j0(bArr, C2944p.m14035b())));
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m39316b(AbstractC10243x abstractC10243x) {
        return abstractC10243x instanceof C12389q ? ((C12389q) abstractC10243x).m46421b().m46404d().m13375n() : ((C12382m0) C12364d0.m46238c().m46250o(abstractC10243x, C12382m0.class)).m46404d().m13375n();
    }
}
