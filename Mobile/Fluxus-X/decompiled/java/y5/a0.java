package y5;

/* JADX INFO: loaded from: classes.dex */
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f37450a;
    public static final b.C0766b b;

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f37451a;

            public a(Throwable th2) {
                this.f37451a = th2;
            }

            public String toString() {
                return "FAILURE (" + this.f37451a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: y5.a0$b$b, reason: collision with other inner class name */
        public static final class C0766b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0766b() {
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
        f37450a = new b.c();
        b = new b.C0766b();
    }
}
