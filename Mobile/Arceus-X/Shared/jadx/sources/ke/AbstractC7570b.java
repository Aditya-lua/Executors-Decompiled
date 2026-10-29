package ke;

import java.io.OutputStream;
import p169he.C6384n;

/* JADX INFO: renamed from: ke.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7570b {
    /* JADX INFO: renamed from: a */
    public abstract OutputStream mo31364a();

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    /* JADX INFO: renamed from: b */
    public void m31365b(byte[] bArr) throws X {
        C6384n.m27928l(bArr);
        C7574f c7574fM31373a = C7574f.m31373a();
        try {
            OutputStream outputStream = (OutputStream) c7574fM31373a.m31374b(mo31364a());
            outputStream.write(bArr);
            outputStream.flush();
            c7574fM31373a.close();
        } catch (Throwable th2) {
            try {
                throw c7574fM31373a.m31375c(th2);
            } catch (Throwable th3) {
                c7574fM31373a.close();
                throw th3;
            }
        }
    }
}
