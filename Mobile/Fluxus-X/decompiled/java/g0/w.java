package g0;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    public static abstract class a {
        public static a a(int i10) {
            return b(i10, null);
        }

        public static a b(int i10, Throwable th2) {
            return new f(i10, th2);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static w a(b bVar) {
        return b(bVar, null);
    }

    public static w b(b bVar, a aVar) {
        return new e(bVar, aVar);
    }

    public abstract a c();

    public abstract b d();
}
