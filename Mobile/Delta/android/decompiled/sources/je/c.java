package je;

import ge.n;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public long a(b bVar) throws X {
        n.l(bVar);
        f fVarA = f.a();
        try {
            long jB = d.b((InputStream) fVarA.b(b()), (OutputStream) fVarA.b(bVar.a()));
            fVarA.close();
            return jB;
        } catch (Throwable th2) {
            try {
                throw fVarA.c(th2);
            } catch (Throwable th3) {
                fVarA.close();
                throw th3;
            }
        }
    }

    public abstract InputStream b();
}
