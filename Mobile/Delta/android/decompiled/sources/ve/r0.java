package ve;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends RuntimeException {

    public interface a<T> {
        T get();
    }

    public r0(String str) {
        super(str);
    }

    public static <T> T a(a<T> aVar) {
        try {
            return aVar.get();
        } catch (Exception e10) {
            throw new r0(e10);
        }
    }

    public r0(String str, Throwable th2) {
        super(str, th2);
    }

    public r0(Throwable th2) {
        super(th2);
    }
}
