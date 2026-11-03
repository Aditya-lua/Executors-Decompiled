package x5;

/* JADX INFO: loaded from: classes.dex */
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f35404a;
    public static final b.C0647b b;

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f35405a;

            public a(Throwable th2) {
                this.f35405a = th2;
            }

            public String toString() {
                return "FAILURE (" + this.f35405a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: x5.a0$b$b, reason: collision with other inner class name */
        public static final class C0647b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0647b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }

    static {
        f35404a = new b.c();
        b = new b.C0647b();
    }
}
