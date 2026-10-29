package je;

import ge.n;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public abstract OutputStream a();

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public void b(byte[] bArr) throws X {
        n.l(bArr);
        f fVarA = f.a();
        try {
            OutputStream outputStream = (OutputStream) fVarA.b(a());
            outputStream.write(bArr);
            outputStream.flush();
            fVarA.close();
        } catch (Throwable th2) {
            try {
                throw fVarA.c(th2);
            } catch (Throwable th3) {
                fVarA.close();
                throw th3;
            }
        }
    }
}
