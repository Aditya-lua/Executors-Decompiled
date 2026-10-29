package p536x5;

/* JADX INFO: renamed from: x5.a0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC12689a0 {

    /* JADX INFO: renamed from: a */
    public static final b.c f45211a;

    /* JADX INFO: renamed from: b */
    public static final b.C14283b f45212b;

    /* JADX INFO: renamed from: x5.a0$b */
    public static abstract class b {

        /* JADX INFO: renamed from: x5.a0$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            public final Throwable f45213a;

            public a(Throwable th2) {
                this.f45213a = th2;
            }

            public String toString() {
                return "FAILURE (" + this.f45213a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: x5.a0$b$b, reason: collision with other inner class name */
        public static final class C14283b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C14283b() {
            }
        }

        /* JADX INFO: renamed from: x5.a0$b$c */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public c() {
            }
        }
    }

    static {
        f45211a = new b.c();
        f45212b = new b.C14283b();
    }
}
