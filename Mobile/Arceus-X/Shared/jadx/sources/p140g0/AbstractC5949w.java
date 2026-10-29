package p140g0;

/* JADX INFO: renamed from: g0.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5949w {

    /* JADX INFO: renamed from: g0.w$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public static a m26674a(int i10) {
            return m26675b(i10, null);
        }

        /* JADX INFO: renamed from: b */
        public static a m26675b(int i10, Throwable th2) {
            return new C5881f(i10, th2);
        }

        /* JADX INFO: renamed from: c */
        public abstract Throwable mo26329c();

        /* JADX INFO: renamed from: d */
        public abstract int mo26330d();
    }

    /* JADX INFO: renamed from: g0.w$b */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC5949w m26672a(b bVar) {
        return m26673b(bVar, null);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC5949w m26673b(b bVar, a aVar) {
        return new C5877e(bVar, aVar);
    }

    /* JADX INFO: renamed from: c */
    public abstract a mo26327c();

    /* JADX INFO: renamed from: d */
    public abstract b mo26328d();
}
