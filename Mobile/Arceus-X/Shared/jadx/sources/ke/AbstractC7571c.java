package ke;

import java.io.InputStream;
import java.io.OutputStream;
import p169he.C6384n;

/* JADX INFO: renamed from: ke.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7571c {
    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    /* JADX INFO: renamed from: a */
    public long m31366a(AbstractC7570b abstractC7570b) throws X {
        C6384n.m27928l(abstractC7570b);
        C7574f c7574fM31373a = C7574f.m31373a();
        try {
            long jM31369b = C7572d.m31369b((InputStream) c7574fM31373a.m31374b(mo31367b()), (OutputStream) c7574fM31373a.m31374b(abstractC7570b.mo31364a()));
            c7574fM31373a.close();
            return jM31369b;
        } catch (Throwable th2) {
            try {
                throw c7574fM31373a.m31375c(th2);
            } catch (Throwable th3) {
                c7574fM31373a.close();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InputStream mo31367b();
}
