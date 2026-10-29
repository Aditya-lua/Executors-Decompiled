package p515we;

/* JADX INFO: renamed from: we.r0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C12392r0 extends RuntimeException {

    /* JADX INFO: renamed from: we.r0$a */
    public interface a<T> {
        T get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12392r0(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m46444a(a<T> aVar) {
        try {
            return aVar.get();
        } catch (Exception e10) {
            throw new C12392r0(e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12392r0(String str, Throwable th2) {
        super(str, th2);
    }

    public C12392r0(Throwable th2) {
        super(th2);
    }
}
